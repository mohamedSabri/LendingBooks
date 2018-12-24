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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "lb_borrow")
@NamedQueries({
    @NamedQuery(name = "LbBorrow.findAll", query = "SELECT l FROM LbBorrow l")})
public class LbBorrow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "borrow_id")
    private String borrowId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "borrower_name")
    private String borrowerName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "borrow_start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date borrowStartDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "borrow_estimated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date borrowEstimatedDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "borrow_end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date borrowEndDate;
    @JoinColumn(name = "item_id", referencedColumnName = "item_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private LbItem itemId;
    @JoinColumn(name = "owner_id", referencedColumnName = "owner_id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private LbOwner ownerId;

    public LbBorrow() {
    }

    public LbBorrow(String borrowId) {
        this.borrowId = borrowId;
    }

    public LbBorrow(String borrowId, String borrowerName, Date borrowStartDate, Date borrowEstimatedDate, Date borrowEndDate) {
        this.borrowId = borrowId;
        this.borrowerName = borrowerName;
        this.borrowStartDate = borrowStartDate;
        this.borrowEstimatedDate = borrowEstimatedDate;
        this.borrowEndDate = borrowEndDate;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public Date getBorrowStartDate() {
        return borrowStartDate;
    }

    public void setBorrowStartDate(Date borrowStartDate) {
        this.borrowStartDate = borrowStartDate;
    }

    public Date getBorrowEstimatedDate() {
        return borrowEstimatedDate;
    }

    public void setBorrowEstimatedDate(Date borrowEstimatedDate) {
        this.borrowEstimatedDate = borrowEstimatedDate;
    }

    public Date getBorrowEndDate() {
        return borrowEndDate;
    }

    public void setBorrowEndDate(Date borrowEndDate) {
        this.borrowEndDate = borrowEndDate;
    }

    public LbItem getItemId() {
        return itemId;
    }

    public void setItemId(LbItem itemId) {
        this.itemId = itemId;
    }

    public LbOwner getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(LbOwner ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (borrowId != null ? borrowId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LbBorrow)) {
            return false;
        }
        LbBorrow other = (LbBorrow) object;
        if ((this.borrowId == null && other.borrowId != null) || (this.borrowId != null && !this.borrowId.equals(other.borrowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.lendingbooks.model.LbBorrow[ borrowId=" + borrowId + " ]";
    }
    
}
