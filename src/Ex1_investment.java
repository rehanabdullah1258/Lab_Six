public class Ex1_investment {
    private double balanc,rat;
    private int year;
    public Ex1_investment(double balanc, double rat)
    {
        this.balanc=balanc;
        this.rat=rat;
        year=0;
    }
    public double getBalanc()
    {return balanc;}
    public double getyear()
    {return year;}
    public void waitforbalanc(double terget)
    {
        while (balanc<terget) {

            double interest=balanc/+rat;
            balanc=balanc+interest;
            year++;
        }

    }
}
