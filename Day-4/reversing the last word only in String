import java.util.Arrays;
import java.util.Scanner;
public class ReverseLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s="Broken laptop is given";
		String str[]=s.split(" ");//to handle the single space
//		String str[]=s.split(" +");//to handle the multiple spaces
		System.out.println(Arrays.toString(str));
		System.out.println(str[str.length-1]);
//		System.out.println(str[str.length-1].length-1);
		for(int i=0;i<str.length-1;i++)
		{
			System.out.print(str[i]+" ");
		}
		for(int i=str[str.length-1].length()-1;i>=0;i--)
		{
			System.out.print(str[str.length-1].charAt(i));
		}

	}

}
