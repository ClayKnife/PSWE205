
public class Student extends KFUPMUser {
	
	private double GPA;
	private int creditHours;
	private Section[] finishedCourses;
	private String[] finishedGrades;
	private Faculty advisor;
	private Section[] sections;
	
	public Student() {
		
	}
	
	public Section[] viewTranscript() {
		return finishedCourses;
	}
	
	public void viewCourses() {
		//this uses a database with all courses available from kfupm
	}
	
	public void viewCoursePrerequisites() {
		//this uses a database with all course prerequisites available from kfupm
	}
	
	public void confirmRegistration() {
		//confirms registration
	}

	/**
	 * @return the finishedGrades
	 */
	public String[] getFinishedGrades() {
		return finishedGrades;
	}

	/**
	 * @param finishedGrades the finishedGrades to set
	 */
	public void setFinishedGrades(String[] finishedGrades) {
		this.finishedGrades = finishedGrades;
	}

	/**
	 * @return the creditHours
	 */
	public int getCreditHours() {
		return creditHours;
	}

	/**
	 * @param creditHours the creditHours to set
	 */
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	/**
	 * @return the gPA
	 */
	public double getGPA() {
		return GPA;
	}

	/**
	 * @param gPA the gPA to set
	 */
	public void setGPA(double gPA) {
		GPA = gPA;
	}

	/**
	 * @return the advisor
	 */
	public Faculty getAdvisor() {
		return advisor;
	}

	/**
	 * @param advisor the advisor to set
	 */
	public void setAdvisor(Faculty advisor) {
		this.advisor = advisor;
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

}
