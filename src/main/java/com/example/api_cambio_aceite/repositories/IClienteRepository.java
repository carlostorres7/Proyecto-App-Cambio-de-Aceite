package com.example.api_cambio_aceite.repositories;

import com.example.api_cambio_aceite.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<Clientes, Long> {


}
