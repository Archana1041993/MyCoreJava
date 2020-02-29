package january12;

public class Student {
	String name;
	int id;
	String collegeName;
	String department;
	
	//create  first constructor
	Student(String iname,int iid,String icollegeName,String idepartment)
	{
		name=iname;
		id=iid;
		collegeName=icollegeName;
		department=idepartment;
	}
	//second constructor by default pass the college name
	Student(String iname,int iid,String idepartment){
		name=iname;
		id=iid;
		department=idepartment;
		collegeName="dhole patil";
	}
	
	void attendLecture() {
		System.out.println( name + " attends lecture");
		
	}
	void studiesInDepartment(){
		System.out.println( name + " studies in department " + department);
}
	
}
