package com.example.api_cambio_aceite.controllers;

import com.example.api_cambio_aceite.models.Aceites;
import com.example.api_cambio_aceite.services.AceiteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aceites")
public class aceiteController {
    private final AceiteService aceiteService;

    public aceiteController(AceiteService aceiteService) {
        this.aceiteService = aceiteService;
    }

    @GetMapping
    public List<Aceites> getAllAceites(){
        return aceiteService.getAllAceites();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aceites> getAceitesById(@PathVariable Long id){
        Aceites aceites = aceiteService.getAceiteById(id);
        return ResponseEntity.ok(aceites);
    }

    @PostMapping
    public ResponseEntity<Aceites> createAceite(@RequestBody Aceites aceites){
        Aceites nuevoAceite = aceiteService.saveAceite(aceites);
        return ResponseEntity.ok(nuevoAceite);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aceites> updateAceite(@PathVariable Long id, @RequestBody Aceites aceiteActualizado){
        Aceites aceiteActualizadoRespuesta = aceiteService.updateAceite(id, aceiteActualizado);
        return ResponseEntity.ok(aceiteActualizadoRespuesta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAceite(@PathVariable Long id){
        aceiteService.deleteAceite(id);
        return ResponseEntity.noContent().build();
    }

}
