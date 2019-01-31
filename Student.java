class Student
{
	private int rollno, marks;
	void addmission(int r)
	{
		rollno=r;
		System.out.println(rollno+"student enrolled");
	}
	void exam(int m)
	{
		marks=m;
		System.out.println(marks+"obtained by"+rollno+"student");
		report();
	}
	private void report()
	{
		System.out.println("roll no: "+rollno);
		System.out.println("marks: "+marks);
	}
	public static void main(String S[])
	{
	Student st = new Student();
	st.rollno=101;
	st.exam(85);
	st.report();
	}
}
