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
<<<<<<< HEAD
	.hiddendiv{
		display:none;
	}
	
	.disable{
		background: rgb(245, 38, 38);
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


	.col-sm{
		text-align: center;
	 }
	.btn {
		cursor: pointer;
	}

=======
>>>>>>> parent of aaa475c... Uppfærði útlitið á valmynd
</style>

<body>
	<form method="POST" action="valmynd">
	<div class="container">
		<div class="row align-items-center">
			<div class="col-sm">
<<<<<<< HEAD
				<h1 class="animate-top">Multiple Choice Questions</h1>
				<div class="block">
					<h2 class="animate-top">Fruits</h2>
					<hr>
					<button type="submit" name="button" value="button1" class="btn">Start</button>
				</div>
				<div class="block">
					<h2 class="animate-top">Numbers</h2>
					<hr>
					<button type="submit" name="button" value="button2" class="btn">Start</button>
			  </div>
			  <div class="block">
					<h2 class="animate-top">Animals</h2>
					<hr>
					<button type="submit" name="button" value="button3" class="btn">Start</button>
			  </div>
=======
				<h1 class="animate-top">Exercise 1</h1>
				<h2 class="animate-top">Fruits</h2>
				<hr>
				<button type="submit" name="button" value="button1" class="btn btn-success">Start</button>
>>>>>>> parent of aaa475c... Uppfærði útlitið á valmynd
			</div>
		</div>
		<div class="row align-items-center">
			<div class="col-sm">
<<<<<<< HEAD
				<h1 class="animate-top">Fill in the right word</h1>
				<div class="block">
					<h2 class="animate-top">Nouns</h2>
					<hr>
					<button type="submit" name="button" value="button4" class="btn">Start</button>
				</div>
				<div class="block">
					<h2 class="animate-top">Verbs</h2>
					<hr>
					<button type="submit" name="button" value="button5" class="btn">Start</button>
				</div>
=======
				<h1 class="animate-top">Exercise 2</h1>
				<h2 class="animate-top">Numbers</h2>
				<hr>
				<button type="submit" name="button" value="button2" class="btn btn-success">Start</button>
			</div>
		</div>
		<div class="row align-items-center">
			<div class="col-sm">
				<h1 class="animate-top">Exercise 3</h1>
				<h2 class="animate-top">Basic Phrases</h2>
				<hr>
				<button type="submit" name="button" value="button3" class="btn btn-success">Start</button>
			</div>
		</div>
		<div class="row align-items-center">
			<div class="col-sm">
				<h1 class="animate-top">Exercise 4</h1>
				<h2 class="animate-top">Essential Pickup Lines</h2>
				<hr>
				<button type="submit" name="button" value="button4" class="btn btn-success">Start</button>
>>>>>>> parent of aaa475c... Uppfærði útlitið á valmynd
			</div>
		</div>
	</div>
	</form>
	<div class="hiddendiv">${i}</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<<<<<<< HEAD
	<script>
		var buttons = [];
		buttons = document.querySelectorAll("button");
		var e = parseInt(document.querySelector(".hiddendiv").innerText);
		console.log(e);
		if(e < 13){
			buttons[0].classList.add('btn-success');
		}
		if(e > 12){
			buttons[0].classList.add('btn-success');
			buttons[1].classList.add('btn-success');
		}
		if(e > 22){
			buttons[0].classList.add('btn-success');
			buttons[1].classList.add('btn-success');
			buttons[2].classList.add('btn-success');
		}
		if(e > 31){
			buttons[0].classList.add('btn-success');
			buttons[1].classList.add('btn-success');
			buttons[2].classList.add('btn-success');
			buttons[3].classList.add('btn-success');
		}
		if(e > 52){
			buttons[0].classList.add('btn-success');
			buttons[1].classList.add('btn-success');
			buttons[2].classList.add('btn-success');
			buttons[3].classList.add('btn-success');
			buttons[4].classList.add('btn-success');
		}
	</script>
</body>
=======
</body>
>>>>>>> parent of aaa475c... Uppfærði útlitið á valmynd
