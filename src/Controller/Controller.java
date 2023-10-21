/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Model;
import View.View;

/**
 *
 * @author DELL
 */
public class Controller {
    private View view;
    private Model model;

    public Controller() {
        view = new View();
        model = new Model();
    }

    public void run() {
        String phone = view.getInput("Enter Phone Number");
        String phoneErrorMessage = model.checkPhone(phone);
        if (!phoneErrorMessage.isEmpty()) {
            view.displayErrorMessage(phoneErrorMessage);
            return;
        }

        String date = view.getInput("Enter Date (dd/MM/yyyy)");
        String dateErrorMessage = model.checkDate(date);
        if (!dateErrorMessage.isEmpty()) {
            view.displayErrorMessage(dateErrorMessage);
            return;
        }

        String email = view.getInput("Enter Email");
        String emailErrorMessage = model.checkEmail(email);
        if (!emailErrorMessage.isEmpty()) {
            view.displayErrorMessage(emailErrorMessage);
            return;
        }

        view.exit();
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.run();
    }
}
