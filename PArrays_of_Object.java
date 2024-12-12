class Student
{
    //Defining instance variables, which we call later from this class
    String name;
    int rollno;
    int marks;

}


public class PArrays_of_Object
{
    public static void main(String a[])
    {
        //Defining objects of Array which will be assigned later
        Student s1 = new Student();
        s1.name = "Naven";
        s1.rollno = 26;
        s1.marks = 67;

        Student s2 = new Student();
        s2.name = "Kiran";
        s2.rollno = 45;
        s2.marks = 78;

        Student s3 = new Student();
        s3.name = "Rahul";
        s3.rollno = 12;
        s3.marks = 68;

        // System.out.println(s3.name + " : " + s3.marks);

        Student students[] = new Student[3]; // Here "students" define as full Array variable

        //Objects are assigned to Arrays
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for (int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].name + " : " + students[i].marks); //Each loop relavent occurance of object will be assign to variable i & respectivly will be printed
        // }

        //Enhanced for loop
        for (Student n : students)
        {
            System.out.println(n.name + " : " + n.rollno);
        }

    }
    
}
