/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lendingbooks.webservice.service;

import com.mycompany.lendingbooks.model.Part;
import com.mycompany.lendingbooks.service.PartService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author mohamed sabri
 */
@Path("part")
public class PartFacadeREST {

    @Inject
    private PartService partService ;
    
    @Path("/findAll")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Part> findAll() {
        return partService.getAllParts();
    }
    
}
