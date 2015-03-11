import java.io.*;
import java.util.Scanner;

class InsertYear
{
	public static void main(String[] args)
	{
		int year, count = 0;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("請輸入西元年(A.D.) : ");
		year = Scanner.nextInt();
		System.out.println(year+"年前的所有閏年為:");
		for(int i = 1; i < year; i++)
		{
			if((i % 4 == 0 && i % 100 != 0)||(i % 400 == 0))
			{
				System.out.print(i + "	");
				count++;
			}
			if((count % 10) == 0)
			{
				System.out.println("");
				count = 0;
			}
		}
	}
}