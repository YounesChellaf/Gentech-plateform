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
                <img class="wow fadeInLeft w-100 rounded" src="/uploads/${article.getFile().getName()}" alt="">
            </div>

            <div class="col-lg-6">
                <h2>
                    ${article.getTitle()}
                </h2>
                <div class="width-4rem height-4 bg-primary rounded mt-4 marginBottom-40"></div>
                <p class="mb-5">
                    ${article.getContent()}
                </p>
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