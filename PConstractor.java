class Animal
{
    //By adding private others can't access the data of this instances
    private int age;
    private String name;

    //Creating an constructor
    public Animal() // Constructor should created with actual class name "Animal()"
    {
        //Assigned value as local variable
        age = 12;
        name = "Avisek";
        // System.out.println("Inside constructor");
    }


    //Creating an Parameterized constructor
    public Animal(int a, String b)
    {
        age = a;
        name = b;
    }

    //Need to access into this instances through below methods getAge/setAge which is in same class
    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }

    // public void setAge(int age, Animal obj) //Accepting the value here which passed from main method
    // {
    //     Animal obj1 = obj;
    //     obj1.age = age; // So we assigned same object which stored in heap memory, please check pic "PThis.png"
    // }

    // public void setName(String name) 
    // {
    //     this.name = name;
    // }

    
}


public class PConstractor 
{
    
    public static void main(String a[])
    {
        // Animal obj = new Animal(12, "Animesh");
        Animal obj1 = new Animal(); // If you create two objects then two times constructor will be called
        

        // System.out.println(obj.getName() + ":" + obj.getAge()); //Parameterized
        System.out.println(obj1.getName() + ":" + obj1.getAge()); //Default
        
        
    }
}
