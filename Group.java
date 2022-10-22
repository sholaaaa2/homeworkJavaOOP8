package homework;

import java.io.Serializable;
import java.util.Arrays;

public class Group implements Serializable {

	private static final long serialVersionUID = 1L;
	private int groupID;
	private Student[] studentArr = new Student[10];

	public Group(int groupID, Student[] studentArr) {
		super();
		this.groupID = groupID;
		this.studentArr = studentArr;
	}

	public Group(int groupID) {
		super();
		this.groupID = groupID;
	}

	public Group() {
		super();
	}

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public Student[] getStudentArr() {
		return studentArr;
	}

	public void setStudentArr(Student[] studentArr) {
		this.studentArr = studentArr;
	}

	public void add(Student std) {
		for (int i = 0; i < studentArr.length; i++) {
			if (studentArr[i] == null) {
				studentArr[i] = std;
				return;
			}
		}
		System.out.println("Group is full");
	}
	


	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", studentArr=" + Arrays.toString(studentArr) + "]";
	}

}
