import java.util.Scanner;

public class Ex2 {
   private int number;
   private int sumEven;
   private int sum;
   private int sumOdd;
   private int numberin;
   private int numberone,numbertwo,numberthree,numbertfour;

   public Ex2()
   {
      number=0;
      sumEven=0;
      sumOdd=0;
   }
    public void sumEven(int x)
    {

            while (x<=100)
            {
                if((x%2)==0)
                {
                    sumEven=sumEven+x;
                }
                x++;
            }
            number=x;


    }
    Scanner input=new Scanner(System.in);

    public Scanner getInput() {
        return input;
    }

    public void sumodd()
    {
        System.out.println("please inter the number for sum odd numbers: ");
        numberin=input.nextInt();
        while (numberin<=100)
        {
            if((numberin%2)==1)
            {
                sumOdd=sumOdd+numberin;
            }
            numberin++;
        }


    }
    public void sum() {
        System.out.println("please inter four number for sum odd numbers: ");
        numberone = input.nextInt();
        numbertwo = input.nextInt();
        numberthree = input.nextInt();
        numbertfour = input.nextInt();
       if((numberone)%2==1)
            sum= sum + numberone;
       if(numbertwo%2==1)
           sum=sum+numbertwo;
        if(numberthree%2==1)
            sum=sum+numberthree;
        if(numbertfour%2==1)
            sum=sum+numbertfour;

    }
    public int getsumEven()
    {return sumEven;}
    public int getsumOdd()
    {return sumOdd;}
    public int getsum()
    {
        return sum;
    }
}
