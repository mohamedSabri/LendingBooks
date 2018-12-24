/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.LbItem;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbItemFacadeLocal {

    void create(LbItem lbItem);

    void edit(LbItem lbItem);

    void remove(LbItem lbItem);

    LbItem find(Object id);

    List<LbItem> findAll();

    List<LbItem> findRange(int[] range);

    int count();
    
}
