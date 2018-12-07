package SWE205Student;

import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.*;

public class StudentController extends Application {
	
	@FXML ToggleGroup ToggleButtonGroup;
	@FXML RadioButton CRNRB;
	@FXML RadioButton ViewCoursesRB;
	
	public static void main(String[] args) {
		launch(args);
	}

	// to select controller fx:controller="SWE205P.Classname"
	@Override
	public void start(Stage primarystage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("StudentSystem.fxml"));
		primarystage.setTitle("Registration services - Student System");
		primarystage.setScene(new Scene(root));
		primarystage.show();
	}
	
	public void AddCoursePressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("Addcourse.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Add Course");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void SubmitWhileCRNOrViewCoursesPressed(ActionEvent event) throws IOException {
		
		if(CRNRB.isSelected()) {
			Parent scene = FXMLLoader.load(getClass().getResource("CRNmethod.fxml"));
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setTitle("Registration services - Type your CRNs");
			window.setScene(new Scene(scene));
			window.show();
		}
		
		else if(ViewCoursesRB.isSelected()) {
			Parent scene = FXMLLoader.load(getClass().getResource("StudentViewCourses_AddCourse.fxml"));
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			window.setTitle("Registration services - Choose your Sections");
			window.setScene(new Scene(scene));
			window.show();
		}
		
	}
	
	public void EditPersonalInformationPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("Editpersonalinfo.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Edit Personal Information");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void ViewCoursesPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("Viewcoursemethod.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - View Courses");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void ViewCoursePrerequisitesPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("Viewcoursepre.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - View Prerequisites of a course");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void StudentDropCoursePressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("StudentDropCourse.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Drop Course");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void StudentViewAdvisorPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("StudentViewAdvisor.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Advisor Information");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void StudentViewCourses_2Pressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("StudentViewCourses_2.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - View Courses");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void StudentViewSchedulePressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("StudentViewSchedule.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Schedule");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void StudentViewTranscriptPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("StudentViewTranscript.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Transcript");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void StudentSectionClicked_ViewSchedulePressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("StudentSectionClicked_ViewSchedule.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Section Information");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void ReturnPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("StudentSystem.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Student System");
		window.setScene(new Scene(scene));
		window.show();
	}
	
}
