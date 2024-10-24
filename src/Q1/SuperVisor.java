package Q1;

public class SuperVisor extends Worker{
    private String division;
    public SuperVisor(String name,double wage,String division)
    {
        super(name,wage);
        this.division = division;
    }
    public String getDivision()
    {
        return division;
    }
    @Override
    public  String toString()
    {
        return "SuperVisor: Name= "+getName()+", Division = "+division+", wage = "+getWage();
    }

}
