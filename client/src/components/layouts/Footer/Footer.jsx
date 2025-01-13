import "../Footer/footer.css";
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></link>
function Footer() {
	return (
		<div className="footer_container">
			<footer>
				<img src="/src/assets/bm.webp" alt="iamge" class="footer_img" />
				<div className="icons_container">
					<i class="fa-brands fa-facebook"></i>
				</div>
				<ul className="info">
					<li>
						<a href="">Home</a>
					</li>
					<li>
						<a href="">About</a>
					</li>
					<li>
						<a href="">Services</a>
					</li>
					<li>
						<a href="">Contact</a>
					</li>
				</ul>
				<p>&copy; {new Date().getFullYear()} Brainz Maze </p>
			</footer>
		</div>
	);
}

export default Footer;
