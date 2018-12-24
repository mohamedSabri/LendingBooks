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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "lb_owner")
@NamedQueries({
    @NamedQuery(name = "LbOwner.findAll", query = "SELECT l FROM LbOwner l")})
public class LbOwner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "owner_id")
    private String ownerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "owner_name")
    private String ownerName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "owner_email")
    private String ownerEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "owner_password")
    private String ownerPassword;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ownerId", fetch = FetchType.EAGER)
    private List<LbBorrow> lbBorrowList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lbOwner", fetch = FetchType.EAGER)
    private List<LbItemOwner> lbItemOwnerList;
    @JoinColumn(name = "owner_gender", referencedColumnName = "gender_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private LbGender ownerGender;

    public LbOwner() {
    }

    public LbOwner(String ownerId) {
        this.ownerId = ownerId;
    }

    public LbOwner(String ownerId, String ownerName, String ownerEmail, String ownerPassword) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPassword = ownerPassword;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerPassword() {
        return ownerPassword;
    }

    public void setOwnerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword;
    }

    public List<LbBorrow> getLbBorrowList() {
        return lbBorrowList;
    }

    public void setLbBorrowList(List<LbBorrow> lbBorrowList) {
        this.lbBorrowList = lbBorrowList;
    }

    public List<LbItemOwner> getLbItemOwnerList() {
        return lbItemOwnerList;
    }

    public void setLbItemOwnerList(List<LbItemOwner> lbItemOwnerList) {
        this.lbItemOwnerList = lbItemOwnerList;
    }

    public LbGender getOwnerGender() {
        return ownerGender;
    }

    public void setOwnerGender(LbGender ownerGender) {
        this.ownerGender = ownerGender;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ownerId != null ? ownerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LbOwner)) {
            return false;
        }
        LbOwner other = (LbOwner) object;
        if ((this.ownerId == null && other.ownerId != null) || (this.ownerId != null && !this.ownerId.equals(other.ownerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.lendingbooks.model.LbOwner[ ownerId=" + ownerId + " ]";
    }
    
}
