<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Board Detail Page</h1>
<hr>
<div>${bvo }</div>

<a href="/board/modify?bno=${bvo.bno }"><button type="button">수정</button></a>
</body>
</html>