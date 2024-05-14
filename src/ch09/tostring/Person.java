package ch09.tostring;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return String.format("이름은 %s %s 입니다.", this.firstName, this.lastName);
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

}
