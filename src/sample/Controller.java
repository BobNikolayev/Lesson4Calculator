package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;


import javax.swing.*;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextArea textArea2;
    String action = " ";
    int firstNum = 0;
    int secondNum = 0;


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
        textArea2.clear();
        firstNum = Integer.parseInt(textArea.getText());
        textArea2.appendText(textArea.getText());
        textArea.clear();
        textArea2.appendText("+");
        action = "+";

    }

    public void btnClickMinus(ActionEvent actionEvent) {
        textArea2.clear();
        firstNum = Integer.parseInt(textArea.getText());
        textArea2.appendText(textArea.getText());
        textArea.clear();
        textArea2.appendText("-");
        action = "-";
    }

    public void btnClickX(ActionEvent actionEvent) {
        textArea2.clear();
        firstNum = Integer.parseInt(textArea.getText());
        textArea2.appendText(textArea.getText());
        textArea.clear();
        textArea2.appendText("*");
        action = "*";
    }

    public void btnClickDiv(ActionEvent actionEvent) {
        textArea2.clear();
        firstNum = Integer.parseInt(textArea.getText());
        textArea2.appendText(textArea.getText());
        textArea.clear();
        textArea2.appendText("/");
        action = "/";

    }
    public void btnClickEqual(ActionEvent actionEvent) {
        secondNum = Integer.parseInt(textArea.getText());
        if(action == "+"){
            int res = firstNum + secondNum;
            textArea2.setText(Integer.toString(res));
            textArea.clear();
        }else if(action == "-"){
            int res = firstNum - secondNum;
            textArea2.setText(Integer.toString(res));
            textArea.clear();
        }else if(action == "*"){
            int res = firstNum * secondNum;
            textArea2.setText(Integer.toString(res));
            textArea.clear();
        }else if(action == "/"){
           if(secondNum == 0){textArea2.setText("Impossible operation");}
            try{
                int res = firstNum / secondNum;
                textArea2.setText(Integer.toString(res));
            }catch (ArithmeticException a){
                textArea.clear();
            }
            textArea.clear();


        }

    }

}
