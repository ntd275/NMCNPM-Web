/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ntd27
 */
@Embeddable
public class KhachHangPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "IDKH")
    private String idkh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TenDangNhap")
    private String tenDangNhap;

    public KhachHangPK() {
    }

    public KhachHangPK(String idkh, String tenDangNhap) {
        this.idkh = idkh;
        this.tenDangNhap = tenDangNhap;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idkh != null ? idkh.hashCode() : 0);
        hash += (tenDangNhap != null ? tenDangNhap.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KhachHangPK)) {
            return false;
        }
        KhachHangPK other = (KhachHangPK) object;
        if ((this.idkh == null && other.idkh != null) || (this.idkh != null && !this.idkh.equals(other.idkh))) {
            return false;
        }
        if ((this.tenDangNhap == null && other.tenDangNhap != null) || (this.tenDangNhap != null && !this.tenDangNhap.equals(other.tenDangNhap))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.KhachHangPK[ idkh=" + idkh + ", tenDangNhap=" + tenDangNhap + " ]";
    }
    
}
