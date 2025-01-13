import "/src/Cards/style.css";

function Card(props) {
	return (
		<div className="card">
			<img className="card-image" src={props.cardImgUrl} alt="quiz picture" />
			<h2 className="card-title">{props.cardTitle}</h2>
			<p className="card-description">{props.cardDescription}</p>
			<button className="card-button">Click Me</button>
		</div>
	);
}
export default Card;
