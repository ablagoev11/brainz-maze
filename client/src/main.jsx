import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import { createBrowserRouter, RouterProvider } from "react-router-dom";
import App from "./App.jsx";
import Log_In from "/src/Pages/Log in/Log_in.jsx";
import Sign_up from "/src/Pages/Sign up/Sign_up.jsx";
import ForgotPass from "/src/Pages/Forgoteen_Password/ForgotPass.jsx";
import NotFound from "./Pages/Not found/NotFound.jsx";
import About from "./Pages/About/About.jsx";
import Contact from "./Pages/Contact/Contact.jsx";

const router = createBrowserRouter([
	{
		path: "/",
		element: <Log_In />,
		errorElement: <NotFound />,
	},
	{
		path: "/signup",
		element: <Sign_up />,
		errorElement: <NotFound />,
	},
	{
		path: "/forgottenpassword",
		element: <ForgotPass />,
		errorElement: <NotFound />,
	},
	{
		path: "/about",
		element: <About />,
		errorElement: <NotFound />,
	},
	{
		path: "/contact",
		element: <Contact />,
		errorElement: <NotFound />,
	},
]);

createRoot(document.getElementById("root")).render(
	<StrictMode>
		<RouterProvider router={router} />
	</StrictMode>
);
