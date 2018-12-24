/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.service;

import com.mycompany.lendingbooks.dao.PartFacadeLocal;
import com.mycompany.lendingbooks.model.Part;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author mohamed sabri
 */
@Stateless
public class PartServiceImpl implements PartService{

    @Inject
    private PartFacadeLocal partFacadeLocal ;
    
    @Override
    public List<Part> getAllParts() {
        return partFacadeLocal.findAll();
    }
    
}
