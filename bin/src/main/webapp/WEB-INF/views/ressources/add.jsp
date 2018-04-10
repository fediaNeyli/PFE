<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajouter ressource</title>
</head>
<body>
	<div align="center">
		<h1>Ajouter ressource</h1>

		<h3>
			<a href="list">Liste des ressources</a>
		</h3>
		<c:out value="${erreur}" />
		<form action="addRessource" method="post" modelAttribute="ressource">
		
			<table>
				<tr>
					<td>Libelle:</td>
					<td><input type="text" name="libelle"></td>
				</tr>
				<tr>
					<td>Type:</td>
					<td><input type="text" name="type"></td>
				</tr>
				<tr>
					<td>Etat:</td>
					<td><input type="text" name="etat"></td>
				</tr>
				<tr>
					<td>Description:</td>
					<td><input type="text" name="description"></td>
				</tr>
				<tr>
					<td>Quantité:</td>
					<td><input type="number" name="qte"></td>
				</tr>
				<tr>
					<td>Max réservations:</td>
					<td><input type="number" name="maxReserv"></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Ajouter" class="btn btn-success"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
