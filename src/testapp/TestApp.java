/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import java.util.ArrayList;

/**
 *
 * @author Todor Todorov
 */
public class TestApp {
    
    public static final int ARRAY_TOTAL_SIZE = 3;
    public static int arrStSize = 0;
    public static Student[] arrStud = new Student[ARRAY_TOTAL_SIZE];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentForm sForm = new StudentForm();
        sForm.setVisible(true);
    }
}
