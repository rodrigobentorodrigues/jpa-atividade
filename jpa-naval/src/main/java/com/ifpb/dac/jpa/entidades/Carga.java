package com.ifpb.dac.jpa.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carga implements Serializable {
    
    @Id
    @GeneratedValue
    private int codigo_carga;
    private String origem;
    private String destino;

    public Carga() {
    }

    public Carga(int codigo_carga, String origem, String destino) {
        this.codigo_carga = codigo_carga;
        this.origem = origem;
        this.destino = destino;
    }
    
    public int getCodigo_carga() {
        return codigo_carga;
    }

    public void setCodigo_carga(int codigo_carga) {
        this.codigo_carga = codigo_carga;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
}
