
package com.ifpb.dac.relacionamentos.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Filme implements Serializable {

    @Id
    @GeneratedValue
    private int codigo;
    private String titulo;
    private int ano;
    @Enumerated(EnumType.STRING)
    private Genero genero;
    private String diretor;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Ator> atores;

    public Filme() {
        this.atores = new ArrayList<>();
    }

    public Filme(String titulo, int ano, Genero genero, String diretor) {
        this();
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.diretor = diretor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }
    
    public boolean addAtor(Ator a){
        return this.atores.add(a);
    }

    @Override
    public String toString() {
        return "Filme{ codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano + ", genero=" + genero + ", diretor=" + diretor + '}';
    }
    
}
