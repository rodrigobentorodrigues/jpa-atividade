package com.ifpb.dac.jpa.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comandante implements Serializable {
    
    @Id
    @GeneratedValue
    private int id_comandante;
    private String nome;
    private String pais;

    public Comandante() {
    }

    public Comandante(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public int getId_comandante() {
        return id_comandante;
    }

    public void setId_comandante(int id_comandante) {
        this.id_comandante = id_comandante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
