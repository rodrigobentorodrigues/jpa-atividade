
package com.ifpb.dac.relacionamentos.entidades;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class EventoFilme implements Serializable {
    
    @EmbeddedId
    private EventoFilmePK pk;
    
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId(value = "filme_codigo")
    @JoinColumn(name = "filme_codigo")
    private Filme filme;
    
    @OneToOne(cascade = CascadeType.ALL)
    @MapsId(value = "evento_codigo")
    @JoinColumn(name = "evento_codigo")
    private Evento evento;
    private double nota;

    public EventoFilme() {
    }

    public EventoFilme(Filme filme, Evento evento, double nota) {
        this.filme = filme;
        this.evento = evento;
        this.nota = nota;
    }
    
    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public EventoFilmePK getPk() {
        return pk;
    }

    public void setPk(EventoFilmePK pk) {
        this.pk = pk;
    }
    
}
