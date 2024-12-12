package PAccess_Modifiers;
import PAccess_Modifiers.others.*; //Because * having file access not folder

class Test2 extends Test1Sub{
    public void gettingProtectedValue(){
        System.out.println(marks);
    }
}

public class Test1 {
    public static void main(String[] args) {
        //We can't access protected with below code directly
        //Protected can be get on same class where protected defined
        //Or you can write subclss and method inside e.g. "Test2" above
        //to get the protected instance value
        Test1Sub obj = new Test1Sub();
        System.out.println(obj.marks);

        //Here we are fetching the protected value
        Test2 obj2 = new Test2();
        obj2.gettingProtectedValue();

        //This is normal public variable
        Test2Sub obj1 = new Test2Sub();
        System.out.println(obj1.totalMarks);
    }
}
