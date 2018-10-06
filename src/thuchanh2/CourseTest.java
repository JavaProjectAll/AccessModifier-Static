package thuchanh2;

public class CourseTest {
    public static void displayCourse(Course course) {
        System.out.println("Khóa học \"" + course.getName() + "\" có " + course.getStudentsCount() + " sinh viên");
        if (course.getStudentsCount() > 0) {
            System.out.println("student(s):{");
            String[] students = course.getStudents();
            for (int i = 0; i < course.getStudentsCount(); i++) {
                if (i == (course.getStudentsCount() - 1)) {
                    System.out.print("\"" + students[i] + "\"");
                } else {
                    System.out.print("\"" + students[i] + "\", ");
                }
            }
            System.out.println("\n}");
        }
    }

    public static void main(String[] args) {
        Course java = new Course("Java");
        java.addStudent("Jonly");
        java.addStudent("Peter");
        java.addStudent("Thomson");
        displayCourse(java);

        java.removeStudent("Thomson");
        displayCourse(java);

        java.removeStudent("ABC");
        displayCourse(java);
    }
}
