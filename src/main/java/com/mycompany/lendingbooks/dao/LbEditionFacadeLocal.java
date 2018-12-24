/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.Edition;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbEditionFacadeLocal {

    void create(Edition lbEdition);

    void edit(Edition lbEdition);

    void remove(Edition lbEdition);

    Edition find(Object id);

    List<Edition> findAll();

    List<Edition> findRange(int[] range);

    int count();
    
}
