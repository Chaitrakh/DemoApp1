package in.ineuron;

public class Student {

	 int rollno;
	 String name;
	 int marks;

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Chai";
		s1.marks=99;
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Abhi";
		s2.marks=88;
		
		Student[] student=new Student[2];
		student[0]=s1;
		student[1]=s2;
		
		for(Student stud:student) {
			System.out.println(stud.name+":"+stud.marks+":"+stud.rollno);
		}
		

	}

}
