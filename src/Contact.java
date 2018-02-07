
public class Contact {

	private String phoneNumber;
	private String name;
	
	public Contact(String contactName, String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.name = contactName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String contactName) {
		this.name = contactName;
	}

	@Override
	public String toString() {
		return "Contacts [phoneNumber=" + phoneNumber + ", contactName=" + name + "]";
	}
	
	public static Contact createContact(String contactName, String phoneNumber) {
		return new Contact(contactName, phoneNumber);
	}
	
}
