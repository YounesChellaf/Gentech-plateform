<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Gentelella Alela! | </title>

    <!-- Bootstrap -->
    <link href="webjars/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="webjars/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="webjars/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="webjars/animate.css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="css/custom.min.css" rel="stylesheet">
</head>

<body class="login">
<div>
    <a class="hiddenanchor" id="signup"></a>
    <a class="hiddenanchor" id="signin"></a>

    <div class="login_wrapper">
        <div class="animate form login_form">
            <section class="login_content">
                <form action="/login" method="POST">
                    <h1>Connectez vous</h1>
                    <div>
                        <input type="text" class="form-control" placeholder="Nom utilisateur" required="" name="userName"/>
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="mot de passe" required="" name="password"/>
                    </div>
                    <div>
                        <button class="btn btn-default submit" type="submit">S'inscrire</button>
                        <a class="reset_pass" href="#">Mot de passe oublié ?</a>
                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">
                        <p class="change_link">Nouveau a notre plateforme !
                            <a href="#signup" class="to_register">Creer Compte</a>
                        </p>

                        <div class="clearfix"></div>
                        <br />


                    </div>
                </form>
            </section>
        </div>

        <div id="register" class="animate form registration_form">
            <section class="login_content">
                <form action="/register" method="POST">
                    <h1>Creer un Compte</h1>
                    <div>
                        <input type="text" class="form-control" placeholder="Nom utilisateur" name="userName" required="" />
                    </div>
                    <div>
                        <input type="email" class="form-control" placeholder="Email" name="email" required="" />
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-12">
                            <select name="role_id" class="form-control">
                                <option value="">Choisir un role</option>
                                <c:forEach var="role" items="${roles}">
                                    <option value="${role.getId()}">${role.getDesignation()}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="mot de passe"  name="password" required="" />
                    </div>
                    <div>
                        <input type="password" class="form-control" placeholder="confirmer votre mot de passe"  name="confirm_password" required="" />
                    </div>
                    <div>
                        <button class="btn btn-default submit" type="submit">S'inscrire</button>
                    </div>

                    <div class="clearfix"></div>

                    <div class="separator">
                        <p class="change_link">
                            <a href="#signin" class="to_register"> Log in </a>
                        </p>

                        <div class="clearfix"></div>
                        <br />

                    </div>
                </form>
            </section>
        </div>
    </div>
</div>
</body>
</html>
