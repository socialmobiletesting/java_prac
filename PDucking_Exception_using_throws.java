//throws keyword will help to ducking the exception in method level
//So the orginal method main() will take care of exception at line 37
class A_ducking{
    
    public void show() throws ClassNotFoundException{
        
        //Lets below block open inside class &
        //method will handle the exception
        Class.forName("null");

        // try
        // {
        //     Class.forName("null");    
        // }
        // catch (ClassNotFoundException e)
        // {
        //     System.out.println("Not found :" + e);
        // }    
    }
     
}


public class PDucking_Exception_using_throws {

    static{
        System.out.println("Class Loaded");
    }

    public static void main(String args[]){

        
        A_ducking obj = new A_ducking();
        // obj.show();
        try{
            obj.show();  
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    
}
