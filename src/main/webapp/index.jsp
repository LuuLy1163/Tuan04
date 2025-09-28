<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Trang chủ - Quản lý tin tức</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .header {
            text-align: center;
        }
        .header img {
            width: 100%;
            height: 120px;
            object-fit: cover;
        }
        .menu {
            background-color: #f2f2f2;
            text-align: center;
            padding: 8px;
            border-top: 1px solid #ccc;
            border-bottom: 1px solid #ccc;
        }
        .menu a {
            margin: 0 15px;
            text-decoration: none;
            font-weight: bold;
            color: #333;
        }
        .menu a:hover {
            color: #007bff;
        }
        .content {
            min-height: 300px;
            padding: 20px;
        }
        .footer {
            text-align: center;
            font-size: 14px;
            padding: 10px;
            border-top: 1px solid #ccc;
            background-color: #f9f9f9;
        }
    </style>
</head>
<body>

<div class="header">
    <img src="images/banner.jpg" alt="NEWS">
</div>

<div class="menu">
    <a href="${pageContext.request.contextPath}/danhsach">Danh sách tin tức</a> |
    <a href="${pageContext.request.contextPath}/views/TinTucForm.jsp">Thêm tin tức mới</a> |
    <a href="#">Chức năng quản lý</a>
</div>

<div class="content">
    <!-- Nội dung chính sẽ được hiển thị ở đây -->
</div>

<div class="footer">
    Họ tên sinh viên – Mã sinh viên – Lớp
</div>

</body>
</html>
