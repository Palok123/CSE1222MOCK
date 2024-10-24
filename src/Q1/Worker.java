package Q1;

public class Worker {
    private String name;
    private double wage;
    public Worker(String name,double wage)
    {
        this.name = name;
        this.wage = wage;
    }
    public String getName()
    {
        return name;
    }
    public double getWage()
    {
        return wage;
    }
    @Override
    public String toString()
    {
        return "Worker: Name= "+name+", wage="+ wage;
    }

}
