<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
	<div align="center">


		<form action="/ProjetSpring/admin/reservation/add" method="post"
			modelAttribute="reservation">
			<table>
				<tr>
					<td>dateDebut:</td>

					<td><input type="date" name="dateDebutFreq"></td>
				</tr>
				<tr>
					<td>dateFinFreq:</td>

					<td><input type="date" name="dateFinFreq"></td>
				</tr>
				<tr>
					<td>freq:</td>
					<td><select name="freq">
							<option value=0>Une Seule Fois</option>
							<option value=1>Chaque Jour</option>
							<option value=7>Chaque Semaine</option>
							<option value=15>Chaque 2 semaine</option>
					</select></td>
				</tr>

				<tr>
					<td>Personne</td>
					<td><select name="personne_id">
							<c:forEach var="personne" items="${listPersonnes}">

								<option value=<c:out value="${personne.id}" />><c:out
										value="${personne.nom}" />
									<c:out value="${personne.prenom}" /></option>
							</c:forEach>
					</select></td>
				</tr>

				<tr>
					<td>Ressource</td>
					<td><select name="ressource_id">
							<c:forEach var="ressource" items="${listRessources}">

								<option value=<c:out value="${ressource.id}" />><c:out
										value="${ressource.libelle}" />
								</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>qte :</td>
					<td><input type="text" name="qte"></td>
				</tr>

				<tr>
					<td>Heure Debut :</td>
					<td><input type="time" name="heured"></td>
				</tr>
				<tr>
					<td>Heure Fin :</td>
					<td><input type="time" name="heuref"></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Save"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>