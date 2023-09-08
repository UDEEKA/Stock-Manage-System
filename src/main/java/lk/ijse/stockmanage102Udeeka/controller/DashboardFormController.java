package lk.ijse.stockmanage102Udeeka.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.io.IOException;

public class DashboardFormController {
    public AnchorPane dashBoardNode;
    public AnchorPane dashboardProfile;

    public void buttonCustomerOnAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        this.dashBoardNode.getChildren().clear();
        this.dashBoardNode.getChildren().add(rootNode);

    }


    public void btnOnActionItemManage(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));

        this.dashBoardNode.getChildren().clear();
        this.dashBoardNode.getChildren().add(rootNode);

    }

    public void btnOnActionSupplierManage(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/supplier_form.fxml"));

        this.dashBoardNode.getChildren().clear();
        this.dashBoardNode.getChildren().add(rootNode);
    }


    public void btnOnLogoutAction(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(rootNode);

        Stage stage = (Stage) this.dashboardProfile.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login Form");
    }

    public void btnBackToDashboard(ActionEvent actionEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));

        this.dashboardProfile.getChildren().clear();
        this.dashboardProfile.getChildren().add(rootNode);
    }
}

