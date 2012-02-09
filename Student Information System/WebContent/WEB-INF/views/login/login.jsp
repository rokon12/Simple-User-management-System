<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h2>Log in</h2>
<br />
<br />


<form:form modelAttribute="login" action="login" method="post">
	<fieldset>
		<legend>Login</legend>

		<fieldset>
			<form:errors path="*" cssClass="errors" />
		</fieldset>

		<table>

			<tr>
				<th>User Name:</th>
				<td><form:input path="userName" /></td>

			</tr>
			<tr>
				<th>Password:</th>
				<td><form:password path="password" />
			</tr>

			<tr>
				<td colspan="1"><input type="submit" value="Log In" /></td>
			</tr>
		</table>
		<p>
			<span style="color: red">Not registered? </span><a
				href="../user/create">Sign Up</a>
		</p>

	</fieldset>
</form:form>