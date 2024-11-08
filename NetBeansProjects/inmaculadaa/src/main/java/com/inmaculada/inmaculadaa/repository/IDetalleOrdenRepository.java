/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmaculada.inmaculadaa.repository;

import com.inmaculada.inmaculadaa.entity.DetalleOrden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author junniormarinochinchaymacca
 */
@Repository
public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, Integer> {
    
}
