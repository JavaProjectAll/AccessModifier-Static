package thuchanh1;

public class StudentManagerTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.displayAll();

        Student peter = new Student("Peter", 21);
        studentManager.add(peter);
        System.out.println("Đã thêm "+peter.getInfomation());
        studentManager.displayAll();

        Student andy = new Student("Andy", 22);
        studentManager.add(andy);
        System.out.println("Đã thêm "+andy.getInfomation());
        studentManager.displayAll();

        Student thomson = new Student("Thomson", 23);
        studentManager.add(thomson);
        System.out.println("Đã thêm "+thomson.getInfomation());
        studentManager.displayAll();

        studentManager.find("Andy");
    }
}
