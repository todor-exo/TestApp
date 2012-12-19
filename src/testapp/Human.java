/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author Todor Todorov
 */
public class Human {
    
    private String fName = "";
    private String lName = "";

    /**
     * @return the fName
     */
    public String getFName() {
        return fName;
    }

    /**
     * @param fName the fName to set
     */
    public void setFName(String fName) {
        this.fName = fName;
    }

    /**
     * @return the lName
     */
    public String getLName() {
        return lName;
    }

    /**
     * @param lName the lName to set
     */
    public void setLName(String lName) {
        this.lName = lName;
    }
    
    public Human(String firstName, String lastName){
        this.fName = firstName;
        this.lName = lastName;
    }
}
