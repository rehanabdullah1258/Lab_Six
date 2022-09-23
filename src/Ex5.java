import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        String y;
        int sum=0;
        int k=0;
        int a,e,u,o,i;
        Scanner in=new Scanner(System.in);
        y=in.next();
        for(int j=0;j<y.length();j++)
        {
       if ((y.charAt(j)=='a')||(y.charAt(j)=='i')||(y.charAt(j)=='u')||(y.charAt(j)=='e')||(y.charAt(j)=='o'))
           sum=sum+1;
       }
        System.out.println(sum);
    }
}
