<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h2>Create Student Details</h2>
<br />
<br />
<form:form modelAttribute="student" action="create" method="post">
	<fieldset>
		<form:errors path="*" cssClass="errors" />
	</fieldset>

	<fieldset>
		<legend>Student Details</legend>
		<table>
			<tr>
				<th>Name Prefix:</th>
				<td><form:select path="namePrefix">
						<form:option value="Mr."></form:option>
						<form:option value="Ms."></form:option>
						<form:option value="Mrs."></form:option>
						<form:option value="Miss."></form:option>
						<form:option value="Prof."></form:option>
						<form:option value="Dr."></form:option>
					</form:select></td>
			</tr>
			<tr>
				<th>First Name:</th>
				<td><form:password path="firstName" />
			</tr>

			<tr>
				<th>Last Name:</th>
				<td><form:password path="lastName" />
			</tr>
			<tr>
				<th>Formal Name:</th>
				<td><form:input path="formalName" /></td>

			</tr>

			<tr>
				<th>Display Name</th>
				<td><form:input path="displayName" /></td>
			</tr>

			<tr>
				<th>Gender</th>
				<td><form:select path="gender">
						<form:option value="Female" label="Female"></form:option>
						<form:option value="Male" label="Male"></form:option>
					</form:select></td>
			</tr>

			<tr>

				<td></td>
				<td colspan="1"><input type="submit" value="Create" /></td>
			</tr>
		</table>
	</fieldset>
</form:form>