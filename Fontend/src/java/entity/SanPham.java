/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "SanPham")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SanPham.findAll", query = "SELECT s FROM SanPham s")
    , @NamedQuery(name = "SanPham.findByIdsp", query = "SELECT s FROM SanPham s WHERE s.idsp = :idsp")
    , @NamedQuery(name = "SanPham.findByTenSanPham", query = "SELECT s FROM SanPham s WHERE s.tenSanPham = :tenSanPham")
    , @NamedQuery(name = "SanPham.findByLoai", query = "SELECT s FROM SanPham s WHERE s.loai = :loai")
    , @NamedQuery(name = "SanPham.findByGiaTien", query = "SELECT s FROM SanPham s WHERE s.giaTien = :giaTien")
    , @NamedQuery(name = "SanPham.findBySize", query = "SELECT s FROM SanPham s WHERE s.size = :size")
    , @NamedQuery(name = "SanPham.findByTrangThai", query = "SELECT s FROM SanPham s WHERE s.trangThai = :trangThai")
    , @NamedQuery(name = "SanPham.findByAnh1", query = "SELECT s FROM SanPham s WHERE s.anh1 = :anh1")
    , @NamedQuery(name = "SanPham.findByAnh2", query = "SELECT s FROM SanPham s WHERE s.anh2 = :anh2")
    , @NamedQuery(name = "SanPham.findByAnh3", query = "SELECT s FROM SanPham s WHERE s.anh3 = :anh3")
    , @NamedQuery(name = "SanPham.findByMoTa", query = "SELECT s FROM SanPham s WHERE s.moTa = :moTa")})
public class SanPham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "IDSP")
    private String idsp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TenSanPham")
    private String tenSanPham;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Loai")
    private String loai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GiaTien")
    private int giaTien;
    @Size(max = 2)
    @Column(name = "Size")
    private String size;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TrangThai")
    private String trangThai;
    @Size(max = 100)
    @Column(name = "Anh1")
    private String anh1;
    @Size(max = 100)
    @Column(name = "Anh2")
    private String anh2;
    @Size(max = 100)
    @Column(name = "Anh3")
    private String anh3;
    @Size(max = 300)
    @Column(name = "MoTa")
    private String moTa;

    public SanPham() {
    }

    public SanPham(String idsp) {
        this.idsp = idsp;
    }

    public SanPham(String idsp, String tenSanPham, String loai, int giaTien, String trangThai) {
        this.idsp = idsp;
        this.tenSanPham = tenSanPham;
        this.loai = loai;
        this.giaTien = giaTien;
        this.trangThai = trangThai;
    }

    public String getIdsp() {
        return idsp;
    }

    public void setIdsp(String idsp) {
        this.idsp = idsp;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getAnh1() {
        return anh1;
    }

    public void setAnh1(String anh1) {
        this.anh1 = anh1;
    }

    public String getAnh2() {
        return anh2;
    }

    public void setAnh2(String anh2) {
        this.anh2 = anh2;
    }

    public String getAnh3() {
        return anh3;
    }

    public void setAnh3(String anh3) {
        this.anh3 = anh3;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsp != null ? idsp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SanPham)) {
            return false;
        }
        SanPham other = (SanPham) object;
        if ((this.idsp == null && other.idsp != null) || (this.idsp != null && !this.idsp.equals(other.idsp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.SanPham[ idsp=" + idsp + " ]";
    }
    
}
