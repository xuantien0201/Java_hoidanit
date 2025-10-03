package BaiTapLab6;

import java.util.ArrayList;

public class Bai2 {
	public static void main(String[] args) {
		Student hs1 = new Student("Nguyễn Nam", 32);
		Student hs2 = new Student("Trần Tùng", 14);
		Student hs3 = new Student("Nguyễn Khánh", 22);
		Student hs4 = new Student("Nam Phong", 42);
		Student hs5 = new Student("Nguyễn Lan", 50);

		ArrayList<Student> arr = new ArrayList<>();
		arr.add(hs1);
		arr.add(hs2);
		arr.add(hs3);
		arr.add(hs4);
		arr.add(hs5);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyễn")) {
				System.out.println("Người có họ Nguyễn: " + arr.get(i));
			}
		}
	}
}
