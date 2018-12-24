/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.Gender;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbGenderFacadeLocal {

    void create(Gender lbGender);

    void edit(Gender lbGender);

    void remove(Gender lbGender);

    Gender find(Object id);

    List<Gender> findAll();

    List<Gender> findRange(int[] range);

    int count();
    
}
