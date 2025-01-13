import React from "react";
import "/src/Pages/Contact/contact.css";

export default function Contact() {
	return (
		<>
			<div className="info-container">
				<p>Location: 39 Tsarigrdsko shose, Sofia, Bulgaria</p>

				<p>
					Phone: <span>0884838348</span>
				</p>
				<p>
					Hours: <span>10:00</span>AM - <span>19:00</span>PM
				</p>
			</div>
			<div className="contact_container">
				<form className="contact_form" action="">
					<img src="/src/assets/office.jpg" alt="img" className="form_img" />
					<div className="contact-details">
						<legend>Contact Form</legend>
						<label htmlFor="fname">Full name: </label>
						<input type="text" id="fname" name="fname" placeholder="name" />
						<br />
						<label htmlFor="email">Email:</label>
						<input type="email" id="email " name="email" placeholder="email" />
						<br />
						<label htmlFor="messageInput">Message :</label>
						<input
							type="text"
							id="messageInput"
							name="text"
							placeholder="message"
							className="input"
						/>
						<br />
						<input type="submit" value="Submit" className="submit" />
					</div>
				</form>
			</div>
		</>
	);
}
