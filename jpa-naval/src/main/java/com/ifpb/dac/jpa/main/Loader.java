package com.ifpb.dac.jpa.main;

import com.ifpb.dac.jpa.entidades.Carga;
import com.ifpb.dac.jpa.entidades.Categoria;
import com.ifpb.dac.jpa.entidades.Comandante;
import com.ifpb.dac.jpa.entidades.Navio;
import com.ifpb.dac.jpa.entidades.Produto;
import com.ifpb.dac.jpa.entidades.Transporte;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Loader {
    
    public static void main(String[] args) {        
        EntityManager em = Persistence.createEntityManagerFactory("UPersistence").
                createEntityManager();
        EntityTransaction transacao = em.getTransaction();
        
        Carga carga = new Carga();
        carga.setOrigem("Cajazeiras");
        carga.setDestino("Joao Pessoa");
        
        Produto produto = new Produto("Casa", Categoria.Vestimenta);
        
        Comandante comandante = new Comandante("Capitão Jack Sparrow", "Irão");
        
        Navio navio = new Navio("Perola Negra", 100000, "Arabia Saudita");
        navio.setComandante(comandante);
        
        Transporte t = new Transporte();
        t.setNavio(navio);
        t.setCarga(carga);
        t.setProduto(produto);
        
        
        LocalDate d = LocalDate.of(2017, Month.OCTOBER, 23);
        
        t.setData(d);
        t.setValor(2500);
        
        transacao.begin();
        em.persist(t);
        transacao.commit();
        em.close();
    }
    
}
