<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ include file="../include/importTags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link type="text/css" href="<spring:url value="/css/bootstrap.css"/>" rel="Stylesheet">
    <link type ="text/css" href="<spring:url value="/css/style.css"/>" rel="Stylesheet">
    <div class="container-fluid menu">
        <div class="row ">
            <article class="col-md-2 ">
                <a class = "item" href="http://localhost:8082/domotique/acceuil"><img src='<spring:url value ="/images/logo.png"/>'/></a>
            </article>
            <article class ="col-md-2 ">
                <a class = "item" href="http://localhost:8082/domotique/login">Connexion</a>
            </article>

            <article class ="col-md-2">
                <a class ="item" href="">Catalogue</a>
            </article>
        </div>
    </div>
</head>
<body>
<div>
    <div>
        <tiles:insertAttribute name = "main-content"/>

    </div>
</div>
</body>
<footer class = "footer">

    <p>Robin Leroux & Thomas Werland        2018</p>
</footer>
</html>