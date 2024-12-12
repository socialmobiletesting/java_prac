public class PString_Buffer_Builder {
    public static void main(String a[])
    {
        // StringBuffer name = new StringBuffer(); //Capacity() value will be 16 bcz there is not much memory we used
        StringBuffer name = new StringBuffer("Avisek"); // Capacity() value will be 22 bcz memory we consumed by storing memory "Avisek" which is 6 caracter so 16+6=22
        System.out.println(name.capacity());
        System.out.println(name.length()); // Will give length 6
        name.append(" Saha");
        System.out.println(name); // Will print Avisek Saha
        name.insert(0, "Java"); // To insert "java" at 0th location

        // String x = name.toString(); // To convert from StringBuffer to String

        System.out.println(name);
    }
}
