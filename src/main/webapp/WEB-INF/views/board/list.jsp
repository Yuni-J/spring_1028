<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    table {
        width: 50%;
        border-collapse: collapse;
        margin-top: 20px;
    }
    th, td {
        border: 1px solid #ccc;
        padding: 10px;
        text-align: left;
    }
    th {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
<h1>Board List Page</h1>
<hr>
<table>
	<tr>
		<th>no.</th>
		<th>title</th>
		<th>writer</th>
		<th>content</th>
		<th>regDate</th>
		<th>modDate</th>
	</tr>
	<c:forEach items="${list }" var="bvo">
		<tr>
			<td>${bvo.bno }</td>
			<%-- 여러개일때 <td><a href="/board/detail?bno=${bvo.bno }&writer=${bvo.writer }">${bvo.title }</a></td> --%>
			<td><a href="/board/detail?bno=${bvo.bno }">${bvo.title }</a></td>
			<td>${bvo.writer }</td>
			<td>${bvo.content }</td>
			<td>${bvo.regDate }</td>
			<td>${bvo.modDate }</td>
		</tr>
	</c:forEach>
</table>
<a href="/"><button type="button">index</button></a>

</body>
</html>