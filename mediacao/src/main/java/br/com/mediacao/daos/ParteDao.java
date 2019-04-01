package br.com.mediacao.daos;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.mediacao.models.Parte;

@Repository
@Transactional
public class ParteDao {
	@PersistenceContext
    private EntityManager manager;

    public void gravar(Parte parte) {
        manager.persist(parte);
    }
    
    public List<Parte> listar(){
        return manager.createQuery("select p from Parte p", Parte.class).getResultList();
    }

	public Parte find(int id) {
		// TODO Auto-generated method stub
		return manager.createQuery("select distinct(p) from Parte p where p.id = :id", Parte.class).setParameter("id", id).getSingleResult();
	}
    
   
}
