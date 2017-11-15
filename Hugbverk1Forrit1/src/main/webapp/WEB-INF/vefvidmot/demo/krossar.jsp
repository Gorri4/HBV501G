<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="is">

<head>
    <title>Krossar</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
</head>
<body>

<a href="Valmynd" class="exitBtn"> &times;</a>

<h1>Krossar</h1>

<form method="POST" action="krossar">
<div class="question">Choose the correct translation for <br><p class=spurningOrd>${spurningin}</p></div>
<br>

<div class="answers">
<div class="answers-wrap">

<button class="answer-box">
<input type="radio" name="answers" id="1" value=${valmog1}>
<label for="1">${valmog1}</label>
</button>

<button class="answer-box">
<input type="radio" name="answers" id="2" value=${valmog2}>
<label for="2">${valmog2}</label>
</button>

<button class="answer-box">
<input type="radio" name="answers" id="3" value=${valmog3}>
<label for="3">${valmog3}</label>
</button>

<button class="answer-box">
<input type="radio" name="answers" id="4" value=${valmog4}>
<label for="4">${valmog4}</label>
</button>

</div>
<br>

<input type="submit" value="Submit" />

</div>

<div class="selected-button">${selected}</div>

</form>

<script>
var buttons;
var checkmarks;
var labels;

document.addEventListener("DOMContentLoaded", function(event) {
  buttons = document.querySelectorAll('.answer-box');
  checkmarks = document.querySelectorAll('input[type="radio"]');
  labels = document.querySelectorAll('label');
  var selected = document.querySelector('.selected-button');

  for (var i = 0; i < buttons.length; i++) {
    buttons[i].addEventListener("click", click);
    if (selected.innerText === labels[i].innerText) {
    	buttons[i].classList.add("wrong");
    }
  }
});

function click(e) {
  e.preventDefault();
  var i;
  // Setja checked á takkan sem ýtt var á, annars ekki checked
  for (i = 0; i < buttons.length; i++) {
    if (e.target === buttons[i] || e.target === labels[i]) {
      checkmarks[i].checked = true;
      if (!buttons[i].classList.contains("wrong")) buttons[i].classList.add("selected");
    } else {
      checkmarks[i].checked = false;
      buttons[i].classList.remove("selected");
    }
  }
}


</script>

<style>
.spurningOrd{
	color:blue;
}
html {
	box-sizing: border-box;
}

*, *:before, *:after {
  box-sizing: inherit;
  /* fjarlægjum margin og padding */
  padding: 0;
  margin: 0;
}

html {
  margin: 0;
  font-size: 16px;
  line-height: 1.5;
  font-family: 'Lato', helvetica, arial, sans-serif;
}

.question {
  min-height: 36px;
  overflow: hidden;
  border: none;
  margin: 10px auto 0;
  font-size: 20pt;
  padding: 10px;
  text-align: center;
  background: #fafafa;
  border: 1px solid #dddfde;
}

.answers {
  text-align: center;
  background: #fafafa;
  border-right: 1px solid #dddfde;
  border-bottom: 1px solid #dddfde;
  border-left: 1px solid #dddfde;
  border-bottom-left-radius: 5px;
  -moz-border-radius-bottomleft: 5px;
  -webkit-border-bottom-left-radius: 5px;
  border-bottom-right-radius: 5px;
  -moz-border-radius-bottomright: 5px;
  -webkit-border-bottom-right-radius: 5px;
  position: relative;
  padding: 10px;
  margin: 0 auto 15px;
}

.answers-wrap {
  max-width: 1000px;
  margin: 0 auto;
  display: flex;
  flex-wrap: wrap;
  justify-content: space-evenly;
  padding: 0;
}

.answer-box {
  display: flex;
  max-width: 433px;
  width: 100%;
  margin-bottom: 20px;
  text-align: center;
  padding: 16px 4px;
  overflow: hidden;
  border: 0;
  background: #eaeaea;
  border-radius: 10px;
  -moz-border-radius: 10px;
  -webkit-border-radius: 10px;
  -moz-box-shadow: 0 3px 1px #b1b1b1, #fafafa 0 -1px 0;
  -webkit-box-shadow: 0 3px 1px #b1b1b1, #fafafa 0 -1px 0;
  box-shadow: 0 3px 1px #b1b1b1, #fafafa 0 -1px 0;
  font-size: 22pt;
  cursor: pointer;
  outline: none;
  transition: background 0.5s ease, color 0.5s ease;
}

.answer-box:hover {
  background: #aeaeae;
}

.answer-box label {
  margin: auto;
  cursor: pointer;
  font-family: 'Lato', helvetica, arial, sans-serif;
}

.answer-box.selected {
  background: rgb(132, 182, 35);
  outline: none;
  box-shadow: 0 3px 1px #1b1b1b, #afafaf 0 -1px 0;
}

input[type="radio"] {
  display: none;
}

input[type="submit"] {
  padding: 0.325em 0.3125em;
  border: rgb(132, 182, 35);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  color: #eee;
  font-family: 'Lato', helvetica, arial, sans-serif;
  cursor: pointer;
  text-decoration: none;
  margin: auto;
  background: #84b623;
  font-size: 2.6em;
  max-width: 236px;
  width: 100%;
  text-align: center;
  border-radius: 4px;
  transition: background 0.5s ease, color 0.5s ease;
}

input[type="submit"]:hover {
  background: #486b32;
}

h1 {
  text-align: center;
}

.selected-button {
	display: none;
}

.wrong {
  animation: shake 0.82s cubic-bezier(.36,.07,.19,.97);
  transform: translate3d(0, 0, 0);
  backface-visibility: hidden;
  perspective: 1000px;
  background: rgb(245, 38, 38);
  outline: none;
  box-shadow: 0 3px 1px #1b1b1b, #afafaf 0 -1px 0;
  transition-property: none;
  pointer-events: none;
}

.exitBtn {
  position: absolute; 
  right: 25px; 
  top: 0; 
  color: #000; 
  font-size: 35px; 
  font-weight: bold; 
  text-decoration: none;
}

@keyframes shake {
  10%, 90% {
    transform: translate3d(-1px, 0, 0);
  }
  
  20%, 80% {
    transform: translate3d(2px, 0, 0);
  }

  30%, 50%, 70% {
    transform: translate3d(-4px, 0, 0);
  }

  40%, 60% {
    transform: translate3d(4px, 0, 0);
  }
}
</style>

</body>

</html>
