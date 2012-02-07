<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<!DOCTYPE html 
	PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title><tiles:getAsString name="title" /></title>

<style type="text/css" media="screen">
			@import url("<c:url value="/styles/css-framework/tools.css" />");
			@import url("<c:url value="/styles/css-framework/typo.css" />");
			@import url("<c:url value="/styles/css-framework/forms.css" />");
			@import url("<c:url value="/styles/css-framework/layout-navtop-subright.css" />");
			@import url("<c:url value="/styles/css-framework/layout.css" />");
			@import url("<c:url value="/styles/standard.css" />");
		</style>
</head>



<body>
	<div id="page">
		<div id="header" class="clearfix">
			<tiles:insertAttribute name="header" />
		</div>
		<!-- end header -->
		<div id="content" class="clearfix">
			<div id="sub">
				<img src="<c:url value="/images/cwc.jpg"/>" width="215" />
			</div>
			<div id="main">
				<tiles:insertAttribute name="body" />
			</div>
			<div id="nav">
				<tiles:insertAttribute name="navigation" />
			</div>
		</div>
		<!-- end content -->
		<div id="footer" class="clearfix">
			<tiles:insertAttribute name="footer" />
		</div>
		<!-- end footer -->
	</div>
	<!-- end page -->
	<div id="extra1">&nbsp;<span >User Management System</span> developed by <a href="http://codexplo.wordpress.com/" target="_blank">Bazlur Rahman</a> </div>
	<div id="extra2">&nbsp; <a href="https://github.com/rokon12/Simple-User-management-System" target="_blank">source code on github</a></div>
</body>
</html>
