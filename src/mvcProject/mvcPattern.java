package mvcProject;

public class mvcPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentPojoClass s1=dtabase();
		StudentView sv=new StudentView();
		StudentController sc=new StudentController(s1,sv);
		sc.updatedData();

	}
	public static StudentPojoClass dtabase()
	{
		StudentPojoClass s=new StudentPojoClass();
		s.setName("radhika");
		s.setRollNumber(10);
		return s;
		
	}

}

