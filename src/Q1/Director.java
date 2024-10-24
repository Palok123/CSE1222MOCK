package Q1;

public class Director extends SuperVisor{
    public Director(String name,double wage, String division)
    {
        super(name,wage,division);
    }
    @Override
    public  String toString()
    {
        return "Director: Name = "+getName()+", Division = "+ getDivision()+ ",Wage = "+getWage();
    }

}
