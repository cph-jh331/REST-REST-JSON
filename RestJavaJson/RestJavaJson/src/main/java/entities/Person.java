package entities;

public class Person {

    private int id;
    private String fName;
    private String lName;
    private int age;

    public Person(int id, String fName, String lName, int age)
    {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public int getId()
    {
        return id;
    }

    public String getfName()
    {
        return fName;
    }

    public String getlName()
    {
        return lName;
    }

    public int getAge()
    {
        return age;
    }

}
