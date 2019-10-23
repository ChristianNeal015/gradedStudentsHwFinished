package gradedStudentsLab;

public class ClassRoom {
    private Student[] students;

    public ClassRoom(int maxNumberOfStudents){
    }

    public ClassRoom(Student[] students){
    }

    public ClassRoom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return getStudents();
    }

    public double getAverageExamScore() {
        double sum = 0;
        for (int avgExamScore = 0; avgExamScore < students.length; avgExamScore++) {
            sum += students[avgExamScore].getExamScores();
        }
        return sum;
    }

    public void addStudent(Student student){
        for (int a = 0; a < students.length; a++){
            if (students[a] == student) {
                students[a] = student;
            }
        }
    }

    public void removeStudent(String firstName, String lastName){
        for (int a = 0; a < students.length; a++){
            if (students[a].getFirstName().equals(firstName) && students[a].getLastName().equals(lastName)){
                students[a] = new Student(null, null, null);
            }
        }
    }

    public void getStudentByScore(){
        for (int counter = students.length; counter <= students.length; counter--){
            for (Student student : students){
                if (student.getExamScores() > 0){
                    students[counter] = new Student(null, null, null);
                }
            }
        }
    }
}
