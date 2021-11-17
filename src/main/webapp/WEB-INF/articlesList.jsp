
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My articles</title>
</head>
<body>
	<h2>Articles disponibles</h2>
	<%for (int i=0; i < listArticles.size(); i++){
		articleName = article.getTitle();
	}%>
	
	<a href='articleInfo'> ${article1.getTitle() }</a><br>
	<a href='articleInfo'> ${article2.getTitle() }</a><br>
	<a href='articleInfo'> ${article3.getTitle() }</a><br><br>
	<a href='homepage'> Retourner à la page d'acceuil</a>
	
</body>
</html>