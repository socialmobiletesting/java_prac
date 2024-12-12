class i
{
    public void Test2()
    {
        System.out.println("in Test2 show");
    }
}

//For multiple call of below class is fine for define
//But if I want to call for once, then can be call from obj

// class j extends i
// {
//     public void Test2()
//     {
//         System.out.println("in Test3 show");
//     }
// }


public class PAnonymous_Inner_class 
{
    public static void main(String args[])
    {
        i obj = new i() //Define the method of class j here, instead of creation
        {
            public void Test2()
                {
                    System.out.println("in main Test3 show");
                };
        };
        obj.Test2();
    }
}
//As above is inner class which doesn't have a name that's why
//PAnonymous$1.class created, &1 means inner class which doesn't have name
