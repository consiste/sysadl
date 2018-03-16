package org.sysadl.execution.ui;

import javafx.scene.control.TableColumn;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Fx extends Application {
	
	TableView tableVideo;
	
	@Override
	public void start(Stage primaryStage) {
		try {
	        primaryStage.setTitle("SysADL");
	        
		    TableColumn pinNameColumn = new TableColumn("Pin name");
	        pinNameColumn.setMinWidth(100);
	        pinNameColumn.setCellValueFactory(new PropertyValueFactory<>("PinName"));
	        
		    TableColumn variableTypeColumn = new TableColumn("Variable type");
		    variableTypeColumn.setMinWidth(100);
		    
	        TableColumn variableValueEditColumn = new TableColumn("Value");
	        variableValueEditColumn.setMinWidth(200);
	        
	        VBox vboxVideo = new VBox();
	        vboxVideo.getChildren().addAll();
	        
	        Scene sceneVideo = new Scene(vboxVideo);
	        primaryStage.setScene(sceneVideo);
	        primaryStage.show();
	        

			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			
		    TableView table = new TableView();
		    final Label label = new Label("Add values for the pins and press Ok");
	        label.setFont(new Font("Arial", 14));
		    table.setEditable(true);
		    
//		    TableColumn pinNameColumn = new TableColumn("Pin name");
//	        pinNameColumn.setMinWidth(100);
//	        
//		    TableColumn variableTypeColumn = new TableColumn("Variable type");
//		    variableTypeColumn.setMinWidth(100);
//	        TableColumn variableValueEditColumn = new TableColumn("Value");
	        
	        table.getColumns().addAll(pinNameColumn, variableTypeColumn, variableValueEditColumn);
	        final VBox vbox = new VBox();
	        vbox.setSpacing(5);
	        vbox.setPadding(new Insets(10, 0, 0, 10));
	        vbox.getChildren().addAll(label, table);
		    
			//root.setCenter(vbox);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			//primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}