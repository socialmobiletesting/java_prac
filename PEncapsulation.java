class Human
{
    //By adding private others can't access the data of this instances
    private int age;
    private String name;

    //Need to access into this instances through below methods getAge/setAge which is in same class
    public int getAge()
    {
        return age;
    }

    //Storing the values by defining variable a
    public void setAge(int a)
    {
        age = a;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
}

public class PEncapsulation
{
    public static void main(String a[])
    {
        Human obj = new Human();
        //We can set the value with class public methods i.e. setAge/setName
        obj.setAge(10);
        obj.setName("Avisek");

        System.out.println(obj.getName() + ":" + obj.getAge());
        
    }
    
}
