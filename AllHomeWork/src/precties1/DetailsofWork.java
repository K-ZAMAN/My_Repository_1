package precties1;

public class DetailsofWork  extends Salary  {
	public int totalHours;

	public int getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(int totalHours) {
		System.out.println("this is total houres");
		this.totalHours = totalHours;
	}
	public int totalworkingday(int hourday, int lauchhour){
		System.out.println("total hours of the day");
		System.out.println("this is the lounc hure");
		return hourday;
	}
	@Override
	public void employee() {
		System.out.println("Totoal Employees");
		System.out.println("Totoal Employees second");
		// TODO Auto-generated method stub
		
	}
	public void setTotalSaalary(int totalSaalary) {
		this.totalSaalary = totalSaalary;
	}
	
	public void myName(){
		System.out.println("khsors");
	}
	
	
	
	

}
