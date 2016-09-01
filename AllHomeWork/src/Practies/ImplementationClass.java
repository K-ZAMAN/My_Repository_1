package Practies;

import java.awt.geom.CubicCurve2D;
import java.sql.Date;
import java.util.ArrayList;

public class ImplementationClass extends EmployeesFullTime {


	public static void main(String[] args) {

		ArrayList<EmployeesFullTime> arrayList = new ArrayList<EmployeesFullTime>();
		EmployeesFullTime employeesFullTime = new EmployeesFullTime();
		employeesFullTime.setName("zaman");
		employeesFullTime.setLocation("charlotte");
		employeesFullTime.setId(45678);
		employeesFullTime.setPhoneNumber(456789009);
		employeesFullTime.lowLevelSalary(160000);
		employeesFullTime.midLevelSalary(115000);
		employeesFullTime.topLevelSalary(90000);
		employeesFullTime.setCount(9);
		arrayList.add(employeesFullTime);
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.get(getCount());
			System.out.println(i);
			
		}

	}

}
