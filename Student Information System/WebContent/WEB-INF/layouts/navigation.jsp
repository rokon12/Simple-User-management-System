<%@page import="com.iit.univdhaka.iis.domain.LoginCommand"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<ul>
	<li><a href="<c:url value="/app/home/index" />">Home</a></li>
	<li><a href="<c:url value="/app/home/about" />">About</a></li>
	<li>
		<%
			LoginCommand user = (LoginCommand) session.getAttribute("USER");

			if (user == null) {
		%> <a href="<c:url value="/app/login/login" />">Log In</a> <%
 	} else {
 %> <a href="<c:url value="/app/login/logout" />">Log Out</a> <%
 	}
 %>
	</li>
</ul>
