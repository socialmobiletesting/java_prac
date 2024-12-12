
public class PWrapper_class
{
    public static void main(String a[])
    {
        
        int num = 7;
        //We are using Primitive value int alternative Integer as class below
        // Integer num1 = new Integer(10);

        //Taking a primitive value and store into a object, this method is called boxing
        // Integer num1 = new Integer(num);
        Integer num1 = num; //Autoboxing, behind the scene object has been assigned
    
        int num2 = num1.intValue(); //Unboxing, getting a value from object type to primitive type

        System.out.println(num2);
        
        String str = "12";
        //Type casting str into int 
        //Integer.parse will help to type casting String into Integer
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }

}
