/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.Item;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author mohamed sabri
 */
@Stateless
public class LbItemFacade extends AbstractFacade<Item> implements LbItemFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_lendingbooks_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LbItemFacade() {
        super(Item.class);
    }
    
}
