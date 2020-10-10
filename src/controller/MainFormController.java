package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public AnchorPane root;
    public AnchorPane subFormsAnchorPane;

    public void btnMember_OnAction(ActionEvent actionEvent) {
        loadMemberForm();
    }

    public void btnBook_OnAction(ActionEvent actionEvent) {
        loadBookForm();
    }

    public void btnBorrow_OnAction(ActionEvent actionEvent) {
       loadBorrowForm();
    }

    public void btnReturn_OnAction(ActionEvent actionEvent) {
        loadReturnForm();
    }

    public void btnMember_OnKeyReleased(KeyEvent keyEvent) {
        if(keyEvent.getCode()== KeyCode.ENTER){
            loadMemberForm();
        }
    }

    public void btnBook_OnKeyReleased(KeyEvent keyEvent) {
        if(keyEvent.getCode()== KeyCode.ENTER){
            loadBookForm();
        }
    }

    public void btnBorrow_OnKeyReleased(KeyEvent keyEvent) {
        if(keyEvent.getCode()== KeyCode.ENTER){
            loadBorrowForm();
        }
    }

    public void btnReturn_OnKeyReleased(KeyEvent keyEvent) {
        if(keyEvent.getCode()== KeyCode.ENTER){
            loadReturnForm();
        }
    }
    public void loadMemberForm(){
        try {
            AnchorPane pane = FXMLLoader.load(this.getClass().getResource("/view/ManageMember.fxml"));
            subFormsAnchorPane.getChildren().setAll(pane);
        } catch (IOException e) {
            System.out.println("There's problem with loading the Manage member Form");
            e.printStackTrace();
        }
    }
    public void loadBookForm(){
        try {
            AnchorPane pane = FXMLLoader.load(this.getClass().getResource("/view/ManageBook.fxml"));
            subFormsAnchorPane.getChildren().setAll(pane);
        } catch (IOException e) {
            System.out.println("There's problem with loading the Manage book Form");
            e.printStackTrace();
        }
    }
    public void loadBorrowForm(){
        try {
            AnchorPane pane = FXMLLoader.load(this.getClass().getResource("/view/BorrowForm.fxml"));
            subFormsAnchorPane.getChildren().setAll(pane);
        } catch (IOException e) {
            System.out.println("There's problem with loading the Borrow Form");
            e.printStackTrace();
        }
    }
    public void loadReturnForm(){
        try {
            AnchorPane pane = FXMLLoader.load(this.getClass().getResource("/view/ReturnForm.fxml"));
            subFormsAnchorPane.getChildren().setAll(pane);
        } catch (IOException e) {
            System.out.println("There's problem with loading the Return Form");
            e.printStackTrace();
        }
    }
}
