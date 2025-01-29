import { useState } from "react";
import "../SchoolForm/SchoolForm.css";

const SchoolShow = () => {
    const [domain, setDomain] = useState("");
    const [school, setSchool] = useState(null);
    const [error, setError] = useState("");

    const handleSearch = async () => {
        if (!domain) {
            setError("Please enter a domain");
            return;
        }
        setError("");
        setSchool(null);

        try {
            const response = await fetch(`http://localhost:8080/api/schools/domain/${domain}`);
            if (!response.ok) {
                throw new Error("School not found");
            }
            const data = await response.json();
            setSchool(data);
        } catch (err) {
            setError(err.message);
        }
    };

    return (
        <div className="container">
            <div className="form-container">
                <h2 className="form-title">Find a School 🏫</h2>
                <div className="form">
                    <label>Enter School Domain</label>
                    <input
                        type="text"
                        value={domain}
                        onChange={(e) => setDomain(e.target.value)}
                        placeholder="e.g., schoolwebsite.com"
                    />
                    <button className="submit-button" onClick={handleSearch}>
                        🔍 Search School
                    </button>
                    {error && <p className="error-message">{error}</p>}
                    {school && (
                        <div className="school-details">
                            <h3>{school.name}</h3>
                            <p><strong>Domain:</strong> {school.domain}</p>
                            <p><strong>Description:</strong> {school.description}</p>
                            <p><strong>Moodle Token:</strong> {school.moodleToken}</p>
                        </div>
                    )}
                </div>
            </div>
        </div>
    );
};

export default SchoolShow;
