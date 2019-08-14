package io.altar.projetoFichaColaborador.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import io.altar.projetoFichaColaborador.models.Entity_;

@Transactional
public abstract class EntityRepository<T extends Entity_> {

	@PersistenceContext(unitName = "database")
	protected EntityManager em;

	protected abstract Class<T> getEntityClass();

	protected abstract String getAllQuery();

	protected abstract String getByIdQuery();

	protected abstract String checkEntityExistsByIdQuery();

	public T create(T entity) {
		return em.merge(entity);
	}

	public void update(T entity) {
		em.merge(entity);
	}

	public void remove(long id) {
		T entity = em.find(getEntityClass(), id);
		em.remove(entity);
	}

	public T findEntity(long id) {
		return em.find(getEntityClass(), id);
	}

	public T getEntityById(long id) {
		TypedQuery<T> query = em.createNamedQuery(getByIdQuery(), getEntityClass());
		query.setParameter("entityId", id);
		return query.getSingleResult();
	}

	public List<T> getAll() {
		TypedQuery<T> query = em.createNamedQuery(getAllQuery(), getEntityClass());
		return query.getResultList();
	}

	public boolean checkEntityExistsById(long id) {
		System.out.println(id);
		TypedQuery<Long> query = em.createNamedQuery(checkEntityExistsByIdQuery(), Long.class);
		query.setParameter("entityId", id);
		return query.getSingleResult() > 0;
	
	}
}
