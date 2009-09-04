<%@ include file="/WEB-INF/jsp/includes/include.jsp" %>
<html>
<title>Home Page | A Logistics Company</title> 
<%@ include file="/WEB-INF/jsp/includes/common_css_js.jsp" %>
<body>

<div id="body-wrapper">

	<tiles:insert attribute="head-position"/>
 
	<div id="content-wrapper">
		<tiles:insert attribute="left-nav-position"/>
		<tiles:insert attribute="body-position"/>
	</div>
	 
	<tiles:insert attribute="foot-position"/>
	 
</div>
</body>
</html>