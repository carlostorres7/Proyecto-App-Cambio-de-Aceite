package com.example.api_cambio_aceite.models;

import jakarta.persistence.*;

@Entity
@Table(name="Aceites")
public class Aceites {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String marca;
    private String referencia;
    private String categoria;

    public Aceites(int id, String marca, String referencia, String categoria) {
        this.id = id;
        this.marca = marca;
        this.referencia = referencia;
        this.categoria = categoria;
    }

    public Aceites(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
