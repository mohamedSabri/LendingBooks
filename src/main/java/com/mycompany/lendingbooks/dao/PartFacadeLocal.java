/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.Part;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface PartFacadeLocal {

    void create(Part lbPart);

    void edit(Part lbPart);

    void remove(Part lbPart);

    Part find(Object id);

    List<Part> findAll();

    List<Part> findRange(int[] range);

    int count();
    
}
