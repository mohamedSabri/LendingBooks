/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.LbBorrow;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbBorrowFacadeLocal {

    void create(LbBorrow lbBorrow);

    void edit(LbBorrow lbBorrow);

    void remove(LbBorrow lbBorrow);

    LbBorrow find(Object id);

    List<LbBorrow> findAll();

    List<LbBorrow> findRange(int[] range);

    int count();
    
}
