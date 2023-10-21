/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class View {
    private Scanner scanner = new Scanner(System.in);

    public void displayErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }

    public String getInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public void exit() {
        System.exit(0);
    }
}
