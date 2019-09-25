<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="ec-nav sticky-top bg-white">
    <div class="container">
        <div class="navbar p-0 navbar-expand-lg">
            <div class="navbar-brand">
                <a class="logo-default" href="/"><strong>Gentech</strong></a>
            </div>
            <span aria-expanded="false" class="navbar-toggler ml-auto collapsed" data-target="#ec-nav__collapsible" data-toggle="collapse">
        <div class="hamburger hamburger--spin js-hamburger">
          <div class="hamburger-box">
            <div class="hamburger-inner"></div>
          </div>
        </div>
      </span>
            <div class="collapse navbar-collapse when-collapsed" id="ec-nav__collapsible">
                <ul class="nav navbar-nav ec-nav__navbar ml-auto">

                    <li class="nav-item nav-item__has-dropdown">
                        <a class="nav-link" href="/resources">Resources</a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="institutions">Institution</a>
                    </li>

                    <li class="nav-item nav-item__has-dropdown">
                        <a class="nav-link" href="lois-reglements"> Lois et reglement </a>
                    </li>
                    <li class="nav-item nav-item__has-dropdown">
                        <a class="nav-link" href=""></a>
                    </li>
                    <c:choose>
                        <c:when test="${logged_in != true}">
                            <li class="nav-item nav-item__has-dropdown">
                                <a class="nav-link" href="login"><button style="margin-top: -10px" class="btn btn-outline-success">Connecter</button></a>
                            </li>
                            <li class="nav-item nav-item__has-dropdown">
                                <a class="nav-link" href="login#signup"><button style="margin-top: -10px" class="btn btn-outline-dark">S inscrire</button></a>
                            </li>
                        </c:when>
                        <c:otherwise>

                        </c:otherwise>
                    </c:choose>

                </ul>
            </div>
            <div class="nav-toolbar">
                <ul class="navbar-nav ec-nav__navbar">
                    <li class="nav-item">
                        <a class="nav-link site-search-toggler" href="#">
                            <i class="ti-search"></i>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
    </div> <!-- END container-->
</nav> <!-- END ec-nav -->
<div class="site-search">
    <div class="site-search__close bg-black-0_8"></div>
    <form class="form-site-search" action="#" method="POST">
        <div class="input-group">
            <input type="text" placeholder="Search" class="form-control py-3 border-white" required="">
            <div class="input-group-append">
                <button class="btn btn-primary" type="submit"><i class="ti-search"></i></button>
            </div>
        </div>
    </form>
</div> <!-- END site-search-->