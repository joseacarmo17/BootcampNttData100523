package com.nttdata.bootcamp.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/gateway")
public class GatewayController {
	private final RestTemplate restTemplate = new RestTemplate();

  @GetMapping("/factura/{id}")
  public ResponseEntity<String> obtenerFactura(@PathVariable("id") Long id) {
    String url = "http://localhost:8081/factura/" + id;
    ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
    return response;
  }

  @GetMapping("/personal/{id}")
  public ResponseEntity<String> obtenerPersonal(@PathVariable("id") Long id) {
    String url = "http://localhost:8082/personal/" + id;
    ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
    return response;
  }

  @GetMapping("/inventario/{id}")
  public ResponseEntity<String> obtenerInventario(@PathVariable("id") Long id) {
    String url = "http://localhost:8083/inventario/" + id;
    ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
    return response;
  }
}

