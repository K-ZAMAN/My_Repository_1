package Practies;

public class EmployeesFullTime implements Employee_Salary {

	private String name;
	private int id;
	private String location;
	private int phoneNumber;

	static int count = 90;
	
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		EmployeesFullTime.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void topLevelSalary(int yearlySalary) {
		System.out.println("this is Top Salaried employees");

	}

	public void midLevelSalary(int yearlySalary) {
		System.out.println("this is Mid Salaried employees");

	}

	public void lowLevelSalary(int yearlySalary) {
		System.out.println("this is Low Salaried employees");

	}

}
