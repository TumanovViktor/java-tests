package hibernate.example.lazyerror.Entity;

import org.hibernate.annotations.LazyGroup;
import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Organization {
	@Id
	@GeneratedValue
	private int organizationId;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "organization")
	@LazyToOne(LazyToOneOption.NO_PROXY)
//	@LazyGroup("group1")
	private OrganizationExtA extA;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "organization")
	@LazyToOne(LazyToOneOption.NO_PROXY)
//	@LazyGroup("group2")
	private OrganizationExtB extB;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organization")
	private Set<Contact> contactList = new HashSet<>(0);

	public Organization() {
	}

	public Organization(OrganizationExtA extA, OrganizationExtB extB, Set<Contact> contactList) {
		this.extA = extA;
		this.extB = extB;
		this.contactList = contactList;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public OrganizationExtA getExtA() {
		return extA;
	}

	public void setExtA(OrganizationExtA extA) {
		this.extA = extA;
	}

	public OrganizationExtB getExtB() {
		return extB;
	}

	public void setExtB(OrganizationExtB extB) {
		this.extB = extB;
	}

	public Set<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(Set<Contact> contactList) {
		this.contactList = contactList;
	}
//
//	@Override
//	public String toString(){
//		return "Organization with id= " + getOrganizationId() + " has extA value " + getExtA() + " and extB value " + getExtB();
//	}

}
