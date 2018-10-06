package thuchanh2;

public class Course {
    private String name;
    private String[] students = new String[20];
    private int studentsCount = 0;

    public Course(String name) {
        this.name = name;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void addStudent(String name) {
        students[studentsCount] = name;
        studentsCount++;
    }

    public void removeStudent(String name) {
        int j = 0;
        boolean check = false;
        for (int i = 0; i < studentsCount; i++) {
            if (students[i] != name) {
                students[j] = students[i];
                j++;
            } else {
                check = true;
            }
        }
        if (check) {
            System.out.println("\nĐã xóa một sinh viên tên " + name);
            studentsCount = j;
        } else {
            System.out.println("\nKhông có tên sinh viên " + name + " trong danh sách ");
        }
    }
}
