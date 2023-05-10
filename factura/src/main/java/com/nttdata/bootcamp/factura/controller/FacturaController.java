package com.nttdata.bootcamp.factura.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.factura.entities.Factura;

@RestController
@RequestMapping("/factura")
public class FacturaController {

  @GetMapping("/{id}")
  public ResponseEntity<Factura> obtenerFactura(@PathVariable("id") Long id) {
    // Lógica para obtener la factura según el ID o generar una nueva factura
    Factura factura = new Factura("Factura de ejemplo", 100.0);
    return ResponseEntity.ok(factura);
  }
	
}
