
public class Customer {
	
	private String fullName;
	private String salutation;
	private String firstName;
	private String lastName;
	private String address; 
	private String city;
	private String state;
	private String zip;
	private String email;
	private String position;
	private String company;
	
	public String getFullName() {
		return fullName;
	}


	public String getSalutation() {
		return salutation;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getAddress() {
		return address;
	}


	public String getEmail() {
		return email;
	}


	public String getPosition() {
		return position;
	}


	public String getCompany() {
		return company;
	}


	public Customer(String fun, String sal, String fn, String ln, String add, String ct, String st, String zip, String em, String pos, String comp) {
		// TODO Auto-generated constructor stub
		this.fullName = fun;
		this.salutation = sal;
		this.firstName = fn;
		this.lastName = ln;
		this.address = add;
		this.city = ct;
		this.state = st;
		this.zip = zip;
		this.email = em;
		this.position = pos;
		this.company = comp;
	
	}
	
	
	@Override
	public String toString() {
		return String.format("Full name: %s, Salutation: %s, First Name: %s, Last Name: %s, Address: %s, City: %s, State: %s, Zip: %s, Email: %s, Position: %s, Company: %s.",
				this.fullName,this.salutation,this.firstName,this.lastName,this.address,this.city,this.state,this.zip,this.email,this.position,this.company);
	
	}

}
