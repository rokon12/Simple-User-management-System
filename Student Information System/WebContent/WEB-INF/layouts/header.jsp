<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.iit.univdhaka.iis.domain.LoginCommand"%>

<div id="welcome">
	<div class="left">Student Information System</div>
	<div class="right">
		<%
			LoginCommand user = (LoginCommand) session.getAttribute("USER");
			if (user == null) {
		%>
		<a href="<c:url value="/app/login/login" />">[ Log In ]</a>
		<%
			} else {
		%>
		Welcome <% out.print(user.getUserName()); %> ! <a href="<c:url value="/app/login/logout" />">[ Log Off ]</a>
		<%
			}
		%>
	</div>
</div>

<div id="branding" class="spring">
	<img src="<c:url value="/images/header.jpg"/>" />
</div>

