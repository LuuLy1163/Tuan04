<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Danh sách tin tức</title></head>
<body>
<h2>Danh sách tin tức</h2>
<table border="1">
    <tr>
        <th>Mã</th><th>Tiêu đề</th><th>Nội dung</th><th>Liên kết</th><th>Danh mục</th><th>Hành động</th>
    </tr>
    <c:forEach var="tt" items="${listTinTuc}">
        <tr>
            <td>${tt.maTT}</td>
            <td>${tt.tieuDe}</td>
            <td>${tt.noiDungTT}</td>
            <td><a href="${tt.lienKet}">Link</a></td>
            <td>${tt.danhMuc.tenDanhMuc}</td>
            <td><a href="xoa?maTT=${tt.maTT}">Xóa</a></td>
        </tr>
    </c:forEach>
</table>
<a href="TinTucForm.jsp">Thêm tin tức</a>
</body>
</html>
