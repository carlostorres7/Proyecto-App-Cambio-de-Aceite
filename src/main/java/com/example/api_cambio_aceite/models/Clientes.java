package com.example.api_cambio_aceite.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre_uno;
    private String nombre_dos;
    private String apellido_uno;
    private String apellido_dos;
    private String telefono;
    private String email;

    public Clientes(){

    }
    public Clientes(int id, String nombre_uno, String nombre_dos, String apellido_uno, String apellido_dos, String telefono, String email) {
        this.id = id;
        this.nombre_uno = nombre_uno;
        this.nombre_dos = nombre_dos;
        this.apellido_uno = apellido_uno;
        this.apellido_dos = apellido_dos;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_uno() {
        return nombre_uno;
    }

    public void setNombre_uno(String nombre_uno) {
        this.nombre_uno = nombre_uno;
    }

    public String getNombre_dos() {
        return nombre_dos;
    }

    public void setNombre_dos(String nombre_dos) {
        this.nombre_dos = nombre_dos;
    }

    public String getApellido_uno() {
        return apellido_uno;
    }

    public void setApellido_uno(String apellido_uno) {
        this.apellido_uno = apellido_uno;
    }

    public String getApellido_dos() {
        return apellido_dos;
    }

    public void setApellido_dos(String apellido_dos) {
        this.apellido_dos = apellido_dos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
