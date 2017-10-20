
package com.ifpb.dac.relacionamentos.entidades;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class EventoFilmePK implements Serializable{
    
    private int filme_codigo;
    private int evento_codigo;

    public EventoFilmePK() {
    }

    public int getFilme_id() {
        return filme_codigo;
    }

    public void setFilme_id(int filme_id) {
        this.filme_codigo = filme_id;
    }

    public int getEvento_id() {
        return evento_codigo;
    }

    public void setEvento_id(int evento_id) {
        this.evento_codigo = evento_id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.filme_codigo;
        hash = 67 * hash + this.evento_codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EventoFilmePK other = (EventoFilmePK) obj;
        if (this.filme_codigo != other.filme_codigo) {
            return false;
        }
        if (this.evento_codigo != other.evento_codigo) {
            return false;
        }
        return true;
    }
    
}
