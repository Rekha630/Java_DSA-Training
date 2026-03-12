import java.util.Scanner;
import java.util.*;
public class NprimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int num=2;
		int count=0;
		bye:
			while(true)
			{
				boolean is_Prime=true;
				for(int i=2;i<=Math.sqrt(num);i++)
				{
					if(num%i==0)
					{
						is_Prime=false;
						break;
					}
				}
				if(is_Prime)
				{
					System.out.print(num+" ");
				
				count++;
				if(count>=N)
				{
					break bye;
				}
				}
				num++;
			}

	}

}
