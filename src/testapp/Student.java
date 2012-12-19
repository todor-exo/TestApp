/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author Todor Todorov
 */
public class Student extends Human implements Comparable<Student> {

    private float mark = 0;
    
    public Student (String firstName, String lastName, float mark){
        super(firstName, lastName);
        this.mark = mark;
    }
    
    public static void bubble_srt(Student arr[], int len){
        int i, j;
        Student t;
        for(i = 0; i < len; i++){
            for(j = 1; j < (len-i); j++){
                if(arr[j-1].mark > arr[j].mark){
                   t = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = t;
                }
            }
        }
    }
    
    @Override
    public int compareTo(Student o) {
        if (this.mark < o.mark){
            return -1;
        }
        else if (this.mark > o.mark){
            return 1;
        }
        else {
            return 0;
        }
        
    }
    
    

    /**
     * @return the mark
     */
    public float getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(float mark) {
        this.mark = mark;
    }
    
}
