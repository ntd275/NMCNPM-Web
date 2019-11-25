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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ntd27
 */
@Entity
@Table(name = "DonHang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DonHang.findAll", query = "SELECT d FROM DonHang d")
    , @NamedQuery(name = "DonHang.findByMaGiaoDich", query = "SELECT d FROM DonHang d WHERE d.donHangPK.maGiaoDich = :maGiaoDich")
    , @NamedQuery(name = "DonHang.findByIdsp", query = "SELECT d FROM DonHang d WHERE d.donHangPK.idsp = :idsp")
    , @NamedQuery(name = "DonHang.findBySoLuong", query = "SELECT d FROM DonHang d WHERE d.soLuong = :soLuong")
    , @NamedQuery(name = "DonHang.findByTongThanhToan", query = "SELECT d FROM DonHang d WHERE d.tongThanhToan = :tongThanhToan")})
public class DonHang implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DonHangPK donHangPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoLuong")
    private int soLuong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TongThanhToan")
    private int tongThanhToan;

    public DonHang() {
    }

    public DonHang(DonHangPK donHangPK) {
        this.donHangPK = donHangPK;
    }

    public DonHang(DonHangPK donHangPK, int soLuong, int tongThanhToan) {
        this.donHangPK = donHangPK;
        this.soLuong = soLuong;
        this.tongThanhToan = tongThanhToan;
    }

    public DonHang(String maGiaoDich, String idsp) {
        this.donHangPK = new DonHangPK(maGiaoDich, idsp);
    }

    public DonHangPK getDonHangPK() {
        return donHangPK;
    }

    public void setDonHangPK(DonHangPK donHangPK) {
        this.donHangPK = donHangPK;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTongThanhToan() {
        return tongThanhToan;
    }

    public void setTongThanhToan(int tongThanhToan) {
        this.tongThanhToan = tongThanhToan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (donHangPK != null ? donHangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DonHang)) {
            return false;
        }
        DonHang other = (DonHang) object;
        if ((this.donHangPK == null && other.donHangPK != null) || (this.donHangPK != null && !this.donHangPK.equals(other.donHangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DonHang[ donHangPK=" + donHangPK + " ]";
    }
    
}
