import React from "react";
import "./header.css";
function Header() {
	return (
		<>
			<header className="nav-bar">
				<h1 className="nav-title">BrainzMaze</h1>
				<input id="nav-search-field" type="text" placeholder="Search" />
				<div className="nav-btns btns">
					<button className="log-in-btn btn">
						<a href=""></a>Log in
					</button>
					<button className="sign-up-btn btn">
						<a href=""></a>Sign up
					</button>
				</div>
			</header>
		</>
	);
}

export default Header;
