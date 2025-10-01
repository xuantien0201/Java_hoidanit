package OOP;

public class main {

	public static void main(String[] args) {
		System.out.println("Start file main");

		// khai báo 1 object và gán giá trị cho các thuộc tính của object
		Student studentA = new Student();
		System.out.println("Họ tên: " + studentA.name + " và " + "Tuổi: " + studentA.age);

		Student studentB = new Student("MyName", 21);
		System.out.println("Check: " + studentB.name + " - " + studentB.age);
	}
}
