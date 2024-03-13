package ilk;

public class Person {
	private String name;
	private int age;
	private int score;
	
	public Person(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String toString() {
		return (name + " " + age + " " + score);
	}
}
