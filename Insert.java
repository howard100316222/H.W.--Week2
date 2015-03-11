import java.util.*;
import java.io.*;
public class Insert
{
	public static void main(String[] args)
	{
		String name;
		String string1;
		int[] birth = new int[3];
		int year;
		Scanner scanner = new Scanner(System.in); 			
		System.out.println("請輸入您的姓名:");
		name = scanner.next(); 					
		
		System.out.println("請分別輸入您的生日:");
		System.out.println("\n西元年:");
		birth[0] = scanner.nextInt();
		System.out.println("\n月:");
		birth[1] = scanner.nextInt();
		System.out.println("\n日:");
		birth[2] = scanner.nextInt();

		System.out.println("姓名:"+name);
		System.out.println("生日(民國/月/日):"+(birth[0] - 1911) +"/"+ birth[1] + "/" + birth[2] );


	}	
}