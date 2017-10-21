package com.ifpb.dac.jpa.entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Navio implements Serializable {
    
    @Id
    @GeneratedValue
    private int codigo_navio;
    private String nome;
    private int capacidade;
    private String pais;
    
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_comandante")
    private Comandante comandante;

    public Navio() {
    }

    public Navio(String nome, int capacidade, String pais) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.pais = pais;
    }

    public int getCodigo_navio() {
        return codigo_navio;
    }

    public void setCodigo_navio(int codigo_navio) {
        this.codigo_navio = codigo_navio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }
    
}
