public class VeryAdvCalc extends CalcAdv
{
    public double power(int n1, int n2)
    {
        return Math.pow(n1, n2);
    }
}

// For multi-inheritance we need to extends VeryAdvCalc with CalcAdv, and in CalcAdv with Calc
