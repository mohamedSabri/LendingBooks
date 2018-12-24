/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.Borrow;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbBorrowFacadeLocal {

    void create(Borrow lbBorrow);

    void edit(Borrow lbBorrow);

    void remove(Borrow lbBorrow);

    Borrow find(Object id);

    List<Borrow> findAll();

    List<Borrow> findRange(int[] range);

    int count();
    
}
