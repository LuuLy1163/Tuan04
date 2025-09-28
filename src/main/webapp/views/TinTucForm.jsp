<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Thêm tin tức mới</title>
</head>
<body>
<h2>Thêm tin tức mới</h2>
<form action="${pageContext.request.contextPath}/them" method="post">
    <label for="tieuDe">Tiêu đề:</label><br>
    <input type="text" id="tieuDe" name="tieuDe" required><br><br>

    <label for="noiDung">Nội dung:</label><br>
    <textarea id="noiDung" name="noiDung" rows="5" cols="40" required></textarea><br><br>

    <label for="lienKet">Liên kết:</label><br>
    <input type="text" id="lienKet" name="lienKet"><br><br>

    <label for="maDM">Mã danh mục:</label><br>
    <input type="number" id="maDM" name="maDM" required><br><br>

    <button type="submit">Lưu tin tức</button>
</form>
</body>
</html>
