<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ include file="../include/importTags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link type="text/css" href="<spring:url value="/css/style.css"/>" rel="Stylesheet">

</head>
<body>
<div>
    <div>
        <tiles:insertAttribute name = "main-content"/>
    </div>
</div>
</body>
<footer>
    <p>Robin Leroux & Thomas Werland        2018</p>
</footer>
</html>