package SWE205Admin;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;



public class AdminController extends Application {
	

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("AdminSystem.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Registrar Services - Administrator System");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void AdminAssignInstructorPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminAssignInstructor.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Assign Instructor");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void AdminCreateCoursePressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminCreateCourse.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Create Course");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void AdminCreateSectionPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminCreateSection.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Create Section");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void AdminOverrideSectionPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminOverrideSection.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Override Section");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void AdminRemoveCoursePressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminRemoveCourse.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Remove Course");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void AdminRemoveSectionPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminRemoveSection.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Remove Section");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void AdminSectionTimingPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminSectionTiming.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Add Course");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void AdminSetExamDatePressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminSetExamDate.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Set Exam Date");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void AdminSetRegistrationTimingPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminSetRegistrationTiming.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Set Registration Timing");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void AdminSetRoomNumberPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminSetRoomNumber.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Set Room Number");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void AdminUpdateSectionInformationPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminUpdateSectionInformation.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Update Section Information");
		window.setScene(new Scene(scene));
		window.show();
	}
	
	public void ReturnPressed(ActionEvent event) throws IOException {
		Parent scene = FXMLLoader.load(getClass().getResource("AdminSystem.fxml"));
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Registration services - Admin System");
		window.setScene(new Scene(scene));
		window.show();
	}

}
