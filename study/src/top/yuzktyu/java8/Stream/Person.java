package top.yuzktyu.java8.Stream;
/*
* @author yuzk
* @date 2018年10月27日 下午5:12:29
* @version 1.0
*/
public class Person {
	public static enum Sex{
		MAIL,FEMALE;
	}
	private String name;
	private int age;
	private Sex gender;
	private double height;
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
	public Sex getGender() {
		return gender;
	}
	public void setGender(Sex gender) {
		this.gender = gender;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + "]";
	}
	public Person(){
		
	}
	public Person(String name, int age, Sex gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
}

