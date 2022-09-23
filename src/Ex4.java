import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String y;
        Scanner in=new Scanner(System.in);
        y=in.next();
        for(int i=y.length()-1;i>=0;i--)
        {
            System.out.print(y.charAt(i));
        }
    }
}
