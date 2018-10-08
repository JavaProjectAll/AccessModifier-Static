package baitap5.codegym.test;

import baitap5.codegym.todo.Entry;
import baitap5.codegym.todo.ToDoList;

public class TestTodo {
    public static void main(String[] args) {
        Entry[] entry = new Entry[20];
//                entry = {new Entry(0, "5h30 Dậy tập thể dục"),
//                new Entry(1, "6h30 Ăn sáng"),
//                new Entry(0, "7h Đi làm"),
//                new Entry(1, "8h vào chỗ làm")
//        };
        System.out.println("*Có tổng cộng " + Entry.getCount() + " tác vụ");
        ToDoList toDoList = new ToDoList(entry, Entry.getCount());
        entry[0] = new Entry(0,"5h30 Dậy tập thể dục");
        toDoList.addEntry(entry[0]);
        entry[1] = new Entry(1,"6h30 Ăn sáng");
        toDoList.addEntry(entry[1]);
        entry[2] = new Entry(0,"7h Đi học");
        toDoList.addEntry(entry[2]);
        entry[3] = new Entry(1,"8h vào chỗ làm");
        toDoList.addEntry(entry[3]);
        entry[4] = new Entry(1,"10h tập thể dục giữa giờ");
        toDoList.addEntry(entry[4]);
        toDoList.showTodoList();
        toDoList.removeEntry(2);
        toDoList.showTodoList();
    }
}
