package mx.edu.utez.u2_ti_02_formulario;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        Label label = new Label("Nombre");
        TextField tfnombre = new TextField();

        Label label2 = new Label("Apellido");
        TextField tfapellido = new TextField();


        Label label3 = new Label("Edad");
        TextField tfedad = new TextField();

        Label label4 = new Label("Rol");
        ObservableList<String> rol = FXCollections.observableArrayList("estudiante", "profesor", "admin");
        ComboBox<String> cbrol = new ComboBox<>(rol);

        Button crear = new Button("Crear");
        Button reset = new Button("Reset");

        Label label5 = new Label("Resultado");

        crear.setOnAction( e->{
            String nombre = tfnombre.getText();
            String apellido = tfapellido.getText();
            String edad = tfedad.getText();
            String rols = cbrol.getSelectionModel().getSelectedItem();
            if (nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || rols.isEmpty()) {
                label5.setText("Debe llenar todos los campos");
            }else{
                grid.setStyle("-fx-background-color: green");
                label5.setStyle("-fx-background-color: ligthblue;");
            }
        });

        reset.setOnAction( e->{
            tfedad.clear();
            tfapellido.clear();
            tfnombre.clear();
            cbrol.getSelectionModel().clearSelection();
        });

        grid.add(label, 0, 0);
        grid.add(tfnombre, 1, 0);
        grid.add(label2, 0, 1);
        grid.add(tfapellido, 1, 1);
        grid.add(label3, 0, 2);
        grid.add(tfedad, 1, 2);





    }

    public static void main(String[] args) {
        launch();
    }
}