//lamda expression will not create a class file
//This is an advantage

@FunctionalInterface
interface Test6
{
    void show(int i);
}

public class PLamda
{
    public static void main(String args[])
    {
        //Compiler will understand what I am trying to intanciate
        //We can shorten our code by removing curly brckets
        //If we have only one variable then we don't need brackets() and int
        Test6 obj = i -> System.out.println("in show" + i);
        obj.show(5);
    }   
}
