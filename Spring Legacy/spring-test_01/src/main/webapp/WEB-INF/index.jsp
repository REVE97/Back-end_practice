<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring</title>
</head>
<body>
    <h1>Hello, Spring world!</h1>

    <!-- 경로 이동 버튼 생성-->
    <form action="/member" method="get" style="display:inline;">
        <button type="submit">Member index 이동</button>
    </form>

    <form action="/member/list" method="get" style="display:inline;">
        <button type="submit">MemberList 이동</button>
    </form>
</body>
</html>
