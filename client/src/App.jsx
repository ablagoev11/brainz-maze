import Card from "./Cards/Card";
import Subjects from "./Cards/Subjects";
import SchoolForm from "./Pages/SchoolForm/SchoolForm.jsx";
import SchoolShow from "./Pages/SchoolShow/SchoolShow.jsx";
function App() {
	return (
		<>
			<SchoolForm />
			<SchoolShow/>
			<Card
				cardImgUrl={Subjects[0].cardImgUrl}
				cardTitle={Subjects[0].cardTitle}
				cardDescription={Subjects[0].cardDescription}
			/>
			<Card
				cardImgUrl={Subjects[1].cardImgUrl}
				cardTitle={Subjects[1].cardTitle}
				cardDescription={Subjects[1].cardDescription}
			/>

		</>

	);
}

export default App;
