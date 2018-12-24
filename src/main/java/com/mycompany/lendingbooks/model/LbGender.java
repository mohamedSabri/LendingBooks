/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mohamed sabri
 */
@Entity
@Table(name = "lb_gender")
@NamedQueries({
    @NamedQuery(name = "LbGender.findAll", query = "SELECT l FROM LbGender l")})
public class LbGender implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "gender_id")
    private Integer genderId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "gender_description")
    private String genderDescription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ownerGender", fetch = FetchType.EAGER)
    private List<LbOwner> lbOwnerList;

    public LbGender() {
    }

    public LbGender(Integer genderId) {
        this.genderId = genderId;
    }

    public LbGender(Integer genderId, String genderDescription) {
        this.genderId = genderId;
        this.genderDescription = genderDescription;
    }

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public String getGenderDescription() {
        return genderDescription;
    }

    public void setGenderDescription(String genderDescription) {
        this.genderDescription = genderDescription;
    }

    public List<LbOwner> getLbOwnerList() {
        return lbOwnerList;
    }

    public void setLbOwnerList(List<LbOwner> lbOwnerList) {
        this.lbOwnerList = lbOwnerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (genderId != null ? genderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LbGender)) {
            return false;
        }
        LbGender other = (LbGender) object;
        if ((this.genderId == null && other.genderId != null) || (this.genderId != null && !this.genderId.equals(other.genderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.lendingbooks.model.LbGender[ genderId=" + genderId + " ]";
    }
    
}
