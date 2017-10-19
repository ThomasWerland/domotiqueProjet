<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${title}</title>
</head>
<body>
    <form:button
        id="login"
        method ="POST"
        action="/domotique/login/send"
        modelAttribute="log">
            <form:label path="login">Login</form:label>
            <form:input path="login"/>
        <form:button path="login"/>
    </form:form>




</body>
</html>