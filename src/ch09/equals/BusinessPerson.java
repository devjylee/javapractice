package ch09.equals;

public class BusinessPerson extends Person {

	private String department;
	
	public BusinessPerson(String firstName, String lastName, String department) {
		super(firstName, lastName);
		this.department = department;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BusinessPerson) {
			var bp = (BusinessPerson)obj;
			return super.equals(bp) && this.department.equals(bp.department);
		} else {
			return super.equals(obj);
		}
	}
	
}
