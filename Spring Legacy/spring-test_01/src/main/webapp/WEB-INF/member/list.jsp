<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/header.jsp" %> <!-- Header 파일 추가 -->

<html>
<head>
    <title>Member List Page</title>
</head>
<body>
    <h1>Member List</h1>

    <ul>
        <c:forEach var ="member" items="${memberList}">
            <li>${member.name} / ${member.email}</li>
        </c:forEach>
    </ul>

</body>
</html>
