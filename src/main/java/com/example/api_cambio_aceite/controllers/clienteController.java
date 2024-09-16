package com.example.api_cambio_aceite.controllers;

import com.example.api_cambio_aceite.models.Clientes;
import com.example.api_cambio_aceite.services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class clienteController {

    private final ClienteService clienteService;

    public clienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Clientes> getAllClientes(){
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> getClienteById(@PathVariable Long id){
        Clientes clientes = clienteService.getClienteById(id);
        return ResponseEntity.ok(clientes);
    }

    @PostMapping
    public ResponseEntity<Clientes> createCliente(@RequestBody Clientes clientes){
        Clientes nuevoCliente = clienteService.saveCliente(clientes);
        return ResponseEntity.ok(nuevoCliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clientes> updateCliente(@PathVariable Long id, @RequestBody Clientes clientesActualizado){
        Clientes clientesActualizadoRespuesta = clienteService.updateCliente(id, clientesActualizado);
        return ResponseEntity.ok(clientesActualizadoRespuesta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id){
        clienteService.deleteCliente(id);
        return ResponseEntity.noContent().build();
    }

}
