class Alien
{
    //By adding private others can't access the data of this instances
    private int age;
    private String name;

    //Need to access into this instances through below methods getAge/setAge which is in same class
    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }

    public void setAge(int age, Alien obj) //Accepting the value here which passed from main method
    {
        Alien obj1 = obj;
        obj1.age = age; // So we assigned same object which stored in heap memory, please check pic "PThis.png"
    }

    // Why we are using This keyword?
    //1. From main class we don't have to do call & pass same variable(obj) two times "obj.setAge(10, obj);""
    //2. At subclass method of setAge() by default parameter will take as instance variable instead of local, we don't have to accept i.e. ", Alien obj"
    //3. Under subclass method by mentioning "this" keyword we are indentifying the variable as instance variable
    public void setName(String name) 
    {
        this.name = name;
    }

    
}

public class PThis 
{
    public static void main(String a[])
    {
        Alien obj = new Alien();
        //We can set the value with class public methods i.e. setAge/setName
        obj.setAge(10, obj); //Passing the object from here & later will accept from class(so no new object should create in heap memory)
        obj.setName("Avisek");

        System.out.println(obj.getName() + ":" + obj.getAge());
        
    }
}
