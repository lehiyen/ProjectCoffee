<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html dir="ltr" lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="assets/images/favicon.png">
    <title>Quản lí hóa đơn</title>
    <!-- Custom CSS -->
    <link rel="stylesheet" type="text/css" href="../admin-page/assets/extra-libs/multicheck/multicheck.css">
    <link href="../admin-page/assets/libs/datatables.net-bs4/css/dataTables.bootstrap4.css" rel="stylesheet">
    <link href="../admin-page/dist/css/style.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../admin-page/styleAdmin/style.css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<!-- ============================================================== -->
<!-- Preloader - style you can find in spinners.css -->
<!-- ============================================================== -->
<div class="preloader">
    <div class="lds-ripple">
        <div class="lds-pos"></div>
        <div class="lds-pos"></div>
    </div>
</div>
<!-- ============================================================== -->
<!-- Main wrapper - style you can find in pages.scss -->
<!-- ============================================================== -->
<div id="main-wrapper">
    <!-- ============================================================== -->
    <!-- Topbar header - style you can find in pages.scss -->
    <!-- ============================================================== -->
    <header class="topbar" data-navbarbg="skin5">
        <nav class="navbar top-navbar navbar-expand-md navbar-dark">
            <div class="navbar-header" data-logobg="skin5">
                <!-- This is for the sidebar toggle which is visible on mobile only -->
                <a class="nav-toggler waves-effect waves-light d-block d-md-none" href="javascript:void(0)"><i
                        class="ti-menu ti-close"></i></a>
                <!-- ============================================================== -->
                <!-- Logo -->
                <!-- ============================================================== -->
                <a class="navbar-brand" href="index.html">
                    <!-- Logo icon -->
                    <b class="logo-icon p-l-10">
                        <!--You can put here icon as well // <i class="wi wi-sunset"></i> //-->
                        <!-- Dark Logo icon -->
                        <img class="logo-admin" src="../admin-page/assets/images/logo-icon.jpg" alt="homepage"
                             class="light-logo"/>

                    </b>
                    <!--End Logo icon -->
                    <!-- Logo text -->
                    <span class="logo-text">
                             <!-- dark Logo text -->
                             <img src="../admin-page/assets/images/logo-text.png" alt="homepage" class="light-logo"/>

                        </span>

                </a>

                <button type="button" class="btn btn-danger"
                        style="width: 124px;position: absolute;margin-left: 1077px;margin-top: -51px">
                    <c:if test="${sessionScope.acc!=null}">

                        HI! ${sessionScope.acc.userName}
                    </c:if>
                </button>
                <a class="topbartoggler d-block d-md-none waves-effect waves-light" href="javascript:void(0)"
                   data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                   aria-expanded="false" aria-label="Toggle navigation"><i class="ti-more"></i></a>
            </div>
            <!-- ============================================================== -->

            <!-- End Logo -->
            <!-- ============================================================== -->

        </nav>
    </header>
    <!-- ============================================================== -->
    <!-- End Topbar header -->
    <!-- ============================================================== -->
    <!-- ============================================================== -->
    <!-- Left Sidebar - style you can find in sidebar.scss  -->
    <!-- ============================================================== -->
    <aside class="left-sidebar" data-sidebarbg="skin5">
        <!-- Sidebar scroll-->
        <div class="scroll-sidebar">
            <!-- Sidebar navigation-->
            <nav class="sidebar-nav">
                <ul id="sidebarnav" class="p-t-30">

                    </li>

                    <li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link" href="#"
                                                aria-expanded="false"><i class="fas fa-home"></i><span
                            class="hide-menu">Trang chủ</span></a></li>
                    <li class="sidebar-item"><a class="sidebar-link has-arrow waves-effect waves-dark"
                                                href="javascript:void(0)" aria-expanded="false"><i
                            class="fas fa-shopping-cart"></i><span class="hide-menu">Quản lý sản phẩm </span></a>
                        <ul aria-expanded="false" class="collapse  first-level">
                            <li class="sidebar-item"><a href="tongquan.html" class="sidebar-link"><span
                                    class="hide-menu"> Tổng quan sản phẩm </span></a></li>
                            <li class="sidebar-item"><a href="themSanPham.html" class="sidebar-link"><span
                                    class="hide-menu">Thêm sản phẩm </span></a></li>
                        </ul>
                    </li>
                    <li class="sidebar-item"><a class="sidebar-link has-arrow waves-effect waves-dark"
                                                href="javascript:void(0)" aria-expanded="false"> <i
                            class="fas fa-address-book"></i><span class="hide-menu">Quản lí tài khoản </span></a>
                        <ul aria-expanded="false" class="collapse  first-level">
                            <li class="sidebar-item"><a href="/store/OverViewUser.jsp" class="sidebar-link"><span
                                    class="hide-menu">Tổng quan </span></a></li>
                            <li class="sidebar-item"><a href="/store/signUp.jsp" class="sidebar-link"><span
                                    class="hide-menu"> Thêm tài khoản  </span></a></li>


                        </ul>
                    </li>
                    <li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link"
                                                href="../admin-page/quanlihoadon.html" aria-expanded="false"><i
                            class="mdi mdi-move-resize-variant"></i><span class="hide-menu">Quản lý hóa đơn</span></a>

                    </li>
                    <li class="sidebar-item"><a class="sidebar-link waves-effect waves-dark sidebar-link"
                                                href="login.html" aria-expanded="false"><i
                            class="fas fa-sign-out-alt"></i><span class="hide-menu">Đăng xuất</span></a></li>


                </ul>
            </nav>
            <!-- End Sidebar navigation -->
        </div>
        <!-- End Sidebar scroll-->
    </aside>
    <!-- ============================================================== -->
    <!-- End Left Sidebar - style you can find in sidebar.scss  -->
    <!-- ============================================================== -->
    <!-- ============================================================== -->
    <!-- Page wrapper  -->
    <!-- ============================================================== -->
    <div class="page-wrapper">
        <!-- ============================================================== -->
        <!-- Bread crumb and right sidebar toggle -->
        <!-- ============================================================== -->
        <div class="page-breadcrumb">
            <div class="row">
                <div class="col-12 d-flex no-block align-items-center">
                    <h4 class="page-title">Quản lí hóa đơn</h4>

                </div>
            </div>
        </div>
        <!-- ============================================================== -->
        <!-- End Bread crumb and right sidebar toggle -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- Container fluid  -->
        <!-- ============================================================== -->
        <div class="container-fluid">
            <!-- ============================================================== -->
            <!-- Start Page Content -->
            <!-- ============================================================== -->
            <div class="row">
                <div class="col-12">

                    <div class="card">
                        <div class="card-body">

                            <div class="table-responsive">
                                <table id="zero_config" class="table table-striped table-bordered">
                                    <thead>
                                    <tr>
                                        <th>Mã đơn hàng</th>
                                        <th>Tên khách hàng</th>
                                        <th>Ngày tạo</th>
                                        <th>Thao Tác</th>

                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td><a href="../admin-page/chiTietHoaDon.html">11234H2</a></td>
                                        <td>Nhân Võ</td>

                                        <td>20/11/2020</td>

                                        <td><i class="fas fa-trash-alt hover-icon icon-delete"></i><i
                                                class="far fa-edit"></i></td>

                                    </tr>
                                    <tr>
                                        <td><a href="../admin-page/chiTietHoaDon.html">11564H12</a></td>
                                        <td>Nhân Nguyễn</td>

                                        <td>20/11/2019</td>


                                        <td><i class="fas fa-trash-alt hover-icon icon-delete"></i><i
                                                class="far fa-edit"></i></td>
                                    </tr>
                                    <tr>
                                        <td><a href="../admin-page/chiTietHoaDon.html">11234P2</a></td>
                                        <td>Nhân Tâm</td>

                                        <td>20/3/2020</td>


                                        <td><i class="fas fa-trash-alt hover-icon icon-delete"></i><i
                                                class="far fa-edit"></i></td>
                                    </tr>
                                    <tr>
                                        <td><a href="../admin-page/chiTietHoaDon.html">11234FH2</a></td>
                                        <td>Nhân Từ</td>

                                        <td>3/11/2020</td>


                                        <td><i class="fas fa-trash-alt hover-icon icon-delete"></i><i
                                                class="far fa-edit"></i></td>
                                    </tr>


                                    </tbody>

                                </table>


                            </div>

                        </div>
                    </div>
                </div>
            </div>
            <!-- ============================================================== -->
            <!-- End PAge Content -->
            <!-- ============================================================== -->
            <!-- ============================================================== -->
            <!-- Right sidebar -->
            <!-- ============================================================== -->
            <!-- .right-sidebar -->
            <!-- ============================================================== -->
            <!-- End Right sidebar -->
            <!-- ============================================================== -->
        </div>
        <!-- ============================================================== -->
        <!-- End Container fluid  -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- footer -->
        <!-- ============================================================== -->
        <footer class="footer text-center">
            All Rights Reserved by Gropu 32. Designed and Developed by <a href="https://wrappixel.com">VYN</a>.
        </footer>
        <!-- ============================================================== -->
        <!-- End footer -->
        <!-- ============================================================== -->
    </div>
    <!-- ============================================================== -->
    <!-- End Page wrapper  -->
    <!-- ============================================================== -->
</div>
<!-- ============================================================== -->
<!-- End Wrapper -->
<!-- ============================================================== -->
<!-- ============================================================== -->
<!-- All Jquery -->
<!-- ============================================================== -->
<script src="../admin-page/assets/libs/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap tether Core JavaScript -->
<script src="../admin-page/assets/libs/popper.js/dist/umd/popper.min.js"></script>
<script src="../admin-page/assets/libs/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- slimscrollbar scrollbar JavaScript -->
<script src="../admin-page/assets/libs/perfect-scrollbar/dist/perfect-scrollbar.jquery.min.js"></script>
<script src="../admin-page/assets/extra-libs/sparkline/sparkline.js"></script>
<!--Wave Effects -->
<script src="../admin-page/dist/js/waves.js"></script>
<!--Menu sidebar -->
<script src="../admin-page/dist/js/sidebarmenu.js"></script>
<!--Custom JavaScript -->
<script src="../admin-page/dist/js/custom.min.js"></script>
<!-- this page js -->
<script src="../admin-page/assets/extra-libs/multicheck/datatable-checkbox-init.js"></script>
<script src="../admin-page/assets/extra-libs/multicheck/jquery.multicheck.js"></script>
<script src="../admin-page/assets/extra-libs/DataTables/datatables.min.js"></script>
<script>
    /****************************************
     *       Basic Table                   *
     ****************************************/
    $('#zero_config').DataTable();
</script>

</body>

</html>