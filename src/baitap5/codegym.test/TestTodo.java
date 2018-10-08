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
        int n=0;
        entry[n] = new Entry(0,"5h30 Dậy tập thể dục");
        toDoList.addEntry(entry[n]);
        n++;

        entry[n] = new Entry(1,"6h30 Ăn sáng");
        toDoList.addEntry(entry[n]);
        n++;

        entry[n] = new Entry(0,"7h Đi học");
        toDoList.addEntry(entry[n]);
        n++;

        entry[n] = new Entry(1,"8h vào chỗ làm");
        toDoList.addEntry(entry[n]);
        n++;

        entry[n] = new Entry(0,"10h tập thể dục giữa giờ");
        toDoList.addEntry(entry[n]);
        n++;

        toDoList.showTodoList();
        System.out.println();
        toDoList.sortList();
        toDoList.showTodoList();
        toDoList.removeEntry(2);
        toDoList.showTodoList();
    }
}
