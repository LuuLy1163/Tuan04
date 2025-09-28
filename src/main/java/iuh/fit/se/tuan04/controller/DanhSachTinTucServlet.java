package iuh.fit.se.tuan04.controller;

import iuh.fit.se.tuan04.dao.TinTucDAO;
import iuh.fit.se.tuan04.dao.TinTucDAOImpl;
import iuh.fit.se.tuan04.model.TinTuc;
import iuh.fit.se.tuan04.util.EntityManagerFactoryUtil;
import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/danhsach")
public class DanhSachTinTucServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(EntityManager em = EntityManagerFactoryUtil.getEntityManager()){
            TinTucDAO dao = new TinTucDAOImpl(em);
            req.setAttribute("listTinTuc", dao.findAll());
            req.getRequestDispatcher("views/DanhSachTinTuc.jsp").forward(req, resp);
        }
    }
}
