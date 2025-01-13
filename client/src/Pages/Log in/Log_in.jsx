import React from "react";
import { Link } from "react-router-dom";
import "../authentification.css";
import "../Log in/style.css";
export default function Log_in() {
	return (
		<>
			<div className="container">
				<h1>Log in</h1>
				<form>
					<div className="email-container">
						<label htmlFor="email">Enter your email:</label>
						<br />
						<input
							type="email"
							id="email"
							name="email"
							placeholder="email"
							className="input"
						/>
						<br />
					</div>

					<div className="pass-container">
						<label htmlFor="pass">Enter your password:</label>
						<br />
						<input
							type="password"
							id="pass "
							name="pass"
							placeholder="password"
							className="input"
						/>
						<br />
						<input type="submit" value="Submit" className="submit" />
					</div>
				</form>

				<div className="problematic-account">
					<p>
						No account?
						<br />
						<Link to={"/signup"}>Create here!</Link>
					</p>

					<p class="forgotten_pass_par">
						Forgot your password? <br />
						<Link to={"/forgottenpassword"}>Create another!</Link>
					</p>
				</div>
			</div>
		</>
	);
}
