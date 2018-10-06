package thuchanh1;

public class StudentManager {
    private Student[] students = new Student[20];
    private int size = 0;

    public StudentManager() {
    }

    public void add(Student student) {
        students[size] = student;
        size++;
    }

    public void displayAll() {
        if (size == 0) {
            System.out.println("Hiện không có sinh viên nào");
        } else {
            System.out.println("Có tổng cộng " + size + " sinh viên");
            for (int i = 0; i < size; i++) {
                System.out.println(students[i].getInfomation());
            }
            System.out.println();
        }
    }

    public void find(String name) {
        int found = 0;
        for (int i = 0; i < size; i++) {
            boolean check = students[i].getName().equals(name);
            if (check){
                System.out.println("Tìm thấy sinh viên "+name+" ở vị trí thứ "+(i+1)+" trong danh sách");
                found++;
            }
        }
        if (found == 0){
            System.out.println("Không tìm thấy sinh viên "+name+" trong danh sách");
        }
    }

}
