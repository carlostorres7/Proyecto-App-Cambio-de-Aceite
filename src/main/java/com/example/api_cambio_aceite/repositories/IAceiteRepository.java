package com.example.api_cambio_aceite.repositories;

import com.example.api_cambio_aceite.models.Aceites;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAceiteRepository extends JpaRepository<Aceites, Long> {

}
