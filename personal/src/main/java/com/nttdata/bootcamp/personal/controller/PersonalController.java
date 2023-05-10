package com.nttdata.bootcamp.personal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.personal.entities.Person;

@RestController
@RequestMapping("/personal")
public class PersonalController {

  @GetMapping("/{id}")
  public ResponseEntity<Person> obtenerPersonal(@PathVariable("id") Long id) {
    // Lógica para obtener los datos del personal según el ID o generar un objeto de personal
	  Person personal = new Person("Jose Antonio", 32);
    return ResponseEntity.ok(personal);
  }
}
