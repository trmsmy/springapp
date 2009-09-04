function changePageSize() {
	document.product_search.pageSize.value = document.getElementById("pageval").value;
	document.product_search.submit();
	return true;
	
}
