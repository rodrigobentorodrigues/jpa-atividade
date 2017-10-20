
package com.ifpb.dac.relacionamentos.loader;

import com.ifpb.dac.relacionamentos.entidades.Ator;
import com.ifpb.dac.relacionamentos.entidades.Evento;
import com.ifpb.dac.relacionamentos.entidades.EventoFilme;
import com.ifpb.dac.relacionamentos.entidades.Filme;
import com.ifpb.dac.relacionamentos.entidades.Genero;
import com.ifpb.dac.relacionamentos.entidades.Sexo;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    
    public static void main(String[] args) {
        // Banco: Relacionamentos
        // Senha: 12345
        EntityManager manager = Persistence.createEntityManagerFactory("UPersistence").
                createEntityManager();
        EntityTransaction transaction = manager.getTransaction();
        
        Filme filme = new Filme("Blade Runner", 2017, Genero.Acao, "Denis Villeneuve");
        
        Ator ator1 = new Ator("Ryan Gosling", Sexo.Masculino, "Canadense");
        Ator ator2 = new Ator("Jared Leto", Sexo.Feminino, "Americano");
        ator1.setPar(ator2);
        ator2.setPar(ator1);
        
        filme.addAtor(ator1);
        filme.addAtor(ator2);
        
        Evento evento = new Evento();
        evento.setAno(2017);
        evento.setLocal("Dubai");
        evento.setNome("Melhores do Ano");
        
        EventoFilme ef = new EventoFilme();
        ef.setFilme(filme);
        ef.setEvento(evento);
        ef.setNota(100);
        
        transaction.begin();
        manager.persist(ef);
        transaction.commit();
        manager.close();
    }
    
}
