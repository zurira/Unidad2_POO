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

import java.io.IOException;

//Zurisaddai
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label lbNombre = new Label("Nombre");
        TextField tfnombre = new TextField();

        Label lbApellido = new Label("Apellido");
        TextField tfapellido = new TextField();


        Label lbEdad = new Label("Edad");
        TextField tfedad = new TextField();

        Label lbRol = new Label("Rol");
        ObservableList<String> rol = FXCollections.observableArrayList("estudiante", "profesor", "admin");
        ComboBox<String> cbrol = new ComboBox<>(rol);

        Button btncrear = new Button("Crear");
        Button btnreset = new Button("Reset");

        Label lbresultado = new Label("");

        GridPane root = new GridPane();

        btncrear.setOnAction( e->{
            String nombre = tfnombre.getText();
            String apellido = tfapellido.getText();
            String edad = tfedad.getText();
            String rols = cbrol.getSelectionModel().getSelectedItem();
            if (nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || rols.isEmpty()) {
                lbresultado.setText("Debe llenar todos los campos");
            }else{
                root.setStyle("-fx-background-color: green");
                lbresultado.setStyle("-fx-background-color: lightblue; -fx-padding: 10px");
                lbresultado.setText("Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad + " Rol: " + rols);
            }
        });

        btnreset.setOnAction( e->{
            tfedad.clear();
            tfapellido.clear();
            tfnombre.clear();
            cbrol.setValue(null);
            lbresultado.setStyle("");
            lbresultado.setText("");
            root.setStyle("");
        });
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.add(lbNombre, 0, 0);
        root.add(tfnombre, 1, 0);
        root.add(lbApellido, 0, 1);
        root.add(tfapellido, 1, 1);
        root.add(lbEdad, 0, 2);
        root.add(tfedad, 1, 2);
        root.add(lbRol, 0, 3);
        root.add(cbrol, 1, 3);
        root.add(btncrear, 0, 4);
        root.add(btnreset, 1, 4);
        root.add(lbresultado, 0, 5);

        Scene scene = new Scene(root, 600, 540);
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}}