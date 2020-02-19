package Rahul_Epam3_CleanCode.ExtraCharges;

public class Simple_Interest extends Interest {
    public Simple_Interest(int principal, int rate, int time)
    {
      super(principal, time, rate);
    }
    public double calculate_simpleInterest()
    {
        return (principal*time*rate)/100.0;
    }
}
