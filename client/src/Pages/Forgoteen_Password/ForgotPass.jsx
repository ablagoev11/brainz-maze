import React from "react";
import "../authentification.css";
import "/src/Pages/Forgoteen_Password/style.css";

export default function ForgotPass() {
	return (
		<>
			<div className="container">
				<h1>Forgotten Password</h1>
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
					</div>

					<div className="pass-container">
						<label htmlFor="pass">Enter your new password:</label>
						<br />
						<input
							type="password"
							id="pass "
							name="pass"
							placeholder="new password"
							className="input"
						/>
						<br /> <br />
						<label htmlFor="pass">Reenter your password:</label>
						<br />
						<input
							type="password"
							id="pass "
							name="pass"
							placeholder="new password"
							className="input"
						/>
						<br />
						<input type="submit" value="Submit" className="submit" />
					</div>
				</form>

				<div className="problematic-account">
					<p>
						No account?
						<a href="/Sign_up">
							<br />
							Create here!
						</a>
					</p>
				</div>
			</div>
		</>
	);
}
