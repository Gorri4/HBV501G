<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="is">

<head>
    <title>Login</title>
    <meta charset="UTF-8">
</head>
    <style>
    .button {
  width: 100%;
  max-width: 6em;
  padding: 0.2em 0.1em;
  margin: auto;
  overflow: hidden;
  font-family: Lato, helvetica, arial, sans-serif;
  font-size: 0.9em;
  color: #eee;
  text-align: center;
  text-decoration: none;
  text-overflow: ellipsis;
  white-space: nowrap;
  cursor: pointer;
  background-color: #666;
  border: 1px solid #666;
  border-radius: 4px;
  transition: background-color 0.5s ease, color 0.5s ease; }
  .button--inverted {
    color: #666;
    background-color: #eee; }
  .button--disabled {
    color: #999;
    cursor: not-allowed;
    background-color: #eee;
    border-color: #eee; }
  .button:hover {
    background-color: #333; }
  .button--inverted:hover {
    color: #333;
    background-color: #ccc; }
  .button--disabled:hover {
    background-color: #eee; }
    </style>
</head>
<body>

<h1>Login</h1>

<form method="POST" action="/demo/Login">
	Username: <input name="loginInfo" type="text" placeholder="Username" />
	Password: <input name="loginInfo" type="password" placeholder="password" />
	<input type="submit" class="button" value="Submit" />
</form>

</body>

</html>