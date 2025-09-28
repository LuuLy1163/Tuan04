package iuh.fit.se.tuan04.controller;

import iuh.fit.se.tuan04.dao.TinTucDAO;
import iuh.fit.se.tuan04.dao.TinTucDAOImpl;
import iuh.fit.se.tuan04.util.EntityManagerFactoryUtil;
import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/xoa")
public class QuanLyFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int maTT = Integer.parseInt(req.getParameter("maTT"));
        try(EntityManager em = EntityManagerFactoryUtil.getEntityManager()){
            TinTucDAO dao = new TinTucDAOImpl(em);
            dao.delete(maTT);
        }
        resp.sendRedirect("danhsach");
    }
}
