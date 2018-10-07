package baitap5.codegym.test;

import baitap5.codegym.todo.Entry;
import baitap5.codegym.todo.ToDoList;

public class TestTodo {
    public static void main(String[] args) {
        Entry[] entry = {new Entry(0, "5h30 Dậy tập thể dục"),
                new Entry(0, "6h30 Ăn sáng"),
                new Entry(1, "7h Đi làm"),
                new Entry(1, "8h vào chỗ làm")
        };
        System.out.println("*Có tổng cộng " + Entry.getCount() + " tác vụ");
        ToDoList toDoList = new ToDoList(entry, Entry.getCount());
        toDoList.showTodoList();
    }
}
