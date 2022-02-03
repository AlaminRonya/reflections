package main.model;

public class Student {
    private long id=1;
    private String name="Rony";
    private int rollNo=16;

    public Student() {
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(long id, String name, int rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    private void show(){
        System.out.println("Private Method");
    }
}
