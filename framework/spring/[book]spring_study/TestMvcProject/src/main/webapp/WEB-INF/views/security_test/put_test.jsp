<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="f"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<f:form action="${pageContext.request.contextPath }/put_test" method="put">
	<input type="hidden" name="_method" value="PUT"/>
	<input type="hidden" name="_method" id="_method" value="PUT" />
	<input type="text" />
	<input type="submit" value="call">
</f:form>
</body>
</html>