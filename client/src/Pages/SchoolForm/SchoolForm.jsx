import { useState } from "react";
import "./SchoolForm.css";

const SchoolForm = () => {
    const [formData, setFormData] = useState({
        name: "",
        domain: "",
        description: "",
        // coursesId: "",
        // usersId: "",
        moodleToken: "",
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        if (name === "coursesId" || name === "usersId") {
            setFormData({
                ...formData,
                [name]: value.split(",").map((id) => parseInt(id.trim(), 10)),
            });
        } else {
            setFormData({ ...formData, [name]: value });
        }
    };

    const handleSubmit = async (e) => {
        e.preventDefault();
        console.log("Form Data Submitted:", formData);

        try {
            const response = await fetch("http://localhost:8080/api/schools", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json",
                },
                body: JSON.stringify(formData),
            });

            if (response.ok) {
                alert("School Created Successfully!");
                setFormData({
                    name: "",
                    domain: "",
                    description: "",
                    coursesId: "",
                    usersId: "",
                    moodleToken: "",
                });
            } else {
                alert("Error creating school");
            }
        } catch (error) {
            console.error("Error:", error);
            alert("Failed to submit");
        }
    };

    return (
        <div className="container">
            <div className="form-container">
                <h2 className="form-title">Create a New School 🏫</h2>
                <form onSubmit={handleSubmit} className="form">
                    <label>School Name</label>
                    <input type="text" name="name" value={formData.name} onChange={handleChange} required />

                    <label>Domain</label>
                    <input type="text" name="domain" value={formData.domain} onChange={handleChange} required />

                    <label>Description</label>
                    <textarea name="description" value={formData.description} onChange={handleChange} rows="4" required></textarea>

                    {/*<label>Courses ID (comma-separated)</label>*/}
                    {/*<input type="text" name="coursesId" value={formData.coursesId} onChange={handleChange} />*/}

                    {/*<label>Users ID (comma-separated)</label>*/}
                    {/*<input type="text" name="usersId" value={formData.usersId} onChange={handleChange} />*/}

                    <label>Moodle Token</label>
                    <input type="text" name="moodleToken" value={formData.moodleToken} onChange={handleChange} />

                    <button type="submit" className="submit-button">🚀 Create School</button>
                </form>
            </div>
        </div>
    );
};

export default SchoolForm;
