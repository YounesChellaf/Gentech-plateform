<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title data-layout-title-pattern="$LAYOUT_TITLE | $CONTENT_TITLE">Gentellela!</title>

    <!-- Bootstrap -->
    <link href="webjars/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="webjars/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="webjars/nprogress/nprogress.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
<div class="container body">
    <div class="main_container">
        <div class="col-md-3 left_col">
            <div class="left_col scroll-view">
                <div class="navbar nav_title" style="border: 0;">
                    <a href="" class="site_title"><i class="fa fa-paw"></i> <span>Gentech</span></a>
                </div>

                <div class="clearfix"></div>

                <!-- menu profile quick info -->
                <%--                <div data-th-replace="fragments/fragment-menu-profile-quick-info :: menu-profile-quick-info"></div>--%>
                <jsp:include page="fragments/fragment-menu-profile-quick-info.jsp"/>
                <!-- /menu profile quick info -->

                <br/>

                <!-- sidebar menu -->
                <%--                <div data-th-replace="fragments/fragment-sidebar-menu :: sidebar-menu"></div>--%>
                <jsp:include page="fragments/fragment-sidebar-menu.jsp"/>
                <!-- /sidebar menu -->

                <!-- /menu footer buttons -->
                <!--<div data-th-replace="fragments/fragment-menu-footer-buttons :: menu-footer-buttons"></div>-->
                <!-- /menu footer buttons -->

            </div>
        </div>

        <!-- top navigation -->
        <%--        <div data-th-replace="fragments/fragment-top-navigation :: top-navigation"></div>--%>
        <jsp:include page="fragments/fragment-top-navigation.jsp"/>
        <!-- /top navigation -->




        <!-- page content -->

        <div class="right_col" role="main" >
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>Plain Page</h3>
                    </div>

                    <div class="title_right">
                        <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                            <div class="input-group">
                                <input type="text" class="form-control" placeholder="Search for...">
                                <span class="input-group-btn">
                      <button class="btn btn-default" type="button">Go!</button>
                    </span>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_title">
                                <h2>Plain Page</h2>
                                <ul class="nav navbar-right panel_toolbox">
                                    <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                                    </li>
                                    <li class="dropdown">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                                           aria-expanded="false"><i class="fa fa-wrench"></i></a>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="#">Settings 1</a>
                                            </li>
                                            <li><a href="#">Settings 2</a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li><a class="close-link"><i class="fa fa-close"></i></a>
                                    </li>
                                </ul>
                                <div class="clearfix"></div>
                            </div>
                            <div class="x_content">
                                Add content to the page ...
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- /page content -->


        <!-- footer content -->
        <%--        <div data-th-replace="fragments/fragment-footer-content :: footer-content"></div>--%>
        <jsp:include page="fragments/fragment-footer-content.jsp"/>
        <!-- /footer content -->
    </div>
</div>

<!-- jQuery -->
<script src="webjars/jquery/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="webjars/fastclick/fastclick.js"></script>
<!-- NProgress -->
<script src="webjars/nprogress/nprogress.js"></script>

<!-- Custom Theme Scripts -->
<script src="js/custom.min.js"></script>
</body>
</html>
