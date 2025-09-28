package iuh.fit.se.tuan04.controller;

import iuh.fit.se.tuan04.dao.TinTucDAO;
import iuh.fit.se.tuan04.dao.TinTucDAOImpl;
import iuh.fit.se.tuan04.model.DanhMuc;
import iuh.fit.se.tuan04.model.TinTuc;
import iuh.fit.se.tuan04.util.EntityManagerFactoryUtil;
import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/them")
public class TinTucForm extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tieuDe = req.getParameter("tieuDe");
        String noiDung = req.getParameter("noiDung");
        String lienKet = req.getParameter("lienKet");
        int maDM = Integer.parseInt(req.getParameter("maDM"));

        try(EntityManager em = EntityManagerFactoryUtil.getEntityManager()){
            DanhMuc danhMuc = em.find(DanhMuc.class, maDM);
            TinTuc tinTuc = new TinTuc();
            tinTuc.setTieuDe(tieuDe);
            tinTuc.setNoiDungTT(noiDung);
            tinTuc.setLienKet(lienKet);
            tinTuc.setDanhMuc(danhMuc);

            TinTucDAO dao = new TinTucDAOImpl(em);
            dao.insert(tinTuc);
        }
        resp.sendRedirect("danhsach");
    }

}
