package SWE205Faculty;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;



public class FacultyController extends Application {
	

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primarystage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("FacultySystem.fxml"));
		primarystage.setTitle("Registration services - Faculty System");
		primarystage.setScene(new Scene(root));
		primarystage.show();
	}
	
	public void FacultyAssignGradePressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("FacultyAssignGrade.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Assign Grade");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void FacultyTakeAttendance(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("FacultyTakeAttendance.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Take Attendance");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void FacultyViewAssignedCoursesPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("FacultyViewAssignedCourses.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Assigned Courses");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void FacultyViewSections(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("FacultyViewSections.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Sections");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void FacultyViewStudentInformation(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("FacultyViewStudentInformation.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Student Information");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void ReturnPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("FacultySystem.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Faculty System");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	
}