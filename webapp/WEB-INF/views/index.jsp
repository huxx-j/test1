<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<body>
<table>
<c:forEach items="${list}" var ="vo">
	<tr>
	<td>
	${vo.name}
	</td>
	<td>
	${vo.phone}
	</td>
	</tr>
</c:forEach>
</table>
hello
안녕하세요~

</body>
</html>