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

    public Clientes updateCliente(Long id, Clientes clientesActualizado){
        Clientes clientesExistente = clienteRepository.findById(id).
                orElseThrow(()-> new RuntimeException("Cliente no encontrado"));

        clientesExistente.setNombre_uno(clientesActualizado.getNombre_uno());
        clientesExistente.setNombre_dos(clientesActualizado.getNombre_dos());
        clientesExistente.setApellido_uno(clientesActualizado.getApellido_uno());
        clientesExistente.setApellido_dos(clientesActualizado.getApellido_dos());
        clientesExistente.setTelefono(clientesActualizado.getTelefono());
        clientesExistente.setEmail(clientesActualizado.getEmail());

        return clienteRepository.save(clientesExistente);
    }


}
