/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.ItemOwner;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbItemOwnerFacadeLocal {

    void create(ItemOwner lbItemOwner);

    void edit(ItemOwner lbItemOwner);

    void remove(ItemOwner lbItemOwner);

    ItemOwner find(Object id);

    List<ItemOwner> findAll();

    List<ItemOwner> findRange(int[] range);

    int count();
    
}
