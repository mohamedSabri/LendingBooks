/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.LbItemOwner;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbItemOwnerFacadeLocal {

    void create(LbItemOwner lbItemOwner);

    void edit(LbItemOwner lbItemOwner);

    void remove(LbItemOwner lbItemOwner);

    LbItemOwner find(Object id);

    List<LbItemOwner> findAll();

    List<LbItemOwner> findRange(int[] range);

    int count();
    
}
