/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest;

import javax.ws.rs.Path;
import javax.ws.rs.GET;

@Path("developers")
public class Simple {
    
    @GET
    public String developer(){
        return "adam bien";
    }
}
