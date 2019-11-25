/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ntd27
 */
@Entity
@Table(name = "GiaoDich")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GiaoDich.findAll", query = "SELECT g FROM GiaoDich g")
    , @NamedQuery(name = "GiaoDich.findByMaGiaoDich", query = "SELECT g FROM GiaoDich g WHERE g.maGiaoDich = :maGiaoDich")
    , @NamedQuery(name = "GiaoDich.findByIdkh", query = "SELECT g FROM GiaoDich g WHERE g.idkh = :idkh")
    , @NamedQuery(name = "GiaoDich.findByDiaChi", query = "SELECT g FROM GiaoDich g WHERE g.diaChi = :diaChi")
    , @NamedQuery(name = "GiaoDich.findByThoiGian", query = "SELECT g FROM GiaoDich g WHERE g.thoiGian = :thoiGian")})
public class GiaoDich implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "MaGiaoDich")
    private String maGiaoDich;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "IDKH")
    private String idkh;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DiaChi")
    private String diaChi;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ThoiGian")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thoiGian;

    public GiaoDich() {
    }

    public GiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public GiaoDich(String maGiaoDich, String idkh, String diaChi, Date thoiGian) {
        this.maGiaoDich = maGiaoDich;
        this.idkh = idkh;
        this.diaChi = diaChi;
        this.thoiGian = thoiGian;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maGiaoDich != null ? maGiaoDich.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GiaoDich)) {
            return false;
        }
        GiaoDich other = (GiaoDich) object;
        if ((this.maGiaoDich == null && other.maGiaoDich != null) || (this.maGiaoDich != null && !this.maGiaoDich.equals(other.maGiaoDich))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.GiaoDich[ maGiaoDich=" + maGiaoDich + " ]";
    }
    
}
