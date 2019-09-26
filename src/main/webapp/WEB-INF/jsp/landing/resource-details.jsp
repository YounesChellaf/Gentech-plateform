<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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



<section class="paddingBottom-100">
    <div class="container">

        <div class="row">
            <div class="col-lg-9 marginTop-30">
                <div class="row">
                    <div class="col-md-6">
                        <h1>
                            ${resource.getNom()}
                        </h1>
                    </div>
                    <c:choose>
                        <c:when test="${role == 'expert'}">
                            <div class="col-lg-3 col-md-6 my-2">
                                <div class="text-md-right height-100p">
                                    <a class="btn btn-outline-primary" data-toggle="modal" data-target="#model-add-role">Ajouter Usage</a>
                                </div>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="col-lg-3 col-md-6 my-2">
                                <div class="text-md-right height-100p">
                                    <a class="btn btn-primary" href="/resource-demand">Demander autorisation</a>
                                </div>
                            </div>
                        </c:otherwise>
                    </c:choose>


                </div> <!-- END row-->
                <div class="col-12 mt-4">
                    <ul class="nav tab-line tab-line tab-line--3x border-bottom mb-5" role="tablist">
                        <li class="nav-item">
                            <a class="nav-link active" data-toggle="tab" href="#tabDescription" role="tab" aria-selected="true">
                                Informations generales
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="tab" href="#tabInstructors" role="tab" aria-selected="true">
                                Informations categorie superieur
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" data-toggle="tab" href="#tabReviews" role="tab" aria-selected="true">
                                Usage
                            </a>
                        </li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane fade show active" id="tabDescription" role="tabpanel">
                            <h4>
                                Description
                            </h4>
                            <p>
                                ${resource.getDescription()}
                            </p>
                            <h4>
                                Caracteristiques
                            </h4>
                            <p>
                                ${resource.getCarracteristics()}
                            </p>
                        </div> <!-- END tab-pane-->



                        <div class="tab-pane fade" id="tabInstructors" role="tabpanel">
                            <h3 class="mb-4">
                                Information Type du categorie
                            </h3>

                            <div class="border-bottom mb-4 pb-4">

                                <h6>
                                    ${resource.getType().getNomType()}
                                </h6>
                                <p>
                                    ${resource.getType().getDescription()}
                                </p>
                                <h6>
                                    Caracteristiques
                                </h6>
                                <p>
                                    ${resource.getType().getCarracteristics()}
                                </p>
                            </div>
                        </div> <!-- END tab-pane -->

                        <div class="tab-pane fade" id="tabReviews" role="tabpanel">
                            <h4 class="mb-4">
                                L usage de la resource ${resource.getNom()}
                            </h4>
                            <p>
                                ${usage.getDescription()}
                            </p>
                        </div> <!-- END tab-pane -->

                    </div> <!-- END tab-content-->
                </div> <!-- END col-12 -->
            </div> <!-- END col-lg-9 -->

            <aside class="col-lg-3">
                <div class="card border border-light marginTop-30 shadow-v1">
                    <h4 class="card-header border-bottom mb-0 h6">Selectioner autre resources</h4>
                    <ul class="card-body list-unstyled mb-0">
                        <li class="mb-2"><a href="">Alimentation et agriculture</a></li>
                        <li class="mb-2"><a href="">Resources Marines</a></li>
                        <li class="mb-2"><a href="">Faune sauvage et domestique</a></li>
                        <li class="mb-2"><a href="">Micro-organism</a></li>
                    </ul>
                </div>
            </aside> <!-- END col-lg-3 -->

        </div> <!-- END row-->
    </div> <!-- END container-->
</section>

<div class="col-md-6">
    <div id="model-add-role" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
        <div class="modal-dialog">
            <div class="modal-content">

                <div class="modal-header">
                    <h4 class="modal-title">Ajouter un usage pour cette resource</h4>
                </div>

                <div class="modal-body">
                    <form method="post" action="/add-usage">
                        <div class="form-group">
                            <label for="recipient-name" class="control-label">Description d usage de la resource</label>
                            <textarea type="text" name="description" class="form-control" id="recipient-name" required></textarea>
                            <input type="hidden" name="resource_id" value="${resource.getId()}">
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