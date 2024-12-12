class Amiya
{
    //By adding private others can't access the data of this instances
    private int age;
    private String name;

    //Creating an default constructor
    public Amiya() {
    }
    
    //Creating a constructor with help of IDE > Right click > Source Action > Generate Constructor

    public Amiya(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //Creating another constructor
    public Amiya(String name) {
        // this.age = 24;
        this.name = name;
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

    
}



public class PParameterized_constructor 
{
    public static void main(String a[])
    {
        Amiya obj = new Amiya(12, "Animesh");
        Amiya obj1 = new Amiya("Satish"); // If you create two objects then two times constructor will be called
        

        System.out.println(obj.getName() + ":" + obj.getAge());
        System.out.println(obj1.getName() + ":" + obj1.getAge());
        
    }
}
