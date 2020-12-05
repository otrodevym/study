<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<sec:authorize access="isAnonymous()">
    <h5><a href='<c:url value="/login/login_form"/>'>LOGIN</a> </h5>
</sec:authorize>
<sec:authorize access="!isAnonymous()">
<form action="${pageContext.request.contextPath }/j_spring_security_logout" method="POST">
    <input type="submit" value="LOGOUT"/>
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
</sec:authorize>
<a href='<c:url value="/page"/>'>GUEST</a>
<a href='<c:url value="/user/page"/>'>USER</a>
<a href='<c:url value="/member/page"/>'>MEMBER</a>
<a href='<c:url value="/admin/page"/>'>ADMIN</a>

<a href='<c:url value="/access_denied_page"/>'>access_denied_page</a>
<a href='<c:url value="/put_test"/>'>/put_test</a>


</body>
</html>
