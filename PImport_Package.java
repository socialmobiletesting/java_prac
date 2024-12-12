import java.lang.*; //This package imported by default
import DataBase.Bike;
import DataBase.*; //Instead of two different folder name we can give <folder name>."*" which will pick up all files not all the folders
import DataBase.DB_1.BikeAdv;
import com.mvnrepository.mongoDB.*; //Used for import packages from Server

public class PImport_Package
{
    public static void main(String args[])
    {
        Bike obj = new Bike();
        // BikeAdv obj1 = new BikeAdv();

        int r1 = obj.add(4, 3);
        System.out.println(r1);
    
    }
}
