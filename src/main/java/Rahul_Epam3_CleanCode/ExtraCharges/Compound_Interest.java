package Rahul_Epam3_CleanCode.ExtraCharges;

public class Compound_Interest extends Interest {
public Compound_Interest(int principal, int rate, int time)
{
    super(principal, time, rate);
}
public double Calculate_CompountI()
{
    return principal*Math.pow((1+rate/100.0),time);
}
}
