// default package
// Generated Dec 12, 2016 2:08:48 PM by Hibernate Tools 3.4.0.CR1

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable {

	private long id;
	private Teacher teacher;
	private String name;
	private String degree;
	private String roll;
	private String phone;
	private String studentName;

	public Student() {
	}

	public Student(long id) {
		this.id = id;
	}

	public Student(long id, Teacher teacher, String name, String degree,
			String roll, String phone, String studentName) {
		this.id = id;
		this.teacher = teacher;
		this.name = name;
		this.degree = degree;
		this.roll = roll;
		this.phone = phone;
		this.studentName = studentName;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getRoll() {
		return this.roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}