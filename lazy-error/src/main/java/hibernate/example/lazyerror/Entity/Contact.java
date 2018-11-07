package hibernate.example.lazyerror.Entity;

import javax.persistence.*;


@Entity
public class Contact {
	@Id
	int contactId;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "organizationId", nullable = false, insertable = false, updatable = false)
	private Organization organization;

	public Contact() {
	}

	public Contact(int contactId, Organization organization) {
		this.contactId = contactId;
		this.organization = organization;
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
}
