		var openLoginBtn = document.getElementById('openLoginForm');
		var closeLoginBtn = document.getElementById('closeLoginForm');
		var cancelLoginBtn = document.getElementById('cancelLogin');
		var loginForm = document.getElementById('loginForm');
		var openSignupBtn = document.getElementById('openSignupForm');
		var closeSignupBtn = document.getElementById('closeSignupForm');
		var cancelSignupBtn = document.getElementById('cancelSignup');
		var signupForm = document.getElementById('signupForm');

		openForm = function(form) {
			form.style.display = "block";
		}

		closeForm = function(form) {
			form.style.display = "none";
		}

		openLoginBtn.onclick = function() {
			openForm(loginForm);
		}

		closeLoginBtn.onclick = function() {
			closeForm(loginForm);
		}

		cancelLoginBtn.onclick = function() {
			closeForm(loginForm);
		}

		openSignupBtn.onclick = function() {
			openForm(signupForm);
		}

		closeSignupBtn.onclick = function() {
			closeForm(signupForm);
		}

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