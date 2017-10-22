<%@ page language="Java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="include/importTags.jsp"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Title</title>
</head>
<body>


    <div class="container register">
        <div class ="row">
            <article class="col-md-4 col-xs-12" >
                <p>Veuillez entrer vos informations</p>
                <form:form
                        id="inscription"
                        model="POST"
                        action="/domotique/inscription/sendUser"
                        modelAttribute="userReg">
                    <!--Path correspond à la variable à laquelle le form correspond -->
                    <form:label path="name">Nom de famille: </form:label>
                    <form:input path="name"/>
                    <br></br>
                    <form:label path="sirname">Nom: </form:label>
                    <form:input path="sirname"/>
                    <br></br>
                    <form:label path="adress">Adresse: </form:label>
                    <form:input path="adress"/>
                    <br></br>
                    <form:label path="adressNumber">Numéro d'adresse: </form:label>
                    <form:input path="adressNumber"/>
                    <br></br>
                    <form:label path="town">Ville: </form:label>
                    <form:input path="town"/>
                    <br></br>
                    <form:label path="postalCode">Code Postal: </form:label>
                    <form:input path="postalCode"/>
                    <br></br>
                    <form:label path="country">Pays </form:label>
                    <form:input path="country"/>
                    <br></br>
                    <form:label path="phoneNumber">Numéro de téléphone: </form:label>
                    <form:input path="phoneNumber"/>
                    <br></br>
                    <form:label path="emailAdress">Adresse e-mail: </form:label>
                    <form:input path="emailAdress"/>
                    <br></br>
                    <form:button>Inscription</form:button>
                </form:form>
            </article>
        </div>
    </div>

</body>
</html>