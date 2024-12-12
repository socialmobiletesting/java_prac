public class PString 
{
    public static void main(String a[])
    {
        String name = new String("Avisek"); // String is an class actually
        // System.out.println(name.hashCode());
        name = name + "Saha"; // We can create new data with primary variable where merging with two String new memory is created at String pool, check screenshot at PString.png
        // String name1 = "Animesh";

        String s1 = "Avisek";
        String s2 = "Avisek";
        System.out.println(s1 == s2); // Both s1 & s2 will save in JVM > Heap memory > String pool at same memory
        // System.out.println(s1.hashCode()); // Both hashCode will be same
        // System.out.println(s2.hashCode()); // Both hashCode will be same


        // System.out.println(name.hashCode());
        // System.out.println("Hi" + name1);
    }
}
