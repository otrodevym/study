<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body onload="document.f.username.focus();">
	<h3>Login with Username and Password</h3>
	<form name="f" action="${pageContext.request.contextPath }/j_spring_security_check" method="POST">
		<table>
			<tbody>
				<tr>
					<td>User:</td>
					<td><input type="text" name="user_id" value=""
						placeholder="user name"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="user_passwd"
						placeholder="password"></td>
				</tr>
				<tr>
					<td colspan="2"><input name="submit" type="submit"
						value="Login"><input name="${_csrf.parameterName}"
						type="hidden" value="${_crsf.token}"></td>
				</tr>
				<tr>
					<td><label for="remember-me">Remember Me</label> <input
						type="checkbox" id="remember-me" name="remember-me" /></td>
				</tr>
			</tbody>
		</table>
		<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
			<font color="red">
					Your login attempt was not successful due to <br />
					${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
				 <c:remove var="SPRING_SECURITY_LAST_EXCEPTION" scope="session" />
			</font>
		</c:if>


	</form>
</body>
</html>