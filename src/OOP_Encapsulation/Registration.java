package OOP_Encapsulation;


public class Registration {
	private String name;
	private int age;
	private String address;
	private String dob;
	
	
	public Registration(String name, int age, String address, String dob) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.dob = dob;
	}
	
	
	public Registration(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
