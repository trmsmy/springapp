<%@ include file="/WEB-INF/jsp/includes/include.jsp" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %> 
<html>
<title>Home Page | A Logistics Company</title> 
<%@ include file="/WEB-INF/jsp/includes/common_css_js.jsp" %>
<body>

<div id="body-wrapper">

	<tiles:insert attribute="head-position"/>
 
	<div id="content-wrapper">
		<tiles:insert attribute="left-nav-position"/>
	 <form  name="product_search" action="formpage.html" method="POST">	
		Name: <spring:bind path="command.name">
		<input type="text" name="${status.expression}" 
		id="name" value="${status.value}" />
		</spring:bind>
		
		Type: <spring:bind path="command.type">
		<input type="text" name="${status.expression}" 
		id="address" value="${status.value}" />
		</spring:bind>
		
		<input type="submit" value="Submit"/>
		<input type="hidden" value="${pageSize}" name="pageSize" />
		
		
		</form>
		 
		 <c:set var="searchResultPageSizeOptions" value="10,25,50" />
			<c:set var="selectedValue" value="10" />
			<spring:bind path="command.pageSize">
				
				<c:if test="${!empty pageSize}">
					<c:set var="selectedValue" value="${pageSize}" />
				</c:if>
				<select name="<c:out value="${status.expression}"/>" id="pageval" onchange="javascript:changePageSize();">
					<c:forTokens items="${searchResultPageSizeOptions}" delims=","
								 var="localPageSize" varStatus="status">
						<option value="${localPageSize}" <c:if test="${selectedValue == localPageSize }">
												selected="selected"
							</c:if> >${localPageSize}
						</option>
					</c:forTokens>
				</select>
			</spring:bind>
		
		 
		<display:table name="sessionScope.TABLE_DATA" 
		pagesize="${pageSize}" requestURI="formpage.html?paging=true" class="results-table">
		  <display:column property="id" title="ID" sortable="true" />
		  <display:column property="name" title="Name" sortable="true" />
		  <display:column property="type" title="Type" sortable="true" />
		</display:table>
	
	</div>
	 
	<tiles:insert attribute="foot-position"/>
	 
</div>
</body>
</html>