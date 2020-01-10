<%--
  Created by IntelliJ IDEA.
  User: robertlr
  Date: 1/10/20
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Contacts" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the Contacts!</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Phone Number</th>
        </tr>
        <c:forEach var="contact" items="${contacts}">
            <tr>
                <th>${contact.id}</th>
                <th>${contact.firstName}</th>
                <th>${contact.lastName}</th>
                <th>${contact.contactNumber}</th>
            </tr>
        </c:forEach>
    </table>


</div>

</body>
</html>
