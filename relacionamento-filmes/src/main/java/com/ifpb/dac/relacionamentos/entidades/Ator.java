
package com.ifpb.dac.relacionamentos.entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ator implements Serializable {
    
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private String nacionalidade;
    @OneToOne(cascade = CascadeType.ALL)
    private Ator par;

    public Ator() {
    }

    public Ator(String nome, Sexo sexo, String nacionalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Ator getPar() {
        return par;
    }

    public void setPar(Ator par) {
        this.par = par;
//        par.setPar(this.par);
    } 
    
}
