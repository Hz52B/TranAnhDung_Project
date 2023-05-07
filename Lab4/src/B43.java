class Person {
	private
		String name;
		int age;
		char gender;
	
	public Person() {
		super();
	}
	
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "\nName: " + name + "\nAge: " + age + "\nGender: " + gender;
	}
}

class Employee extends Person {
	private 
		String employerName;
		String dateHired;
		
	public Employee() {
		super();
	}

	public Employee(String name, int age, char gender, String employerName, String dateHired) {
        super(name, age, gender);
        this.employerName = employerName;
        this.dateHired = dateHired;
    }

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEmployer name: " + employerName + "\nDate Hired: " + dateHired;
	}
}

class PartTimeEmployee extends Employee{
	private int hoursPerWeek;

	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired,int hoursPerWeek) {
		super(name, age, gender, employerName, dateHired);
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return super.toString() + "\nHours Per Week: " + hoursPerWeek;
	}
}

public class B43 {
	public static void main(String[] args) {
		Person ps = new Person("Nguyen Van A",21,'0');
		System.out.println(ps);
		
		Employee ep = new Employee("Pham Thi H", 40, '1', "FPT Software", "20/3/2022");
		System.out.println(ep);
		
        PartTimeEmployee pte = new PartTimeEmployee("John Lee", 25, '0', "Viettel", "27/11/2021", 28);
        System.out.println(pte);
        
        pte.setHoursPerWeek(36);
        System.out.println(pte);
	}
}
