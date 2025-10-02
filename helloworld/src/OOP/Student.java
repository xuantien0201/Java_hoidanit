package OOP;

public class Student {
	// class attributes
	String name;
	int age;

	// contructor không có tham số -- java sẽ tự động tạo -- quy tắc ngầm
	public Student() {

	}

	// contructor có tham số đầu vào -- this chính là đối tượng hiện tại
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// class method
	// void: return nothing
	public void learnJava() {
		System.out.println("Learn Java with me");
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

}
