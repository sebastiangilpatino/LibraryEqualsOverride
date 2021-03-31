package SEP2;

public class LibraryMember {
	private String memberID;
	private String firstName;
	private String lastName;
	private String phone;
	private CheckoutRecord checkOutRecord;

	public LibraryMember(String memberID, String firstName, String lastName, String phone) {
		super();
		this.memberID = memberID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	public String getMemberID() {
		return memberID;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setCheckoutRecord(CheckoutRecord cr) {
		this.checkOutRecord = cr;
	}

	public CheckoutRecord getCheckOutRecord() {
		return checkOutRecord;
	}

}
