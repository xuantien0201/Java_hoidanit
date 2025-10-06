package BaiTapLab8;

public class Student extends Person {
	private int mark;
	private String grade;

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
		this.mark = mark;

	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", grade=" + grade + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade() {
		if (mark >= 8) {
			this.grade = "A";
		} else if (mark >= 7) {
			this.grade = "B";
		} else if (mark >= 6) {
			this.grade = "C";
		} else if (mark >= 5) {
			this.grade = "D";
		} else {
			this.grade = "Tạch";

		}
	}

}
