import DataBase1.Status;

enum Status
{
    Running, Walking, Swiming, Jumping;
}


public class PEnum_if_switch
{
    public static void main (String args[])
    {
        Status var = Status.Swiming;

        // if(var == Status.Running)
        //     System.out.println("All good!");
        // else if(var == Status.Swiming)
        //     System.out.println("All are good!");
        // else if(var == Status.Jumping)
        //     System.out.println("All super good!");
        // else 
        //     System.out.println("All ok!");


        //Using switch instead of if-else
        switch (var) {
            case Running:
                System.out.println("All good!");                
                break;

            case Swiming:
                System.out.println("All are good!");                
                break;

            case Jumping:
                System.out.println("All super good!");                
                break;
        
            default:
                System.out.println("All ok!");
                break;
        }
        
    }    
}
