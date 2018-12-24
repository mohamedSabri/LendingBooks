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
@Table(name = "lb_part")
@NamedQueries({
    @NamedQuery(name = "LbPart.findAll", query = "SELECT l FROM LbPart l")})
public class LbPart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "part_id")
    private Integer partId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "part_description")
    private String partDescription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemPart", fetch = FetchType.EAGER)
    private List<LbItem> lbItemList;

    public LbPart() {
    }

    public LbPart(Integer partId) {
        this.partId = partId;
    }

    public LbPart(Integer partId, String partDescription) {
        this.partId = partId;
        this.partDescription = partDescription;
    }

    public Integer getPartId() {
        return partId;
    }

    public void setPartId(Integer partId) {
        this.partId = partId;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public List<LbItem> getLbItemList() {
        return lbItemList;
    }

    public void setLbItemList(List<LbItem> lbItemList) {
        this.lbItemList = lbItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partId != null ? partId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LbPart)) {
            return false;
        }
        LbPart other = (LbPart) object;
        if ((this.partId == null && other.partId != null) || (this.partId != null && !this.partId.equals(other.partId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.lendingbooks.model.LbPart[ partId=" + partId + " ]";
    }
    
}
