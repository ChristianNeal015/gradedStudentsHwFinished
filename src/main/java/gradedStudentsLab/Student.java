package gradedStudentsLab;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double [] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<Double>(Arrays.asList(examScores));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    public String getExamScores() {
       return getExamScores();
    }
    public void addExamScores(double examScores){
        this.examScores.add(examScores);
    }
    public void setExamScore(int examNumber, double newScore) {
        
    }
}
