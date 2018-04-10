<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>

<html>
<head>


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des Ressources</title>
</head>
<body>


	<div align="center">
		<h1>Liste des ressources</h1>
		<h3>
			<a href="form">Ajouter ressource</a>
		</h3>
		<table border="1">

			<th>Libelle</th>
			<th>Type</th>
			<th>Quantité</th>


			<c:forEach var="ressource" items="${listRessource}">
				<tr>

					<td><c:out value="${ressource.libelle}" /></td>
					<td><c:out value="${ressource.type}" /></td>
					<td><c:out value="${ressource.qte}" /></td>

					<c:url value="deleteRessource" var="del">
						<c:param name="id" value="${ressource.id}" />
					</c:url>

					<c:url value="editRessourceView" var="edit">
						<c:param name="id" value="${ressource.id}" />
					</c:url>

					<c:url value="detailRessource" var="detail">
						<c:param name="id" value="${ressource.id}" />
					</c:url>

					<td><a href='<c:out value="${detail}"/>'>Details</a> <a
						href='<c:out value="${edit}"/>'>Modifier</a> <a
						href='<c:out value="${del}"/>'>Supprimer</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
