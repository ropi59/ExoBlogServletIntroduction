<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Informations du user</title>
</head>
<body>
<h2>Informations personnelles</h2>

<p>Pseudo : ${user.getUsername()}</p>
<p>Nombre d'articles : ${user.getNbArticle()}</p>
<p>Email : ${user.getEmail()}</p>
<p>Admin : ${user.isAdmin()}</p><br><br>

<a href='homepage'> Retourner à la page d'acceuil</a>

</body>
</html>