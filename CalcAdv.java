//Single level inheritance
public class CalcAdv extends Calc
{
    public int multi(int n1, int n2)
    {
        return n1 * n2;
    }

    public int div(int n1, int n2)
    {
        return n1 / n2;
    }
}

//Calc() is Super class & CalcAdv() called as sub class, to inherit "Calc()"" we called a parameter called extends
