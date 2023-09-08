package lk.ijse.stockmanage102Udeeka.controller;

import db.Db;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    public TextField txtUser;
    public TextField txtPw;
    public AnchorPane rootLogin;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String username = txtUser.getText();
        String pw = txtPw.getText();

        if(username.equals(Db.username) && pw.equals(Db.password)){
            navigate();
        } else {
            new Alert(Alert.AlertType.ERROR, "User Name or Password Incorrect").show();
        }
    }

    private void navigate() throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) this.rootLogin.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }


}
