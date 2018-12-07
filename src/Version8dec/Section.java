
public class Section {

	private String SectionName;
	private String time;
	private String location;
	private int CRN;
	private int credit;
	private Faculty teacher;
	private Student[] students;
	private double[] grades;
	private int[] attendance;
	
	public Section() {
		
	}

	/**
	 * @return the sectionName
	 */
	public String getSectionName() {
		return SectionName;
	}

	/**
	 * @param sectionName the sectionName to set
	 */
	public void setSectionName(String sectionName) {
		SectionName = sectionName;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the cRN
	 */
	public int getCRN() {
		return CRN;
	}

	/**
	 * @param cRN the cRN to set
	 */
	public void setCRN(int cRN) {
		CRN = cRN;
	}

	/**
	 * @return the credit
	 */
	public int getCredit() {
		return credit;
	}

	/**
	 * @param credit the credit to set
	 */
	public void setCredit(int credit) {
		this.credit = credit;
	}

	/**
	 * @return the teacher
	 */
	public Faculty getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(Faculty teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return the students
	 */
	public Student[] getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(Student[] students) {
		this.students = students;
	}

	/**
	 * @return the grades
	 */
	public double[] getGrades() {
		return grades;
	}

	/**
	 * @param grades the grades to set
	 */
	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	/**
	 * @return the attendance
	 */
	public int[] getAttendance() {
		return attendance;
	}

	/**
	 * @param attendance the attendance to set
	 */
	public void setAttendance(int[] attendance) {
		this.attendance = attendance;
	}


}
