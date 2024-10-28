<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    table {
        width: 30%;
        border-collapse: collapse;
    }
    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
    }
</style>
</head>
<body>
<h1>Board Detail Page</h1>
<hr>
<form action="/board/modify">
	<input type="hidden" name="bno" value="${bvo.bno }">
	<table>
		<tr>
			<th>no.</th>
			<td>${bvo.bno }</td>
		</tr>
		<tr>
			<th>title</th>
			<td><input type="text" name="title" value="${bvo.title }"></td>
		</tr>
		<tr>
			<th>writer</th>
			<td>${bvo.writer }</td>
		</tr>
		<tr>
			<th>content</th>
			<td><textarea rows="10" cols="50" value="${bvo.content }">${bvo.content }</textarea></td>
		</tr>
		<tr>
			<th>regDate</th>
			<td>${bvo.regDate }</td>
		</tr>
		<tr>
			<th>modDate</th>
			<td>${bvo.modDate }</td>
		</tr>
	</table>
	<button type="submit">modify</button>
</form>
<a href="/board/list"><button type="button">list</button></a>
</body>
</html>