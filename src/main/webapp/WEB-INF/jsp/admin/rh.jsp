<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Gentellela!</title>

    <!-- Bootstrap -->
    <link href="/webjars/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="/webjars/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="/webjars/nprogress/nprogress.css" rel="stylesheet">
    <%--    datatable--%>
    <!-- Custom Theme Style -->
    <link href="/css/custom.min.css" rel="stylesheet">
    <link href="/css/green.css" rel="stylesheet">
    <link href="../../../../resources/static/css/dataTables.bootstrap.min.css" rel="stylesheet">
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

        <div class="right_col" role="main">
            <div class="">
                <div class="page-title">
                    <div class="title_left">
                        <h3>Gestion des RHs</h3>
                    </div>

                    <div class="title_right">
                        <div class="col-md-5 col-sm-5 col-xs-12 form-group pull-right top_search">
                            <div class="input-group">
                                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#model-add-role">Ajouter une Resource Humaine</button>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="clearfix"></div>

                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12">
                        <div class="x_panel">
                            <div class="x_content">
                                <table id="datatable-buttons" class="table table-striped table-bordered">
                                    <thead>
                                    <tr>
                                        <th>Nom</th>
                                        <th>description</th>
                                        <th>contact</th>
                                        <th>institution</th>
                                        <th>Modifier</th>
                                        <th>Supprimer</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="rh" items="${rhs}">
                                        <tr>
                                            <td>${rh.getNom()}</td>
                                            <td>${rh.getDescription()}</td>
                                            <td>${rh.getContact()}</td>
                                            <td>${rh.getInstitution().getName()}</td>
                                            <td><button class="btn btn-success" data-toggle="modal" data-target="#model-update-role-${rh.getId()}">Modifier</button></td>
                                            <td><button class="btn btn-danger" data-toggle="modal" data-target="#model-remove-role-${rh.getId()}">Supprimer</button></td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-md-4">
            <div id="model-add-role" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">Ajouter une nouvelle RH</h4>
                        </div>
                        <div class="modal-body">
                            <form method="POST" action="/admin/add-rh">
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Nom</label>
                                    <input type="text" name="nom" class="form-control" id="recipient-name" required>
                                </div>
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Description</label>
                                    <input type="text" name="description" class="form-control"  required>
                                </div>
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">Contact</label>
                                    <input type="text" name="contact" class="form-control" required>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-12">
                                        <label for="recipient-name" class="control-label">Institution</label>
                                        <select name="institu_id" class="form-control">
                                            <option value="">Choisir une institution</option>
                                            <c:forEach var="institu" items="${institus}">
                                                <option value="${institu.getId()}">${institu.getName()}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
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

<%--        <c:forEach var="institu" items="${institutions}">--%>
<%--            <div class="col-md-4">--%>
<%--                <div id="model-update-role-${institu.getId()}" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">--%>
<%--                    <div class="modal-dialog">--%>
<%--                        <div class="modal-content">--%>
<%--                            <div class="modal-header">--%>
<%--                                <h4 class="modal-title">Modifier ce role dans le system</h4>--%>
<%--                            </div>--%>
<%--                            <div class="modal-body">--%>
<%--                                <form method="post" action="/admin/update-institution">--%>

<%--                                    <div class="form-group">--%>
<%--                                        <label for="recipient-name" class="control-label">Nom d'institution</label>--%>
<%--                                        <input type="text" name="name" class="form-control" value="${institu.getName()}">--%>
<%--                                        <input type="hidden" name="id" value="${institu.getId()}">--%>
<%--                                    </div>--%>
<%--                                    <div class="form-group row">--%>
<%--                                        <div class="col-sm-12">--%>
<%--                                            <label for="recipient-name" class="control-label">Region</label>--%>
<%--                                            <select name="region" class="form-control">--%>
<%--                                                <option value="">Choisir une categorie</option>--%>
<%--                                                <option value="Nord">Nord</option>--%>
<%--                                                <option value="Est">Est</option>--%>
<%--                                                <option value="Ouest">Ouest</option>--%>
<%--                                                <option value="Sud">Sud</option>--%>
<%--                                            </select>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <div class="form-group">--%>
<%--                                        <label for="recipient-name" class="control-label">Localisation d institution</label>--%>
<%--                                        <input type="text" name="location" class="form-control" value="${institu.getLocation()}"  required>--%>
<%--                                    </div>--%>
<%--                                    <div class="form-group">--%>
<%--                                        <label for="recipient-name" class="control-label">Description</label>--%>
<%--                                        <textarea type="text" name="description" class="form-control"  required>${institu.getDescription()}</textarea>--%>
<%--                                    </div>--%>
<%--                                    <div class="modal-footer">--%>
<%--                                        <button type="submit" class="btn btn-primary">Modifier</button>--%>
<%--                                    </div>--%>
<%--                                </form>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--            <div class="col-md-4">--%>
<%--                <div id="model-remove-role-${institu.getId()}" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">--%>
<%--                    <div class="modal-dialog">--%>
<%--                        <div class="modal-content">--%>
<%--                            <div class="modal-header">--%>
<%--                                <h4 class="modal-title">Supprimer ce role dans le system</h4>--%>
<%--                            </div>--%>
<%--                            <div class="modal-body">--%>
<%--                                <form method="post" action="/admin/remove-institution">--%>
<%--                                    <div class="form-group">--%>
<%--                                        <p>Etes vous sure de supprimer le role de ${institu.getName()}</p>--%>
<%--                                        <input type="hidden" value="${institu.getId()}" name="id">--%>
<%--                                    </div>--%>
<%--                                    <div class="modal-footer">--%>
<%--                                        <button type="submit" class="btn btn-danger">Supprimer</button>--%>
<%--                                    </div>--%>
<%--                                </form>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--        </c:forEach>--%>

        <!-- /page content -->


        <!-- footer content -->
        <%--        <div data-th-replace="fragments/fragment-footer-content :: footer-content"></div>--%>
        <jsp:include page="fragments/fragment-footer-content.jsp"/>
        <!-- /footer content -->
    </div>
</div>

<!-- jQuery -->
<script src="/webjars/jquery/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<!-- FastClick -->
<script src="/webjars/fastclick/fastclick.js"></script>
<!-- NProgress -->
<script src="/webjars/nprogress/nprogress.js"></script>

<!-- Custom Theme Scripts -->
<script src="/js/custom.min.js"></script>
<script src="/js/dataTables.bootstrap.min.js"></script>
<script src="/js/jquery.dataTables.min.js"></script>
</body>
</html>
