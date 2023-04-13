    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
 */
package views;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Compte;
import services.CompteCRUD;

/**
 * FXML Controller class
 *
 * @author BAZINFO
 */
public class ComptesAdminController implements Initializable {

    @FXML
    private Label welcomeLb;
    @FXML
    private ScrollPane scroll;
    @FXML
    private TableView<Compte> tableview;
    @FXML
    private TableColumn<Compte, Integer> type;
    @FXML
    private TableColumn<Compte, Date> dateCol;
    @FXML
    private TableColumn<Compte, String> usercol;
    @FXML
    private TableColumn<Compte, String> statuecol;
    @FXML
    private Button profilfx;

    /**
     * Initializes the controller class.
     */
    CompteCRUD compteService = new CompteCRUD();
    ObservableList<Compte> obs;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            List<Compte> comptes = compteService.recuperer();
            System.out.println(comptes);
            obs = FXCollections.observableArrayList(comptes);
            tableview.setItems(obs);
            type.setCellValueFactory(new PropertyValueFactory<>("idTypeId"));
            dateCol.setCellValueFactory(new PropertyValueFactory<>("dateCreation"));
            usercol.setCellValueFactory(new PropertyValueFactory<>("idUserId"));
            statuecol.setCellValueFactory(new PropertyValueFactory<>("staute"));

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @FXML
    private void goToAccounts(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TypeCompteAdmin.fxml"));
            Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @FXML
    private void goToTransactions(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("WireTransferAdmin.fxml"));
            Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @FXML
    private void goToSendMoney(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SendMoneyAdmin.fxml"));
            Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @FXML
    private void goToHome(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Admin.fxml"));
            Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @FXML
    private void details(ActionEvent event) {
    }

    @FXML
    private void goToAccountsDemonds(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ComptesAdmin.fxml"));
            Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
