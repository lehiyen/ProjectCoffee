<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
<%--    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/HomePage.css" type="text/css" media="all"/>--%>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
          integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>HOME</title>
    <style>
        body, html {
            font-family: 'Ubuntu', sans-serif;
            background-color: #9EA4EC;

        }

        .containerHome {
            color: #FFFFFF;
            border-radius: 15px;
            width: 100%;
            height: 565px;
            background-color: #9EA4EC;
        }

        .header_home {
            color: #FFFFFF;
            border-radius: 13px;
            border: 1px solid #9EA4EC;
            height: 50px;
            position: relative;
        }

        .posisionbtn {
            color: #FFFFFF;
            position: relative;
            display: flex;
            margin-top: 13px;
            margin-left: 10px;
            flex-direction: row;

        }

        .btn-primary {
            height: 25px;
            width: 25px;

        }

        .fa-plus:before {
            justify-content: center;
            align-items: center;
            margin-left: -5px;
            position: absolute;
            margin-top: -14px;
        }

        .fa-globe:before {
            justify-content: center;
            align-items: center;
            margin-left: -5px;
            position: absolute;
            margin-top: -14px;
        }

        .fa-print:before {
            justify-content: center;
            align-items: center;
            margin-left: -5px;
            position: absolute;
            margin-top: -14px;
        }

        .fa-user:before {
            justify-content: center;
            align-items: center;
            margin-left: -8px;
            position: absolute;
            margin-top: -10px;
        }

        .fa-sync-alt:before {
            justify-content: center;
            align-items: center;
            margin-left: -5px;
            position: absolute;
            margin-top: -14px;
        }

        .fa-volume-up:before {
            justify-content: center;
            align-items: center;
            margin-left: -5px;
            position: absolute;
            margin-top: -14px;
        }

        .fa-lg:before {
            justify-content: center;
            align-items: center;
            margin-left: -8px;
            position: absolute;
            margin-top: -16px;
        }

        button.btn.btn-primary.btn-circle-lg {
            width: 35px;
            height: 35px;
            margin-top: -6px;
        }

        .fa-user:before {
            content: "\f007";
            margin-top: -13px;
        }

        .content_tab {
            box-shadow: 0px 19px 22px -2px rgba(255, 135, 23, 0.44);
            width: 575px;
            height: 445px;
            border-radius: 13px;
            background-color: #FFFFFF;
            margin-left: -205px;
            margin-top: 38px;
        }

        .content_tab2 {
            box-shadow: 0px 19px 22px -2px rgba(255, 135, 23, 0.44);
            width: 620px;
            height: 445px;
            border-radius: 13px;
            background-color: #FFFFFF;
            margin-left: -114px;
            margin-top: 38px;
        }

        .btnclick {
            position: absolute;
            width: 530px;
            height: 30px;
            margin-left: 710px;
            margin-top: 5px;

        }

        .fa, .fas {
            font-family: "Font Awesome 5 Pro";
            font-weight: 900;
        }

        button.btn.btn-primary.dropdown-toggle {
            width: 87px;
            margin-left: 406px;
            margin-top: -54px;
        }

        ul.dropdown-menu {
            margin-left: 365px;
            margin-top: -17px;
        }

        button.btn.btn-primary.dropdown-toggle1 {
            width: 100px;
            margin-left: 499px;
            margin-top: -92px;
        }

        .fa-pencil:before {
            justify-content: center;
            align-items: center;
            margin-left: -6px;
            position: absolute;
            margin-top: -14px;
        }

        .fa-history:before {
            justify-content: center;
            align-items: center;
            margin-left: -6px;
            position: absolute;
            margin-top: -14px;
        }

        .total {
            width: 73px;
            height: 24px;
            position: absolute;
            margin-left: 202px;
            margin-top: -30px;
        }

        .sellinfo {
            display: flex;
            width: 620px;
            height: 49px;
            margin-top: -20px;
        }

        .sell {
            background: #5bff4c;
            width: 50%;
            border-bottom-left-radius: 13px;
        }

        .info {
            background: rgba(73, 82, 140, 0.82);
            width: 50%;
            border-bottom-right-radius: 13px;
        }

        .sellbill {
            font-size: 30px;
            text-align: center;
        }
    </style>
</head>
<body>
<div class="containerHome">

    <div class="header_home">
        <div class="posisionbtn">
            <ul class="nav nav-tabs">
                <li><a data-toggle="tab" href="#ban">Phòng bàn</a></li>
                <li><a data-toggle="tab" href="#menu">Thực Đơn</a></li>

            </ul>

            <div class="content_tab">
                <div id="ban" class="tab-pane fade">
                    <h3>Menu 1</h3>

                </div>
                <div id="menu" class="tab-pane fade">
                    <h3>Menu 2</h3>

                </div>
            </div>


            <form class="form-inline d-flex justify-content-center md-form form-sm active-purple-2 mt-2">
                <input class="form-control form-control-sm mr-3 w-75" type="text" placeholder="Tìm kiếm"
                       style="width: 315px ; margin-left: -355px"
                       aria-label="Search">
                <i class="fas fa-search" aria-hidden="true"></i>
            </form>
            <ul class="nav nav-tabs">
                <li><a data-toggle="tab" href="#bill1" style="margin-left: 35px">Hóa đơn 1</a></li>

            </ul>

            <div class="content_tab2">
                <form class="form-inline d-flex justify-content-center md-form form-sm active-purple-2 mt-2">
                    <input class="form-control form-control-sm mr-3 w-75" type="text" placeholder="Tìm kiếm"
                           style="height: 30px;width: 265px ; margin-left: 119px; margin-top: 5px"
                           aria-label="Search">
                    <i class="fas fa-search" aria-hidden="true" style="color: #9EA4EC"></i>
                </form>
                <div class="dropdown">
                    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Bảng giá
                        <span class="caret"></span></button>
                    <ul class="dropdown-menu">
                        <li><a href="#">Giá gốc</a></li>
                        <li><a href="#">Giá khuyến mãi</a></li>
                    </ul>
                </div>
                <div class="dropdown">
                    <button class="btn btn-primary dropdown-toggle1" type="button" data-toggle="dropdown">Loại khách
                        <span class="caret"></span></button>
                    <ul class="dropdown-menu " style="margin-left:459px ; margin-top: -37px">
                        <li><a href="#">Khách mới</a></li>
                        <li><a href="#">Khách thân thiết</a></li>
                    </ul>
                </div>
                <div class="note" style="height: 70px;background-color: gainsboro ; margin-top: 250px;display: flex">
                    <button type="button" class="btn btn-primary btn-circle" style="margin-top: 33px;margin-left: 15px">
                        <i class="fa fa-pencil"></i> &nbsp; &nbsp;
                        Ghi chú
                    </button>
                    <button type="button" class="btn btn-primary btn-circle" style="margin-top: 33px;margin-left: 70px">
                        <i class="fas fa-history"></i> &nbsp;&nbsp;
                        Lịch sử
                    </button>
                </div>
                <p class="total">Tổng tiền: </p>

                <button type="button" class="btn btn-primary btn-circle"
                        style="width: 125px;margin-left: 480px;margin-top: -60px">
                    Tách ghép đơn
                </button>
                <div class="sellinfo">
                    <div class="sell"><p class="sellbill">Thanh Toán</p></div>
                    <div class="info"><p class="sellbill">Thông Báo</p></div>
                </div>
            </div>
            <div class="btnclick">
                <button type="button" class="btn btn-primary btn-circle"><i class="fas fa-plus"></i>
                </button>
                &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                <button type="button" class="btn btn-primary btn-circle"><i class="fa fa-volume-up"></i></button>
                &nbsp
                <button type="button" class="btn btn-primary btn-circle"><i class="fas fa-globe"></i></button>
                &nbsp
                <button type="button" class="btn btn-primary btn-circle" style="color: #FFFFFF"><i
                        class="fas fa-sync-alt"></i></button>
                &nbsp
                <button type="button" class="btn btn-primary btn-circle"><i class="fa fa-print"></i></button>
                &nbsp
                <button type="button" class="btn btn-primary btn-circle-lg"><i class="fas fa-user fa-lg"></i></button>
                &nbsp
                <button type="button" class="btn btn-primary btn-circle-lg"><i
                        class="glyphicon glyphicon-list fa-lg"></i>
                </button>


            </div>
        </div>
    </div>
    <div class="footer" style=" height: 30px; width: 100%;margin-top: 460px;text-align: center;margin-left: -115px">
        Hotline: 0927007791
    </div>
</div>
</body>
</html>