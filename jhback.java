//2021E193
//LAB 01
//TASK 01


class Student_details
{
	private String student_name;
	private String reg_no;
	
	
	public void set_name(String student_name)
	{
		this.student_name = student_name;
	}
	
	public void set_regno (String reg_no)
	{
		this.reg_no=reg_no;
	}
	
	
	
	public void get_name ()
	{
		return student_name;
	}
	
	public void get_regno ()
	{
		return reg_no;
	}
	
	
	public static void main (String args[])
	
	{
		Student_details student = new Student_details();
		
		
		student.set_name("Geethma");
		student.set_regno("2021E193");
		
		
		System.out.println("Student name: "+ student.get_name );
		System.out.println("student reg no: "+ student.get_regno);
		
	}
	
}

