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


<section class="paddingTop-30 paddingBottom-50 bg-light-v2">
    <div class="container">
        <input id="autocomplete-input" class="autocomplete" type="text" placeholder="Search" aria-label="Search">
        <c:forEach var="reglement" items="${reglements}">
        <div class="list-card align-items-center shadow-v1 marginTop-30">
            <div class="col-lg-4 px-lg-4 my-4">
                <img class="w-50" src="/images/pdf.png" alt="" >
            </div>
            <div class="col-lg-8 paddingRight-30 my-4">
                <div class="media justify-content-between">
                    <div class="group">
                        <a href="/uploads/${reglement.getFile().getName()}" class="h4" target="_blank">
                            ${reglement.getDesignation()}
                        </a>
                    </div>
                </div>
                <p>
                    ${reglement.getDescription()}
                </p>
                <div class="d-md-flex justify-content-between align-items-center">
                    <ul class="list-inline mb-md-0">
                        <li class="list-inline-item mr-3">
                            <span class="h4 d-inline text-primary">Admin</span>

                        </li>
                        <li class="list-inline-item mr-3">
                            <i class="ti-time small mr-2"></i>
                            ${reglement.getDate()}
                        </li>
                    </ul>
                    <span class="badge badge-success">Document fiable</span>
                </div>
            </div>
        </div>
        </c:forEach>


        <div class="row">
            <div class="col-12 marginTop-70">
                <ul class="pagination pagination-primary justify-content-center">
                    <li class="page-item mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">
                            <i class="ti-angle-left small"></i>
                        </a>
                    </li>
                    <li class="page-item active disabled mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">1</a>
                    </li>
                    <li class="page-item disabled mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">
                            <i class="ti-more-alt"></i>
                        </a>
                    </li>
                    <li class="page-item mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">3</a>
                    </li>
                    <li class="page-item mx-1">
                        <a class="page-link iconbox iconbox-sm rounded-0" href="#">
                            <i class="ti-angle-right small"></i>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <!-- END row-->
    </div> <!-- END container-->
</section>



<jsp:include page="fragments/footer.jsp"/>

<div class="scroll-top">
    <i class="ti-angle-up"></i>
</div>

<script src="js/vendors.bundle.js"></script>
<script src="/js/jquery.autocomplete.js"></script>
<script src="js/scripts.js"></script>
<script>
    $(document).ready(function() {
        $('#autocomplete-input').devbridgeAutocomplete({
            serviceUrl: '/suggestion',
            paramName: 'searchstr',
            minChars: 1,
            autoSelectFirst: true,
        });
    });
</script>
</body>
</html>