/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.Borrow;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mohamed sabri
 */
@Stateless
public class LbBorrowFacade extends AbstractFacade<Borrow> implements LbBorrowFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_lendingbooks_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LbBorrowFacade() {
        super(Borrow.class);
    }
    
}
