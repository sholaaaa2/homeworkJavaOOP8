package homework;

import java.util.Arrays;

public class Stack {
	private Object[] objArr;
	private BlackList bl;

	public Stack(BlackList bl) {
		super();
		objArr = new Object[0];
		this.bl = bl;

	}

	public void addObj(Object obj) {
		if (obj != null) {
			if (bl.checkList(obj)) {
				objArr = Arrays.copyOf(objArr, objArr.length + 1);
				objArr[objArr.length - 1] = obj;
			} else {
				System.out.println("Your object in blacklist");
			}
		} else {
			System.out.println("Your object is null");
		}
	}

	public Object copyObj() {
		return objArr[objArr.length - 1];
	}

	public Object cutObj() {
		Object a = objArr[objArr.length - 1];
		objArr = Arrays.copyOf(objArr, objArr.length - 1);
		return a;
	}

	@Override
	public String toString() {
		return "Stack [objArr=" + Arrays.toString(objArr) + ", bl=" + bl + "]";
	}

}
