package com.integradash.apiintegradash.repositories;

import com.integradash.apiintegradash.models.AlertaModel;
import com.integradash.apiintegradash.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlertaRepository extends JpaRepository<AlertaModel, UUID> {
    AlertaModel findBynomealerta(String nomealerta);
}