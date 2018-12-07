
public class Faculty extends KFUPMUser {
	
	private Section[] sections;
	private Student[] advising;
	
	public Faculty() {
		
	}
	
	public void assignGrdae(Student student, Section section, double grade) {
		//assigns a grade for a student in a specific section
	}
	
	public void takeAttendance(Section section) {
		//takes attendance
	}
	
	public void viewStudentInformation(Section section) {
		//views student information in a section
	}

	/**
	 * @return the sections
	 */
	public Section[] getSections() {
		return sections;
	}

	/**
	 * @param sections the sections to set
	 */
	public void setSections(Section[] sections) {
		this.sections = sections;
	}

	/**
	 * @return the advising
	 */
	public Student[] getAdvising() {
		return advising;
	}

	/**
	 * @param advising the advising to set
	 */
	public void setAdvising(Student[] advising) {
		this.advising = advising;
	}

}
