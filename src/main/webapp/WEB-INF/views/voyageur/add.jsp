<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Formulaire </title>
</head>
<body>
<form action="addUser" method="POST">
numCarte : <input type="text" name="numCarte"> 
<br>
<br>
mail : <input type="text" name="mail">
<br>
<br>
Login : <input type="text" name="login">
<br>
<br>
Mot de passe  : <input type="text" name="password">
<br>
<br>
<button type="submit"> Ajouter </button>
</form>

</body>
</html>