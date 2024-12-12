//Annotation can be worked in
//Method level
//Variable level
//Class level

class Test1
{
    public void ShowTheDataWhichBelongsToThisData()
    {
        System.out.println("In Test1 Show");
    }
}

class Test2 extends Test1
{
    /***
     * With the help of overide we can identify below method is not available
     * for overide, may be because of spelling mistake/unavailable
    */
    @Override
    public void ShowTheDataWhichBelongToThisData() //Error is coming because of naming mismatch
    {
        System.out.println("In Test2 Show");
    }
    
}


public class PWhat_is_Annotation 
{
    public static void main(String a[])
    {
        Test2 obj = new Test2();
        obj.ShowTheDataWhichBelongsToThisData();
    }

}
