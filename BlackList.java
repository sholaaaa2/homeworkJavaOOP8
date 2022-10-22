package homework;

import java.util.Arrays;

public class BlackList {
	Class[] classArr;

	public BlackList(Class... classes) {
		super();
		this.classArr = classes;
	}

	public boolean checkList(Object obj) {
		Class classObj = obj.getClass();
		for (Class class1 : classArr) {
			if (class1 == classObj) {
				return false;
			}
		}
		return true;
	}

	public void addClass(Class cls) {
		if (cls != null) {
			classArr = Arrays.copyOf(classArr, classArr.length + 1);
			classArr[classArr.length - 1] = cls;

		} else {
			System.out.println("Your class is null");
		}
	}

	@Override
	public String toString() {
		return "BlackList [classArr=" + Arrays.toString(classArr) + "]";
	}

}
