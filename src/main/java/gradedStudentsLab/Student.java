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

    public double getExamScores() {
       String examAmount = "Exam Scores: ";
       for (int a = 0; a < this.examScores.size(); a++) {
          examAmount += "Exam " + a + "->" + this.examScores.get(a);
       }
       return Double.parseDouble(examAmount);
    }
    public void addExamScores(double examScores){
        this.examScores.add(examScores);
    }
    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }
    public double getAverageExamScore(){
        double sum = 0;
      for(int avgExamScore = 0; avgExamScore < this.examScores.size(); avgExamScore++){
          sum += this.examScores.get(avgExamScore);
      }
      return sum / examScores.size();
    }

    @Override
    public String toString(){
        return "Student Name: " + getFirstName() + " " + getLastName() +
                "Average Score: " + getAverageExamScore() + "Exam Scores: " +
                getExamScores();
    }
}
