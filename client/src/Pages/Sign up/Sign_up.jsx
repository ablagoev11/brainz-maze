import React from "react";
import { Link } from "react-router-dom";
import "../authentification.css";
import "/src/Pages/Sign up/style.css";
export default function Sign_up() {
	return (
		<>
			<div className="container">
				<h1>Sign up</h1>
				<form>
					<div className="email-container">
						<label htmlFor="fname">Enter your first name:</label>
						<br />
						<input
							type="text"
							id="fname"
							name="fname"
							placeholder="First name"
							className="input"
						/>
						<br />
						<label htmlFor="lname">Enter your last name:</label>
						<br />
						<input
							type="text"
							id="lname"
							name="lname"
							placeholder="Last name"
							className="input"
						/>
						<br />
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
						<label htmlFor="pass">Enter your new password:</label>
						<br />
						<input
							type="password"
							id="pass "
							name="pass"
							placeholder="password"
							className="input"
						/>
						<br />
						<label htmlFor="pass">Reenter password:</label>
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
					<p class="forgotten_pass_par">
						Forgot your password? <br />{" "}
						<Link to={"/forgottenpassword"}>Create another!</Link>
					</p>
				</div>
			</div>
		</>
	);
}
