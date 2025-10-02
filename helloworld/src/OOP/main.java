package OOP;

public class main {

	public static void main(String[] args) {
		System.out.println("Start file main");
		Student student1 = new Student();
		System.out.println("Name: " + student1.getName() + "and age: " + student1.getAge());

		Student student2 = new Student("Tiến", 21);
		System.out.println("Name: " + student2.getName() + " and age: " + student2.getAge());
	}
}
