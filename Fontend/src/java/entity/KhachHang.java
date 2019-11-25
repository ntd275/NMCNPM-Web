/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ntd27
 */
@Entity
@Table(name = "KhachHang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "KhachHang.findAll", query = "SELECT k FROM KhachHang k")
    , @NamedQuery(name = "KhachHang.findByIdkh", query = "SELECT k FROM KhachHang k WHERE k.khachHangPK.idkh = :idkh")
    , @NamedQuery(name = "KhachHang.findByTenDangNhap", query = "SELECT k FROM KhachHang k WHERE k.khachHangPK.tenDangNhap = :tenDangNhap")
    , @NamedQuery(name = "KhachHang.findByTenThuong", query = "SELECT k FROM KhachHang k WHERE k.tenThuong = :tenThuong")
    , @NamedQuery(name = "KhachHang.findByPassword", query = "SELECT k FROM KhachHang k WHERE k.password = :password")
    , @NamedQuery(name = "KhachHang.findByEmail", query = "SELECT k FROM KhachHang k WHERE k.email = :email")
    , @NamedQuery(name = "KhachHang.findBySdt", query = "SELECT k FROM KhachHang k WHERE k.sdt = :sdt")
    , @NamedQuery(name = "KhachHang.findByDiaChi", query = "SELECT k FROM KhachHang k WHERE k.diaChi = :diaChi")
    , @NamedQuery(name = "KhachHang.findByMaQH", query = "SELECT k FROM KhachHang k WHERE k.maQH = :maQH")
    , @NamedQuery(name = "KhachHang.findByMaTinh", query = "SELECT k FROM KhachHang k WHERE k.maTinh = :maTinh")})
public class KhachHang implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KhachHangPK khachHangPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TenThuong")
    private String tenThuong;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Password")
    private String password;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "Sdt")
    private String sdt;
    @Size(max = 50)
    @Column(name = "DiaChi")
    private String diaChi;
    @Size(max = 2)
    @Column(name = "MaQH")
    private String maQH;
    @Size(max = 2)
    @Column(name = "MaTinh")
    private String maTinh;

    public KhachHang() {
    }

    public KhachHang(KhachHangPK khachHangPK) {
        this.khachHangPK = khachHangPK;
    }

    public KhachHang(KhachHangPK khachHangPK, String tenThuong, String password, String email, String sdt) {
        this.khachHangPK = khachHangPK;
        this.tenThuong = tenThuong;
        this.password = password;
        this.email = email;
        this.sdt = sdt;
    }

    public KhachHang(String idkh, String tenDangNhap) {
        this.khachHangPK = new KhachHangPK(idkh, tenDangNhap);
    }

    public KhachHangPK getKhachHangPK() {
        return khachHangPK;
    }

    public void setKhachHangPK(KhachHangPK khachHangPK) {
        this.khachHangPK = khachHangPK;
    }

    public String getTenThuong() {
        return tenThuong;
    }

    public void setTenThuong(String tenThuong) {
        this.tenThuong = tenThuong;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaQH() {
        return maQH;
    }

    public void setMaQH(String maQH) {
        this.maQH = maQH;
    }

    public String getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(String maTinh) {
        this.maTinh = maTinh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (khachHangPK != null ? khachHangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KhachHang)) {
            return false;
        }
        KhachHang other = (KhachHang) object;
        if ((this.khachHangPK == null && other.khachHangPK != null) || (this.khachHangPK != null && !this.khachHangPK.equals(other.khachHangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.KhachHang[ khachHangPK=" + khachHangPK + " ]";
    }
    
}
