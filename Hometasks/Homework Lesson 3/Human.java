package st.kostya;

public class Human {
	private String gender;
	private int age;
	private String name;
	private String surname;

	public Human(String gender, int age, String name, String surname) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
		this.surname = surname;
	}

	public Human() {
		super();
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String toString() {
		return "Name: " + name + "; Surname: " + surname + "; Gender: " + gender + "; Age: " + age;
	}

}
