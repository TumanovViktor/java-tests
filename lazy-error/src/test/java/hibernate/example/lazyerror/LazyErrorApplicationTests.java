package hibernate.example.lazyerror;


import hibernate.example.lazyerror.Entity.Contact;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Set;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LazyErrorApplicationTests {
	@PersistenceContext
	EntityManager em;

	@Autowired
	private Repository repo;


	static final Logger logger = LoggerFactory.getLogger(LazyErrorApplicationTests.class);


	@Test
	public void contextLoads() {
		Set<Contact> setContact = repo.metoda().getContactList();
//		OrganizationExtA orgExtA = (OrganizationExtA) em.createQuery(
//			"from OrganizationExtA as orgA " +
//			"inner join fetch orgA.organization as org " +
//				"where orgA.organizationId=1")
//		.getSingleResult();

// 		Organization org = (Organization) em.createQuery(
//			"from Organization as org " +
//			"inner join fetch org.contactList as contacts " +
//				"where org.organizationId=1")
//		.getSingleResult();

// 		org.getContactList().size();

//		Organization organization1 = em.find(Organization.class, 1);
//		OrganizationExtA orgExtA = organization1.getExtA();

		System.out.println(setContact.size());
	}

}
