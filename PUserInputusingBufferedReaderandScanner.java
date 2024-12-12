import java.util.Scanner;

public class PUserInputusingBufferedReaderandScanner {
    public static void main(String[] args) {
        
        System.out.println("Enter a number: ");
        // taking input from user inside a file
        Scanner scanner = new Scanner(System.in);
        // opening the file
        int num = scanner.nextInt();
        System.out.println(num);
        scanner.close(); // closing the file


    }
}
