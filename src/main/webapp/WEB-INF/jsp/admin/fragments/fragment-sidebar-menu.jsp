<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="sidebar-menu" class="main_menu_side hidden-print main_menu" data-th-fragment="sidebar-menu">
    <div class="menu_section">
        <h3>
            -
        </h3>
        <ul class="nav side-menu">
            <c:choose>
                <c:when test="${role == 'admin'}">
                    <li><a><i class="fa fa-home"></i>Gestion utilisateur<span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="/admin/users">Utilisateurs</a></li>
                            <li><a href="/admin/roles">Role</a></li>
                        </ul>
                    </li>
                    </li>
                    <li><a><i class="fa fa-desktop"></i>Presentation APA<span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="admin/articles">Articles</a></li>
                        </ul>
                    </li>
                    <li><a href="/admin/reglement"><i class="fa fa-edit"></i>Lois et reglements</a></li>

                    <li><a><i class="fa fa-home"></i>Institutions & RH<span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="/admin/institution">Institutions</a></li>
                            <li><a href="/admin/rh">RH</a></li>
                        </ul>
                    </li>
                    <li><a href="/admin/request-permis"><i class="fa fa-sitemap"></i>Demande de permis</a>
                    <li><a><i class="fa fa-bug"></i>Ressources genetiques<span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="/admin/categories">Categorie</a></li>
                            <li><a href="/admin/type">Type</a></li>
                        </ul>
                    </li>
                </c:when>
                <c:otherwise>
                    <li><a href="/expert/request-permis"><i class="fa fa-sitemap"></i>Demande de permis</a>
                    <li><a><i class="fa fa-bug"></i>Ressources genetiques<span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="/admin/categories">Categorie</a></li>
                            <li><a href="/admin/type">Type</a></li>
                        </ul>
                    </li>
                </c:otherwise>
            </c:choose>
        </ul>
    </div>

</div>