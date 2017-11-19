/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aerolinea.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Melgar
 */
public interface GenericDao <T,ID extends Serializable>{
    
      T create() throws Exception; 
  void saveOrUpdate(T entity) throws Exception; 
  T get(ID id) throws Exception;  
  void delete(ID id) throws Exception; 
  List<T> findAll() throws Exception;  

}
