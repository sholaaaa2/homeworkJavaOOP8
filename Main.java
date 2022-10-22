package homework;

import java.io.File;

public class Main {

	public static void main(String[] args) {
//		Group to File
		File f = new File("a.txt");
		Group g = new Group(12);

		for (int i = 0; i < 10; i++) {
			String name = "st" + i;
			int age = 17 + i;
			g.add(new Student(name, age, "m"));
		}
		System.out.println(g.toString());
		Group g2 = null;
		GroupOperation.writeToFile(g, f);
		g2 = GroupOperation.readFromFile(f);

		System.out.println(g2.toString());

//		Stack
		Student std = new Student(null, 0, null);

		BlackList bl = new BlackList(Student.class, GroupOperation.class);

		Stack stk = new Stack(bl);

		stk.addObj(g);
		stk.addObj(g2);
		stk.addObj(std);
		stk.addObj(null);
		Object o1 = stk.copyObj();
		System.out.println(o1.toString());
		Object o2 = stk.cutObj();
		System.out.println(o2.toString());

	}

}
