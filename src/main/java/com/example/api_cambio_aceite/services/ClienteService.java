package com.example.api_cambio_aceite.services;

import com.example.api_cambio_aceite.models.Clientes;
import com.example.api_cambio_aceite.repositories.IClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final IClienteRepository clienteRepository;
    public ClienteService(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Clientes> getAllClientes(){
        return clienteRepository.findAll();
    }

    public Clientes saveCliente(Clientes clientes){
        return clienteRepository.save(clientes);
    }

    public void deleteCliente(Long id){
        clienteRepository.deleteById(id);
    }

    public Clientes getClienteById(Long id){
        return clienteRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Cliente no encontrado"));
    }

    public Clientes updateCliente(Long id, Clientes clienteActualizado){
        Clientes clienteExistente = clienteRepository.findById(id).
                orElseThrow(()-> new RuntimeException("Cliente no encontrado"));

        clienteExistente.setNombre_uno(clienteActualizado.getNombre_uno());
        clienteExistente.setNombre_dos(clienteActualizado.getNombre_dos());
        clienteExistente.setApellido_uno(clienteActualizado.getApellido_uno());
        clienteExistente.setApellido_dos(clienteActualizado.getApellido_dos());
        clienteExistente.setTelefono(clienteActualizado.getTelefono());
        clienteExistente.setEmail(clienteActualizado.getEmail());

        return clienteRepository.save(clienteExistente);
    }


}
