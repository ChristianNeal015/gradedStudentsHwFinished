package gradedStudentsLab;

public class studentTest {
    public static void main(String[] args) {
        // : Given
        String firstName = "Christian";
        String lastName = "Neal";
        Double[] examScores = { 89.0, 85.0, 99.3, 92.8 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }
}
