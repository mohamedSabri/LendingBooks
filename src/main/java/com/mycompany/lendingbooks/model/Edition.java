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
@Table(name = "lb_edition")
public class Edition implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "edition_id")
    private Integer editionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "edition_description")
    private String editionDescription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemEdition", fetch = FetchType.EAGER)
    private List<ItemOwner> lbItemOwnerList;

    public Edition() {
    }

    public Edition(Integer editionId) {
        this.editionId = editionId;
    }

    public Edition(Integer editionId, String editionDescription) {
        this.editionId = editionId;
        this.editionDescription = editionDescription;
    }

    public Integer getEditionId() {
        return editionId;
    }

    public void setEditionId(Integer editionId) {
        this.editionId = editionId;
    }

    public String getEditionDescription() {
        return editionDescription;
    }

    public void setEditionDescription(String editionDescription) {
        this.editionDescription = editionDescription;
    }

    public List<ItemOwner> getLbItemOwnerList() {
        return lbItemOwnerList;
    }

    public void setLbItemOwnerList(List<ItemOwner> lbItemOwnerList) {
        this.lbItemOwnerList = lbItemOwnerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (editionId != null ? editionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Edition)) {
            return false;
        }
        Edition other = (Edition) object;
        if ((this.editionId == null && other.editionId != null) || (this.editionId != null && !this.editionId.equals(other.editionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.lendingbooks.model.LbEdition[ editionId=" + editionId + " ]";
    }
    
}
