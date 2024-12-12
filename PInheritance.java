
//Calc.java file created
//CalcAdv.java file created
//Can be run with .class file also with .java files
//Calc() is Super class & CalcAdv() called as sub class, to inherit "Calc()"" we called a parameter called extends

public class PInheritance
{
    public static void main(String a[])
    {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.sub(9,4);
        int r3 = obj.div(10,4);
        int r4 = obj.multi(10,4);
        // For multi-inheritance we need to extends VeryAdvCalc with CalcAdv, and in CalcAdv with Calc 
        double r5 = obj.power(2,4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
            
    }

}
