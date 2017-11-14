<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html lang="en">
<title>Icelandic for Beginners</title>

<meta charset="UTF-8">
<meta name="description" content="Learn Icelandic for Beginners">
<meta name="keywords"
	content="Icelandic, Beginners' Icelandic, Learn Icelandic">
<meta name="author" content="Arn�r Kristmundsson">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
<!-- Custom CSS -->
<!--link rel="stylesheet" href="style.css"-->

<style type="text/css">
	.row {
		margin-top: 25px;
		margin-bottom: 25px;
	}

	h1 {
		text-align: center;
		margin-top: 30px;
		margin-bottom: 50px;
	}

	.block{
		display: inline-block;
		width: 250px;
	}

</style>

<body>
	<form method="POST" action="valmynd">
	<div class="container">
		<div class="row align-items-center">
			<div class="col-sm">
				<h1 class="animate-top">Multiple Choice Questions</h1>
				<div class="block">
					<h2 class="animate-top">Fruits</h2>
					<hr>
					<button type="submit" name="button" value="button1" class="btn btn-success">Start</button>
				</div>
				<div class="block">
					<h2 class="animate-top">Numbers</h2>
					<hr>
					<button type="submit" name="button" value="button2" class="btn btn-success">Start</button>
			  </div>
			</div>
		</div>
		<div class="row align-items-center">
			<div class="col-sm">
				<h1 class="animate-top">Fill in the right word</h1>
				<div class="block">
					<h2 class="animate-top">Nouns</h2>
					<hr>
					<button type="submit" name="button" value="button3" class="btn btn-success">Start</button>
				</div>
				<div class="block">
					<h2 class="animate-top">Verbs</h2>
					<hr>
					<button type="submit" name="button" value="button4" class="btn btn-success">Start</button>
				</div>
			</div>
		</div>


	</div>
	</form>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
</body>
