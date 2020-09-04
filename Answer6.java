import java.util.Scanner;

public class Answer6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        while(number!=1)
        {
            System.out.print(number + "  ");
            if(number%2 == 0)
            {
                number/=2;
            }
            else{
                number*=3;
                number++;
            }
        }

        System.out.println(1);
    }
}
