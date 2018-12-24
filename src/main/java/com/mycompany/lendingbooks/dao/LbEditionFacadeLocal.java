/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.LbEdition;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbEditionFacadeLocal {

    void create(LbEdition lbEdition);

    void edit(LbEdition lbEdition);

    void remove(LbEdition lbEdition);

    LbEdition find(Object id);

    List<LbEdition> findAll();

    List<LbEdition> findRange(int[] range);

    int count();
    
}
