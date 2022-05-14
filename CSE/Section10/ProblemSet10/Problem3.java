import java.util.Date;
class Person
{
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dateOfBirth;
	public Person(String firstName, String middleName, String lastName, Date dateOfBirth)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	public String getFirstName() { return firstName; }
	public String getMiddleName() { return middleName; }
	public String getLastName() { return lastName; }
	public String getName() { return firstName + " " + middleName + " " + lastName; }
	public Date getDateOfBirth() { return dateOfBirth; }
}
class Student extends Person
{
	private int id;
	private double gpa;
	private String major;
	private String degree;
	private int grad;
	public Student (String first, String middle, String last, Date birth, int id, double gpa, String major, String degree, int grad)
	{
		super(first, middle, last, birth);
		this.id = id;
		this.gpa = gpa;
		this.major = major;
		this.degree = degree;
		this.grad = grad;
	}
	public int getId() { return id; }
	public double getGpa() { return gpa; }
	public String getMajor() { return major; }
	public String getDegree() { return degree; }
	public int getGrad() { return grad; }
	public void changeMajor(String major) { this.major = major; }
	public void calculateGpa(String[] grades)
	{
		double total = 0;
		for (int i = 0; i < grades.length; i++)
		{
			if (grades[i].equals("A")) total += 4.00;
			else if (grades[i].equals("A-")) total += 3.67;
			else if (grades[i].equals("B+")) total += 3.33;
			else if (grades[i].equals("B")) total += 3.00;
			else if (grades[i].equals("B-")) total += 2.67;
			else if (grades[i].equals("C+")) total += 2.33;
			else if (grades[i].equals("C")) total += 2.00;
			else if (grades[i].equals("D")) total += 1.00;
		}
		gpa = total/grades.length;
	}
}