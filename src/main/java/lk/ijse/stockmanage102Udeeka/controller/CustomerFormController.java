package lk.ijse.stockmanage102Udeeka.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerFormController {
    public AnchorPane rootCustomerManage;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        Scene scene = new Scene(root);

        Stage stage = (Stage) this.rootCustomerManage.getScene().getWindow();
        stage.setScene(scene);

        stage.setTitle("Dashboard");
    }
}

