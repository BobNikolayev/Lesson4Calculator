package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.IndexedCell;
import javafx.scene.control.TextArea;
import sun.swing.SwingAccessor;

import javax.swing.*;

public class Controller {
    @FXML
    public TextArea textArea;

    public void btnClick2(ActionEvent actionEvent) {
    textArea.appendText("2");
    }

    public void btnClick1(ActionEvent actionEvent) {
        textArea.appendText("1");
    }

    public void btnClick4(ActionEvent actionEvent) {
        textArea.appendText("4");
    }

    public void btnClick7(ActionEvent actionEvent) {
        textArea.appendText("7");
    }



    public void btnClick5(ActionEvent actionEvent) {
        textArea.appendText("5");
    }

    public void btnClick0(ActionEvent actionEvent) {
        textArea.appendText("0");
    }

    public void btnClick8(ActionEvent actionEvent) {
        textArea.appendText("8");
    }

    public void btnClick3(ActionEvent actionEvent) {
        textArea.appendText("3");
    }

    public void btnClick6(ActionEvent actionEvent) {
        textArea.appendText("6");
    }

    public void btnClick9(ActionEvent actionEvent) {
        textArea.appendText("9");
    }

    public void ACbtnClick(ActionEvent actionEvent) {
        textArea.clear();
    }

    public void btnClickPlus(ActionEvent actionEvent) {
        textArea.appendText("+");
    }

    public void btnClickMinus(ActionEvent actionEvent) {
        textArea.appendText("-");
    }

    public void btnClickX(ActionEvent actionEvent) {
        textArea.appendText("*");
    }

    public void btnClickDiv(ActionEvent actionEvent) {
        textArea.appendText("/");
    }
    public void btnClickEqual(ActionEvent actionEvent) {
        int resultString = Integer.parseInt(textArea.getText());

    }

    public int resultEqual(int result){
        result
    }

}
