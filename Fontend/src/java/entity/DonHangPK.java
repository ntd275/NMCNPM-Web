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
public class DonHangPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "MaGiaoDich")
    private String maGiaoDich;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDSP")
    private String idsp;

    public DonHangPK() {
    }

    public DonHangPK(String maGiaoDich, String idsp) {
        this.maGiaoDich = maGiaoDich;
        this.idsp = idsp;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maGiaoDich != null ? maGiaoDich.hashCode() : 0);
        hash += (idsp != null ? idsp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DonHangPK)) {
            return false;
        }
        DonHangPK other = (DonHangPK) object;
        if ((this.maGiaoDich == null && other.maGiaoDich != null) || (this.maGiaoDich != null && !this.maGiaoDich.equals(other.maGiaoDich))) {
            return false;
        }
        if ((this.idsp == null && other.idsp != null) || (this.idsp != null && !this.idsp.equals(other.idsp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.DonHangPK[ maGiaoDich=" + maGiaoDich + ", idsp=" + idsp + " ]";
    }
    
}
