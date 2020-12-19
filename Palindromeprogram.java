import java.util.Scanner;
public class Palindromeprogram
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int num,temp;
		int rem,rev=0;
		System.out.print("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
			temp=num;            //store the num  in a temp variable
			 while(num!=0)
			 {
				rem=num%10;
				rev=(rev*10)+rem;
				num=num/10;
			 }
			
			 if(temp==rev)
			 {
				 System.out.println("Number is a palindrome");
			 }
			 else
			 {
				 System.out.println("Number is not a palindrome");
			 }
	}
	

}
