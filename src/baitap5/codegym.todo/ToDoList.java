package baitap5.codegym.todo;

public class ToDoList {
    private Entry[] list;
    private int length = 0;

    public ToDoList() {
    }

    public ToDoList(Entry[] list, int length) {
        this.list = list;
        this.length = length;
    }

    public void showTodoList() {
        for (int i = 0; i < length; i++) {
            System.out.println("\t"+i+" - "+list[i].getNotes());
        }
    }

    public void sortList() {

    }

    public boolean removeEntry(int id) {
        return false;
    }

    public void getEntryByID(int id) {

    }

    public void addEntry(Entry entry) {

    }
}
