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


        <article class = "col-md-4">
            <form:form
                    id ="login"
                    method="POST"
                    action="/domotique/test/send">
                <form:button>test</form:button>
            </form:form>

        </article>

    </div>
</div>








</body>
</html>