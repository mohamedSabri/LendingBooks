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
@Table(name = "lb_item")
@NamedQueries({
    @NamedQuery(name = "LbItem.findAll", query = "SELECT l FROM LbItem l")})
public class LbItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "item_id")
    private String itemId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "item_author")
    private String itemAuthor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "item_name")
    private String itemName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemId", fetch = FetchType.EAGER)
    private List<LbBorrow> lbBorrowList;
    @JoinColumn(name = "item_part", referencedColumnName = "part_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private LbPart itemPart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lbItem", fetch = FetchType.EAGER)
    private List<LbItemOwner> lbItemOwnerList;

    public LbItem() {
    }

    public LbItem(String itemId) {
        this.itemId = itemId;
    }

    public LbItem(String itemId, String itemAuthor, String itemName) {
        this.itemId = itemId;
        this.itemAuthor = itemAuthor;
        this.itemName = itemName;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemAuthor() {
        return itemAuthor;
    }

    public void setItemAuthor(String itemAuthor) {
        this.itemAuthor = itemAuthor;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public List<LbBorrow> getLbBorrowList() {
        return lbBorrowList;
    }

    public void setLbBorrowList(List<LbBorrow> lbBorrowList) {
        this.lbBorrowList = lbBorrowList;
    }

    public LbPart getItemPart() {
        return itemPart;
    }

    public void setItemPart(LbPart itemPart) {
        this.itemPart = itemPart;
    }

    public List<LbItemOwner> getLbItemOwnerList() {
        return lbItemOwnerList;
    }

    public void setLbItemOwnerList(List<LbItemOwner> lbItemOwnerList) {
        this.lbItemOwnerList = lbItemOwnerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LbItem)) {
            return false;
        }
        LbItem other = (LbItem) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.lendingbooks.model.LbItem[ itemId=" + itemId + " ]";
    }
    
}
