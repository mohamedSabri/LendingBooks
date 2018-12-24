/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.Owner;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbOwnerFacadeLocal {

    void create(Owner lbOwner);

    void edit(Owner lbOwner);

    void remove(Owner lbOwner);

    Owner find(Object id);

    List<Owner> findAll();

    List<Owner> findRange(int[] range);

    int count();
    
}
