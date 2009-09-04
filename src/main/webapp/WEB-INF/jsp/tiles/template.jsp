<%@ include file="/WEB-INF/jsp/includes/include.jsp" %>
<html>
<head> File</head> 
<link href="/ui/styles/template.css" media="all" rel="stylesheet" type="text/css"/>
<script src="/ui/scrips/template.js" type="text/javascript"></script>
<body>
<div id="body-wrapper">
	<div id="top-header">
		<tiles:insert attribute="head-position"/>
	</div>
	<div id="content-wrapper">
		<div id="sidebar">
			<tiles:insert attribute="left-nav-position"/>
		</div>
		
		<div id="container">
			<div id="mainbody">
				<tiles:insert attribute="body-position"/>
			</div>
			<div id="footer">
				 <tiles:insert attribute="foot-position"/>
			</div>
		</div>
	</div> 
</div>


</body>
</html>