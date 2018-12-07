
public class Course {
	
	private String departmentName;
	private String courseName;
	private Section[] sections;
	
	public Course() {
		
	}
	
	
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
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
