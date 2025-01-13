import React from "react";
import "../authentification.css";
import "/src/Pages/Log in/style.css";
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
						<a href="/Sign_up">Create here!</a>
					</p>

					<p class="forgotten_pass_par">
						Forgot your password? <br />{" "}
						<a href="/Forgot_password">Create another!</a>
					</p>
				</div>
			</div>
		</>
	);
}
