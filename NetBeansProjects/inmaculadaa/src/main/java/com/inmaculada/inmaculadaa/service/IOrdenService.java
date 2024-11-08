/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmaculada.inmaculadaa.service;

import com.inmaculada.inmaculadaa.entity.Orden;
import com.inmaculada.inmaculadaa.entity.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author junniormarinochinchaymacca
 */
public interface IOrdenService {

    List<Orden> findAll();

    Optional<Orden> findById(Integer id);

    Orden save(Orden orden);

    String generarNumeroOrden();

    List<Orden> findByUsuario(Usuario usuario);
}
