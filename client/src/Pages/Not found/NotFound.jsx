import { Link } from "react-router-dom";
import React from "react";
import "../Not found/notFound.css";
const NotFound = () => {
	return (
		<>
			<div className="not-found-container ">
				404 Not Found
				<Link to="/">
					<button className="home-page btn">Home Page</button>
				</Link>
			</div>
		</>
	);
};

export default NotFound;
