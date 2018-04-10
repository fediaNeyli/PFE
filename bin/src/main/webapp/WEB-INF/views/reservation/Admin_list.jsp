<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des Reservation</title>
</head>
<body>


	<div align="center">
		<h1>Liste des Reservations</h1>
		<h3>
			<a href="form">Ajouter Reservation</a>
		</h3>
		<table border="1">

			<th>Nom Personne</th>
			<th>Ressource</th>
			<th>Quantité</th>
			<th>Date</th>
			<th>Heure D</th>
			<th>Heure F</th>

			<c:forEach var="creneau" items="${listCreneaux}">



				<tr>
					<td><c:out value="${creneau.reservation.personne.nom}" /></td>
					<td><c:out value="${creneau.ressource.description}" /></td>
					<td><c:out value="${creneau.qte}" /></td>
					<td><c:out value="${creneau.date}" /></td>
					<td><c:out value="${creneau.heured}" /></td>
					<td><c:out value="${creneau.heuref}" /></td>
				</tr>

			</c:forEach>


		</table>
	</div>
</body>
</html>
