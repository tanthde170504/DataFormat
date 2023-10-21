/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class Model {
    public String checkPhone(String phone) {
        if (!phone.matches("\\d+")) {
            return "Phone number must be a number.";
        } else if (phone.length() != 10) {
            return "Phone number must be 10 digits.";
        } else {
            return "";
        }
    }

    public String checkDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            sdf.parse(date);
            return "";
        } catch (ParseException e) {
            return "Date must be in correct format (dd/MM/yyyy).";
        }
    }

    public String checkEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            return "Email must be in correct format.";
        } else {
            return "";
        }
    }
}