<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <!-- Title-->
    <title>Complete education theme for School, College, University, E-learning</title>

    <!-- SEO Meta-->
    <meta name="description" content="Education theme by EchoTheme">
    <meta name="keywords" content="HTML5 Education theme, responsive HTML5 theme, bootstrap 4, Clean Theme">
    <meta name="author" content="education">

    <!-- viewport scale-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">


    <!-- Favicon and Apple Icons-->
    <link rel="icon" type="image/x-icon" href="assets/img/favicon/favicon.ico">
    <link rel="shortcut icon" href="assets/img/favicon/114x114.png">
    <link rel="apple-touch-icon-precomposed" href="assets/img/favicon/96x96.png">


    <!--Google fonts-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Maven+Pro:400,500,700%7CWork+Sans:400,500">


    <!-- Icon fonts -->
    <link  href="css/all.css" rel="stylesheet">
    <link  href="css/themify-icons.css" rel="stylesheet">


    <!-- stylesheet-->
    <link  href="css/vendors.bundle.css" rel="stylesheet">
    <link  href="css/style.css" rel="stylesheet">
    <link  href="css/main.css" rel="stylesheet">

</head>

<body>

<jsp:include page="fragments/nav-bar.jsp" />



<section class="padding-y-100">
    <div class="container">
        <div class="row">
            <div class="col-12 text-center">
                <h2>
                    Demander l access a une resource
                </h2>
                <div class="width-4rem height-4 bg-primary my-2 mx-auto rounded"></div>
            </div>
            <div class="col-lg-8 mx-auto mt-5">
                <div class="card text-center shadow-v3 p-5">
                    <h4 class="text-primary">
                        Remplisez vous ce formulaire
                    </h4>
                    <p>
                        Les informations fournis dans ce formulaire doit etre obligatoirement correcte pour le traitement de votre demande.
                    </p>
                    <form action="" method="POST" class="mt-4">
                        <div class="input-group input-group--focus mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text bg-white"></span>
                            </div>
                            <input type="text" class="form-control border-left-0 pl-0" placeholder="Nom" required>
                        </div>
                        <div class="input-group input-group--focus mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text bg-white"></span>
                            </div>
                            <input type="text" class="form-control border-left-0 pl-0" placeholder="Prenom" required>
                        </div>
                        <div class="input-group input-group--focus mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text bg-white"></span>
                            </div>
                            <input type="email" class="form-control border-left-0 pl-0" placeholder="Email" required>
                        </div>
                        <div class="input-group input-group--focus mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text bg-white"></span>
                            </div>
                            <input type="text" class="form-control border-left-0 pl-0" placeholder="Raison social" required>
                        </div>
                        <div class="input-group input-group--focus mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text bg-white"></span>
                            </div>
                            <input type="text" class="form-control border-left-0 pl-0" placeholder="Resource" required>
                        </div>
                        <div class="input-group input-group--focus mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text bg-white"></span>
                            </div>
                            <textarea type="text" class="form-control border-left-0 pl-0" placeholder="Description" required></textarea>
                        </div>
                        <div class="input-group input-group--focus mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text bg-white"></span>
                            </div>
                            <input type="file" class="box-file form-control border-left-0 pl-0" required>
                        </div>
                        <div class="input-group my-4">
                            <label class="ec-checkbox">
                                <input type="checkbox" name="checkbox">
                                <span class="ec-checkbox__control"></span>
                                <span class="ec-checkbox__lebel text-left">
                J'accepte que
                <a href="page-terms-and-privacy-policy.html" class="text-primary" target="_blank">
                  mes information seront stockes dans le serveur de Gentech.
                </a>
              </span>
                            </label>
                        </div>
                        <button class="btn btn-primary btn-block">Demander</button>
                    </form>
                </div>
            </div>
        </div> <!-- END row-->
    </div> <!-- END container-->
</section>



<jsp:include page="fragments/footer.jsp"/>

<div class="scroll-top">
    <i class="ti-angle-up"></i>
</div>

<script src="js/vendors.bundle.js"></script>
<script src="js/scripts.js"></script>
</body>
</html>