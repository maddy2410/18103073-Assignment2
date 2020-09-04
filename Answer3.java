import java.util.*;

public  class Answer3
{

	public static void sortStr(char [] c)
	{
		int l = c.length;
		//Bubble Sort
		for(int i=0;i<l-1;i++) 
            for(int j=i+1;j<l;j++) 
                if(c[i]>c[j])
                {
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            
    }

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		sc.close();
		char[] c = s.toCharArray();

		sortStr(c);

		s = new String(c);
		
		System.out.println("Sorted String: \n"+s);	

	}
} 