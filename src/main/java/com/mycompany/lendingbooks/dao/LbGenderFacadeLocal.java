/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.dao;

import com.mycompany.lendingbooks.model.LbGender;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author mohamed sabri
 */
@Local
public interface LbGenderFacadeLocal {

    void create(LbGender lbGender);

    void edit(LbGender lbGender);

    void remove(LbGender lbGender);

    LbGender find(Object id);

    List<LbGender> findAll();

    List<LbGender> findRange(int[] range);

    int count();
    
}
