package assignment.week3.day1;

public class Students {

	public void getStudentInfo(String id) {
		System.out.println(id);
	}
	public void getStudentInfo(String id, String name) {
		System.out.println(id+" "+name);
		
	}
	public void getStudentInfo(String email, long phonenumber) {
		System.out.println(email+" "+phonenumber);
		
	}
	public static void main(String[] args) {
		Students  obj=new Students();
		obj.getStudentInfo("17CS373");
		obj.getStudentInfo("17CS373","Shibi M");
		obj.getStudentInfo("shibi@gmail.com", 9123456789l);
	}
}
