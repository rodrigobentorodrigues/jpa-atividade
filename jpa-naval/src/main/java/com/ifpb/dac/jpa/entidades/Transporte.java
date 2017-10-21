package com.ifpb.dac.jpa.entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Transporte implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    
    @Temporal(TemporalType.DATE)
    private LocalDate data;
    private double valor;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "codigo_navio")
    private Navio navio;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "codigo_produto")
    private Produto produto;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "codigo_carga")
    private Carga carga;

    public Transporte() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }
    
}
