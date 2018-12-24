/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.LbPart;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbPartFacadeLocal {

    void create(LbPart lbPart);

    void edit(LbPart lbPart);

    void remove(LbPart lbPart);

    LbPart find(Object id);

    List<LbPart> findAll();

    List<LbPart> findRange(int[] range);

    int count();
    
}
