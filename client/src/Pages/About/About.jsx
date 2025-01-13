import React from "react";
import "/src/Pages/About/about.css";
export default function About() {
	return (
		<>
			<div className="about_conatiner">
				<img src="/src/assets/About.png" alt="about" className="about_img" />
				<h1 className="about_title">About </h1>
				<p className="about_para">
					Our learning app is designed to make education engaging and accessible
					for everyone. With interactive lessons, quizzes, and personalized
					progress tracking, it helps users master new skills at their own pace.
					<span>Start</span> learning <span>today</span> and unlock your full
					potential!
				</p>
			</div>
		</>
	);
}
