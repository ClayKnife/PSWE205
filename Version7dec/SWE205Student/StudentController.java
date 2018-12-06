package SWE205Student;

import javafx.event.ActionEvent;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;

public class StudentController extends Application {
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
	
	public void SubmitWhileCRNPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("CRNmethod.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Type your CRNs");
		window.setScene(new Scene(scene));
		window.show();
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
	
	public void ReturnPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("StudentSystem.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Student System");
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
	
}
