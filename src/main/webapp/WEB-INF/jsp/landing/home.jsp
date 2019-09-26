<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <!-- Title-->
    <title>Gentech</title>

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

<section class="padding-y-150 flex-center bg-cover landing-section" style="background-image: url('../resources/static/images/bio.jpg')" data-dark-overlay="6" >
    <div class="container">
        <div class="row">
            <div class="col-12 text-white text-center">
                <h4 class="text-primary wow slideInUp">
                    La premiere platforme d'access au resources genetique
                </h4>
                <h1 class="display-lg-4 my-3 wow slideInUp">
                    GenTech vous facilite votre travail !
                </h1>
                <div class="container">
                    <div class="row" style="margin-left: 22%" >
                        <c:choose>
                            <c:when test="${role == 'expert'}">
                                <button class="btn btn-outline-success" data-toggle="modal" data-target="#model-add-role" style="margin-right: 10px">Ajouter une resource genetique</button>
                                <a href="/expert/request-permis"><button class="btn btn-outline-danger ">Valider les requestes d'utilisation</button></a>
                            </c:when>
                            <c:otherwise>
                            </c:otherwise>
                        </c:choose>
<%--                        <a href="/resource-demand"><button class="btn btn-outline-success" style="margin-right: 10px">Demander une resource genetique</button></a>--%>

                    </div>
                </div>
            </div>
        </div> <!-- END row-->
    </div> <!-- END container-->
</section>




<%--<section class="padding-y-100">--%>
<%--    <div class="container">--%>
<%--        <div class="row">--%>
<%--            <div class="col-md-4 mt-4 text-center">--%>
<%--                <div class="iconbox iconbox-xxl font-size-26 bg-primary-0_2">--%>
<%--                    <i class="ti-bookmark-alt text-primary"></i>--%>
<%--                </div>--%>
<%--                <h4 class="my-4">--%>
<%--                    Plus--%>
<%--                </h4>--%>
<%--                <p>--%>
<%--                    Investig ationes demons travg ectores legere lrus quod legunt saepius.--%>
<%--                </p>--%>
<%--            </div>--%>
<%--            <div class="col-md-4 mt-4 text-center">--%>
<%--                <div class="iconbox iconbox-xxl font-size-26 bg-primary-0_2">--%>
<%--                    <i class="ti-user text-primary"></i>--%>
<%--                </div>--%>
<%--                <h4 class="my-4">--%>
<%--                    Expert Instruction--%>
<%--                </h4>--%>
<%--                <p>--%>
<%--                    Investig ationes demons travg ectores legere lrus quod legunt saepius.--%>
<%--                </p>--%>
<%--            </div>--%>
<%--            <div class="col-md-4 mt-4 text-center">--%>
<%--                <div class="iconbox iconbox-xxl font-size-26 bg-primary-0_2">--%>
<%--                    <i class="ti-cup text-primary"></i>--%>
<%--                </div>--%>
<%--                <h4 class="my-4">--%>
<%--                    Professional Certificates--%>
<%--                </h4>--%>
<%--                <p>--%>
<%--                    Investig ationes demons travg ectores legere lrus quod legunt saepius.--%>
<%--                </p>--%>
<%--            </div>--%>
<%--        </div> <!-- END row-->--%>
<%--    </div> <!-- END container-->--%>
<%--</section>--%>


<section class="padding-y-100 border-bottom">
    <div class="container">
        <div class="row align-items-center">

            <div class="col-lg-5 mb-4 mr-auto text-center">
                <img class="wow fadeInLeft w-100 rounded" src="images/biologie.jpeg" alt="">
            </div>

            <div class="col-lg-6">
                <h2>
                    <span class="text-primary">Gentech</span> vous offre
                </h2>
                <div class="width-4rem height-4 bg-primary rounded mt-4 marginBottom-40"></div>
                <p class="mb-5">
                    Notre platforme vous delivre un contenu riche qui concerne different resources genetique ou vous pouvez demander l utilisation de cette resource
                    et l exploiter pour vos besoins proffesionels
                </p>
                <h2>
                    <span class="text-primary">Consulter nous</span> a travers ces liens
                </h2>
                <div class="width-4rem height-4 bg-primary rounded mt-4 marginBottom-40"></div>
                <ul class="list-unstyled list-style-icon list-icon-check-circle">
                    <li>
                        <a href="/resources">Visualiser toutes les resources existantes</a>
                    </li>
                    <li>
                        <a href="/institutions">Consulter les institutions specialistes</a>
                    </li>
                    <li>
                        <a href="/lois-reglements">Savoir connaissance des reglements et lois</a>
                    </li>
                    <li>
                        <a href="/cta">Creer votre propre CTA</a>
                    </li>
                </ul>
            </div> <!-- END col-lg-6 ml-auto-->
        </div> <!-- END row-->
    </div> <!-- END container-->
</section>






<section class="padding-y-100" style="background:#3b3e79">
    <div class="container">
        <div class="row">
            <div class="col-12 text-center text-white mb-5">
                <h1 class="mb-4">
                    Dans le vaste laboratoire de la genetique, l etre humain a perdu sa definition.
                </h1>
                <div class="width-3rem height-4 rounded bg-primary mx-auto"></div>
            </div>


        </div>
    </div> <!-- END container-->
</section>   <!-- END section-->


<section class="padding-y-100">
    <div class="container">
        <div class="row">
            <div class="col-12 text-center">
                <h2 class="mb-4">
                    Nos articles
                </h2>
                <div class="width-3rem height-4 rounded bg-primary mx-auto"></div>
            </div>
            <c:forEach var="article" items="${articles}">
            <div class="col-lg-4 mt-5">
                <div class="card">
                    <img class="rounded" src="/uploads/${article.getFile().getName()}" alt="">
                    <form action="/article-details" method="post">
                    <div class="card-body px-0">
                        <span class="h4 my-2">
                            ${article.getTitle()}
                        </span>
                        <p>
                            ${article.getPublish_date()} - ecrit par <a href="#" class="text-primary">Admin</a>
                        </p>
                    </div>
                        <input type="hidden" name="article_id" value="${article.getId()}">
                        <div class="card-footer border-top-0">
                            <button type="submit" class="btn btn-outline-primary mx-1">Lire</button>
                        </div>
                    </form>
                </div>
            </div>
            </c:forEach>

        </div>
    </div>
<%--    <div class="col-12 text-center mt-5">--%>
<%--        <button class="btn btn-primary btn-icon">--%>
<%--           Visualiser tous--%>
<%--        </button>--%>
<%--    </div>--%>
</section>

<div class="col-md-6">
    <div id="model-add-role" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Ajouter une nouvelle resource dans le system</h4>
                </div>
                <div class="modal-body">
                    <form method="post" action="/add-resource" enctype="multipart/form-data">
                        <div class="form-group">
                            <label for="recipient-name" class="control-label">designation de la resource</label>
                            <input type="text" name="nom" class="form-control" id="recipient-name" required>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-12">
                                <label for="recipient-name" class="control-label">Type de resource</label>
                                <select name="type_id" class="form-control">
                                    <option value="">Choisir un type pour votre resource</option>
                                    <c:forEach var="type" items="${types}">
                                        <option value="${type.getId()}">${type.getNomType()}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>

                        <div class="form-group row">
                            <div class="col-sm-12">
                                <label for="recipient-name" class="control-label">Institution</label>
                                <select name="institu_id" class="form-control">
                                    <option value="">Choisir l institution de votre resource</option>
                                    <c:forEach var="instit" items="${institutions}">
                                        <option value="${instit.getId()}">${instit.getName()}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="recipient-name" class="control-label">description</label>
                            <textarea type="text" name="description" class="form-control"  required></textarea>
                        </div>
                        <div class="form-group">
                            <label for="recipient-name" class="control-label">Caracteristique</label>
                            <textarea type="text" name="carracteristics" class="form-control"  required></textarea>
                        </div>
                        <div class="form-group">
                            <label for="recipient-name" class="control-label">Image de la resource</label>
                            <input type="file" name="image" class="form-control"  required>
                        </div>
                        <div class="form-group">
                            <label for="recipient-name" class="control-label">Document privé</label>
                            <input type="file" name="document" class="form-control"  required>
                        </div>
                        <div class="modal-footer">
                            <button type="submit" class="btn btn-success">Ajouter</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<jsp:include page="fragments/footer.jsp"/>

<div class="scroll-top">
    <i class="ti-angle-up"></i>
</div>

<script src="js/vendors.bundle.js"></script>
<script src="js/scripts.js"></script>
</body>
</html>