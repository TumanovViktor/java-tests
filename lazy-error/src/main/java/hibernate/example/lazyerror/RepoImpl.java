package hibernate.example.lazyerror;

import hibernate.example.lazyerror.Entity.Organization;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
@org.springframework.stereotype.Repository
public class RepoImpl implements Repository {
	@PersistenceContext
	EntityManager em;

	@Override
	public Organization metoda(){
		Organization prom = (Organization) em.createQuery(
			"from Organization as org " +
				"inner join fetch org.contactList as contacts " +
				"where org.organizationId=1")
			.getSingleResult();
		System.out.println(prom.getContactList().size());
		return prom;
	}
}
