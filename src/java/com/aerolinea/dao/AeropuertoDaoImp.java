/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aerolinea.dao;

import com.aerolinea.entidad.Aeropuerto;
import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 *
 * @author Melgar
 */
@Component("AeropuertoDaoImpl")
public class AeropuertoDaoImp extends GenericDaoImpl<Aeropuerto, Integer> implements AeropuertoDao, Serializable{
    
}
