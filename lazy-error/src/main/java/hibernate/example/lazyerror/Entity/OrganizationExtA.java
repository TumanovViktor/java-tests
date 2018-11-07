package hibernate.example.lazyerror.Entity;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import javax.persistence.*;

@Entity
public class OrganizationExtA {
	@Id
	private int organizationId;

	@OneToOne(optional = false, fetch = FetchType.LAZY)
	@LazyToOne(LazyToOneOption.NO_PROXY)
	@PrimaryKeyJoinColumn
	private Organization organization;

	public OrganizationExtA() {
	}

	public OrganizationExtA(int organizationId, Organization organization) {
		this.organizationId = organizationId;
		this.organization = organization;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
}
