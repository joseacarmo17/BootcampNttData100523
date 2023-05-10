package com.nttdata.bootcamp.inventario.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.inventario.entities.Product;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

  @GetMapping("/{id}")
  public ResponseEntity<Product> obtenerInventario(@PathVariable("id") Long id) {
    // Lógica para obtener los detalles del inventario según el ID o generar un objeto de inventario
	  Product inventario = new Product("Producto de ejemplo", 10);
    return ResponseEntity.ok(inventario);
  }
}
