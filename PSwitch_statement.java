class PSwitch_statement 
{
    public static void main(String args[])
    {
        int n = 6;
        String result = "";

        // switch(n){
        result = switch(n){
        // case 1:
        //     System.out.println("Monday");
        //     break;
        // case 2:
        //     System.out.println("Tuesday");
        //     break;
        // case 3:
        //     System.out.println("Wednesday");
        //     break;
        // case 4:
        //     System.out.println("Thursday");
        //     break;
        // case 5:
        //     System.out.println("Friday");
        //     break;
        // case 6:
        //     System.out.println("Saturday");
        //     break;
        // case 7:
        //     System.out.println("Sunday");
        
        /// New changes in java for Switch statement
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wednesday");
        // case 4 -> System.out.println("Thursday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("Saturday");
        // default -> System.out.println("Sunday");

        /// New changes of expressions, defined "String result = "";" to get output /expression of "result = switch(n)"
        case 1 -> "Monday";
        case 2 -> "Tuesday";
        case 3 -> "Wednesday";
        case 4 -> "Thursday";
        case 5 -> "Friday";
        case 6 -> "Saturday";
        default -> "Sunday";
        }; // As these became expression now so need add ; at last
        System.out.println(result);
    
    }
    
}
