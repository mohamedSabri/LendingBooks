/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mohamed sabri
 */
@Entity
@Table(name = "lb_item_owner")
public class ItemOwner implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemOwnerPK lbItemOwnerPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Size(max = 255)
    @Column(name = "item_description")
    private String itemDescription;
    @Basic(optional = false)
    @NotNull
    @Column(name = "item_count")
    private int itemCount;
    @JoinColumn(name = "item_edition", referencedColumnName = "edition_id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Edition itemEdition;
    @JoinColumn(name = "item_id", referencedColumnName = "item_id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Item lbItem;
    @JoinColumn(name = "owner_id", referencedColumnName = "owner_id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Owner lbOwner;

    public ItemOwner() {
    }

    public ItemOwner(ItemOwnerPK lbItemOwnerPK) {
        this.lbItemOwnerPK = lbItemOwnerPK;
    }

    public ItemOwner(ItemOwnerPK lbItemOwnerPK, Date creationDate, Date updateDate, int itemCount) {
        this.lbItemOwnerPK = lbItemOwnerPK;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.itemCount = itemCount;
    }

    public ItemOwner(String itemId, String ownerId) {
        this.lbItemOwnerPK = new ItemOwnerPK(itemId, ownerId);
    }

    public ItemOwnerPK getLbItemOwnerPK() {
        return lbItemOwnerPK;
    }

    public void setLbItemOwnerPK(ItemOwnerPK lbItemOwnerPK) {
        this.lbItemOwnerPK = lbItemOwnerPK;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public Edition getItemEdition() {
        return itemEdition;
    }

    public void setItemEdition(Edition itemEdition) {
        this.itemEdition = itemEdition;
    }

    public Item getLbItem() {
        return lbItem;
    }

    public void setLbItem(Item lbItem) {
        this.lbItem = lbItem;
    }

    public Owner getLbOwner() {
        return lbOwner;
    }

    public void setLbOwner(Owner lbOwner) {
        this.lbOwner = lbOwner;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lbItemOwnerPK != null ? lbItemOwnerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemOwner)) {
            return false;
        }
        ItemOwner other = (ItemOwner) object;
        if ((this.lbItemOwnerPK == null && other.lbItemOwnerPK != null) || (this.lbItemOwnerPK != null && !this.lbItemOwnerPK.equals(other.lbItemOwnerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.lendingbooks.model.LbItemOwner[ lbItemOwnerPK=" + lbItemOwnerPK + " ]";
    }
    
}
