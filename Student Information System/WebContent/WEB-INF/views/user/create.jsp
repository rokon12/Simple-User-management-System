<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h2>Create User</h2>
<br />
<br />


<form:form modelAttribute="user" action="create" method="post">
	<fieldset>
		<form:errors path="*" cssClass="errors" />
	</fieldset>

	<fieldset>
		<legend>Login</legend>
		<table>
			<tr>
				<th>User Name:</th>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<th>Password:</th>
				<td><form:password path="password" />
			</tr>

			<tr>
				<th>Confirm Password:</th>
				<td><form:password path="passwordConfirmed" />
			</tr>
			<tr>
				<th>First Name:</th>
				<td><form:input path="firstName" /></td>

			</tr>

			<tr>
				<th>Last Name</th>
				<td><form:input path="lastName" /></td>
			</tr>

			<tr>
				<th>Email</th>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td colspan="1"><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</fieldset>
</form:form>