// Get the openLogin button
var openLoginBtn = document.getElementById('openLoginForm');

//Get the closeLogin button
var closeLoginBtn = document.getElementById('closeLoginForm');

//Get the cancelLogin button
var cancelLoginBtn = document.getElementById('cancelLogin');

// Get the modalLoginForm
var loginForm = document.getElementById('loginForm');

// Get the openSignup button
var openSignupBtn = document.getElementById('openSignupForm');

//Get the closeSignup button
var closeSignupBtn = document.getElementById('closeSignupForm');

//Get the cancelSignup button
var cancelSignupBtn = document.getElementById('cancelSignup');

// Get the modalSignupForm
var signupForm = document.getElementById('signupForm');

openForm = function(form){
	form.style.display = "block";
}

closeForm = function(form){
	form.style.display = "none";
}

// When the user clicks on the openLogin button, open the modalLoginForm
openLoginBtn.onclick = function() {
	openForm(loginForm);
}

//When the user clicks on the closeLogin button, close the modalLoginForm
closeLoginBtn.onclick = function() {
	closeForm(loginForm);
}

//When the user clicks on the cancelLogin button, close the modalLoginForm
cancelLoginBtn.onclick = function() {
	closeForm(loginForm);
}

// When the user clicks on the openSignup button, open the modalSignupForm
openSignupBtn.onclick = function() {
	openForm(signupForm);
}

//When the user clicks on the closeSignup button, close the modalSignupForm
closeSignupBtn.onclick = function() {
	closeForm(signupForm);
}

//When the user clicks on the cancelSignup button, close the modalSignupForm
cancelSignupBtn.onclick = function() {
	closeForm(signupForm);
}

// When the user clicks anywhere outside of the form, close it
window.onclick = function(event) {
	if (event.target == loginForm)
		closeForm(loginForm);
	if (event.target == signupForm)
		closeForm(signupForm);
}