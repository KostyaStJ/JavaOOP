package ooponehw;

public class Cat {
   private String name;
   private String color;
   private String gender;
   private  int age;
	
   public Cat(String name, String color, String gender, int age) {
		super();
		this.name = name;
		this.color = color;
		this.gender = gender;
		this.age = age;
	}
	public Cat() {
		super();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
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
	void meow(){
		System.out.println("Meow!Meow!Meow");
	}
    
	void sleep() {
		System.out.println("Zzzzzz...");
	}
	
	void infoprint(){
		System.out.println("Name: " + name);
		System.out.println("Color: " + color);
		System.out.println("Gen.: " + gender);
		System.out.println("Age: " + age);
	}
        
    
    
}
