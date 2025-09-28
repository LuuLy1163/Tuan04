package iuh.fit.se.tuan04.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TinTuc")
public class TinTuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maTT;

    @NotEmpty(message = "Tiêu đề không đuược để trống")
    @Size(min = 5, max = 200, message = "Tiêu đ từ 5 đến 200 kí tự")
    private String tieuDe;

    @NotEmpty(message = "Nội dung không đuược để trống")
    @Size(max = 255, message = "Nội dung không quá 255 kí tự")
    private String noiDungTT;

    private String lienKet;

    @ManyToOne
    @JoinColumn(name = "maDM")
    private DanhMuc danhMuc;

    public TinTuc() {
    }

    public TinTuc(int maTT, String tieuDe, String noiDungTT, String lienKet, DanhMuc danhMuc) {
        this.maTT = maTT;
        this.tieuDe = tieuDe;
        this.noiDungTT = noiDungTT;
        this.lienKet = lienKet;
        this.danhMuc = danhMuc;
    }

    public int getMaTT() {
        return maTT;
    }

    public void setMaTT(int maTT) {
        this.maTT = maTT;
    }

    public @NotEmpty(message = "Tiêu đề không đuược để trống") @Size(min = 5, max = 200, message = "Tiêu đ từ 5 đến 200 kí tự") String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(@NotEmpty(message = "Tiêu đề không đuược để trống") @Size(min = 5, max = 200, message = "Tiêu đ từ 5 đến 200 kí tự") String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public @NotEmpty(message = "Nội dung không đuược để trống") @Size(max = 255, message = "Nội dung không quá 255 kí tự") String getNoiDungTT() {
        return noiDungTT;
    }

    public void setNoiDungTT(@NotEmpty(message = "Nội dung không đuược để trống") @Size(max = 255, message = "Nội dung không quá 255 kí tự") String noiDungTT) {
        this.noiDungTT = noiDungTT;
    }

    public String getLienKet() {
        return lienKet;
    }

    public void setLienKet(String lienKet) {
        this.lienKet = lienKet;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }
}
