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


<section class="pt-5 paddingBottom-100 bg-light-v2">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <div id="accordion">

                    <div class="card card-body accordion-item marginTop-30">
                        <a href="#acc1" class="accordion__title h6 mb-0" data-toggle="collapse" aria-expanded="true">
                            Filtre par type
                            <span class="accordion__icon float-right small mx-2 mt-1">
            <i class="ti-angle-down"></i>
            <i class="ti-angle-up"></i>
          </span>
                        </a>
                        <div id="acc1" class="collapse show" data-parent="#accordion">
                            <div class="mt-4">
                                <p class="mb-2">
                                    <label class="ec-checkbox">
                                        <input type="checkbox" name="checkbox">
                                        <span class="ec-checkbox__control"></span>
                                        <span class="ec-checkbox__lebel">Alimentation</span>
                                    </label>
                                </p>
                                <p class="mb-2">
                                    <label class="ec-checkbox">
                                        <input type="checkbox" name="checkbox">
                                        <span class="ec-checkbox__control"></span>
                                        <span class="ec-checkbox__lebel">Marine</span>
                                    </label>
                                </p>
                                <p class="mb-2">
                                    <label class="ec-checkbox">
                                        <input type="checkbox" name="checkbox">
                                        <span class="ec-checkbox__control"></span>
                                        <span class="ec-checkbox__lebel">Faune</span>
                                    </label>
                                </p>
                                <p class="mb-2">
                                    <label class="ec-checkbox">
                                        <input type="checkbox" name="checkbox">
                                        <span class="ec-checkbox__control"></span>
                                        <span class="ec-checkbox__lebel">Micro-organisme</span>
                                    </label>
                                </p>

                            </div>
                        </div>
                    </div> <!-- END accordion-item-->


                </div> <!-- END accordion-->

            </div>
            <div class="col-md-9">
                <div class="row">

                    <div class="col-lg-4 col-md-6 marginTop-30 wow fadeIn">
                        <div class="card text-center height-100p shadow-v1">
                            <div class="card-header">
                                <img class="w-100" src="/images/resource.jpeg" alt="">
                            </div>
                            <div class="card-body px-3 py-0">
                                <a href="/resource-details" class="h6">Bootstrap Referance Guide</a>
                                <p class="text-gray">
                                    Thomas Rang
                                </p>
                            </div>
                            <div class="card-footer border-top-0">
                                <button class="btn btn-outline-primary mx-1">Details</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 marginTop-30 wow fadeIn">
                        <div class="card text-center height-100p shadow-v1">
                            <div class="card-header">
                                <img class="w-100" src="/images/resource.jpeg" alt="">
                            </div>
                            <div class="card-body px-3 py-0">
                                <a href="/resource-details" class="h6">Bootstrap Referance Guide</a>
                                <p class="text-gray">
                                    Thomas Rang
                                </p>
                            </div>
                            <div class="card-footer border-top-0">
                                <button class="btn btn-outline-primary mx-1">Details</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 marginTop-30 wow fadeIn">
                        <div class="card text-center height-100p shadow-v1">
                            <div class="card-header">
                                <img class="w-100" src="/images/resource.jpeg" alt="">
                            </div>
                            <div class="card-body px-3 py-0">
                                <a href="/resource-details" class="h6">Bootstrap Referance Guide</a>
                                <p class="text-gray">
                                    Thomas Rang
                                </p>
                            </div>
                            <div class="card-footer border-top-0">
                                <button class="btn btn-outline-primary mx-1">Details</button>
                            </div>
                        </div>
                    </div>
                </div> <!-- END row-->
            </div> <!-- END col-md-9-->
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