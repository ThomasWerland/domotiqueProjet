<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${title}</title>
</head>
<body>
    <div class ="container login">
        <div class="row">


            <article class="col-xs-12 col-md-4 ">
                <form:form
                        id="login"
                        method ="POST"
                        action="/domotique/login/send"
                        modelAttribute="log">
                    <form:label path="login">Login</form:label>
                    <form:input path="login"/>
                    <br></br>
                    <form:label path="pw">Mot de passe</form:label>
                    <form:input path="pw"/>
                    <br></br>
                    <form:button path="name">Connexion</form:button>
                </form:form>
                <a href="http://localhost:8082/domotique/register">Vous n'avez pas encore de compte?</a>
            </article>


        </div>
    </div>








</body>
</html>