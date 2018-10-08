package baitap5.codegym.todo;

import java.util.Scanner;

public class ToDoList {
    private Entry[] list;
    private int length;

    public ToDoList() {
    }

    public ToDoList(Entry[] list, int length) {
        this.list = list;
        this.length = length;
    }

    public void addEntry(Entry entry) {
        list[length] = entry;
        length++;
    }

    public void showTodoList() {
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                System.out.println("\t" + i + " - [" +list[i].getPriority()+"]"+ list[i].getNotes());
            }
        } else {
            System.out.println("Không có dữ liệu");
        }
    }

    public void sortList() {
        Entry backup;
        System.out.println("Sắp xếp theo độ ưu tiên");
        for (int i = 0; i < length ; i++) {
            for (int j = i+1; j < length; j++) {
                if (list[i].getPriority() > list[j].getPriority()){
                    backup = list[i];
                    list[i] = list[j];
                    list[j] = backup;
                    continue;
                }
            }
        }
    }

    public void removeEntry(int id) {
        if (id < list.length) {
            System.out.print("Bạn có muốn xóa nó không Y/N: ");
            Scanner scanner = new Scanner(System.in);
            String check = scanner.nextLine();
            if (check.equals("y")) {
                int j = 0;
                for (int i = 0; i < length; i++) {
                    if (i == id) {
                        i++;
                    }
                    list[j] = list[i];
                    j++;
                }
                Entry.count--;
                length--;
            } else if (check.equals("n")) System.out.println("Bạn bỏ xóa tác vụ");
            else System.out.println("Bạn nhập sai tác vụ");
        } else {
            System.out.println("Không tìm được tác vụ để xóa");
        }
    }

    public void getEntryByID(int id) {

    }

}
