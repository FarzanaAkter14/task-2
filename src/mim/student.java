package mim;

public class student {

    String name;
    int id;
    static String universityName= "LU";
    student()
    {
        System.out.println("Default constructor");
    }
    student (String name)
    {
        this.name = name;
        System.out.println("Name is : " + name);
    }
    student (int id)
    {
        this.id = id;
        System.out.println("Id : " + id);
    }
    void display()
    {
        System.out.println("University name : "+ universityName);
    }
}
