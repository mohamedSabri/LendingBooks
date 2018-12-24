/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.LbOwner;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbOwnerFacadeLocal {

    void create(LbOwner lbOwner);

    void edit(LbOwner lbOwner);

    void remove(LbOwner lbOwner);

    LbOwner find(Object id);

    List<LbOwner> findAll();

    List<LbOwner> findRange(int[] range);

    int count();
    
}
