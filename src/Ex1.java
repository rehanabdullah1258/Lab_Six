public class Ex1 {
    public static void main(String[] args) {
        Ex1_investment x=new Ex1_investment(10000,10);
        x.waitforbalanc(1000000);
        System.out.println("the number of years: "+x.getyear());
    }
}
