package mvcProject;

public class StudentController {
	private StudentPojoClass model;
	private StudentView view;
	
	public StudentController(StudentPojoClass model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
	public void updateName(String name)
	{
		model.setName(name);
	}
	public void updateRollnumber(int rn)
	{
		model.setRollNumber(rn);
	}
	public void updatedData()
	{
		view.printStudent(model.getName(), model.getRollNumber());
	}

}
