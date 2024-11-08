/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inmaculada.inmaculadaa.service;

import com.inmaculada.inmaculadaa.entity.Producto;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author junniormarinochinchaymacca
 */
public interface ProductoService {

    public Producto save(Producto producto);

    public Optional<Producto> get(Integer id);

    public void update(Producto producto);

    public void delete(Integer id);

    public List<Producto> findAll();
}
