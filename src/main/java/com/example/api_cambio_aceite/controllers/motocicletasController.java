package com.example.api_cambio_aceite.controllers;

import com.example.api_cambio_aceite.models.Motocicletas;
import com.example.api_cambio_aceite.services.MotoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motocicletas")
public class motocicletasController {
    private final MotoService motoService;

    public motocicletasController(MotoService motoService) {
        this.motoService = motoService;
    }

    @GetMapping
    public List<Motocicletas> getAllMotos(){
        return motoService.getAllMotocicletas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Motocicletas> getMotosById(@PathVariable Long id){
        Motocicletas motos = motoService.getMotoById(id);
        return ResponseEntity.ok(motos);
    }

    @PostMapping
    public ResponseEntity<Motocicletas> createMoto(@RequestBody Motocicletas motos){
        Motocicletas nuevaMoto = motoService.saveMoto(motos);
        return ResponseEntity.ok(nuevaMoto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Motocicletas> updateMoto(@PathVariable Long id, @RequestBody Motocicletas motoActualizada){
        Motocicletas motoActualizadaRespuesta = motoService.updateMoto(id, motoActualizada);
        return ResponseEntity.ok(motoActualizadaRespuesta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMoto(@PathVariable Long id){
        motoService.deleteMoto(id);
        return ResponseEntity.noContent().build();
    }
}
