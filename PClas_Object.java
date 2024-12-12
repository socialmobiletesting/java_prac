class calculator
{
    int a; 
    // Instance variable can be define inside class like "int a"
    // Methods name like "add()"" can be define
    
    //Below in n1 & n2 (which is local variable) we are accepting values from PClass_Object
    // public int add()
    public int add(int n1, int n2)
    {
        // System.out.println("in add");
        // return 0;
        int r = n1 + n2;
        return r;
    }
}

//***Start from here
public class PClas_Object
{
    public static void main(String args[])
    {
        int x = 5;
        int y = 6;
        
        //Define variable "calculator calc"
        //Define object "new calculator"

        calculator calc = new calculator();
        
        //"calculator" we are calling as class which is a ***type already define "public int add" 
        //"calc" we define variable, "new" we are consuming new space in JVM, 
        //"calculator() will define how much space in JVM can be consumed"

        // calc.add(); //Calling the varible "in add"
        
        int result = calc.add(x,y); // If I want to print the return result, and assigning the value
        System.out.println(result);
        
        // System.out.println(x);
    }
    
}
