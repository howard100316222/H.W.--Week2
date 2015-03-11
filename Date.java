import java.io.*;
import java.util.Scanner;

class Date
{
	int year, month, day;
	Date(int year, int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}
	void Test()
	{
		if((year <= 0) || (month < 1 || month > 12) || (day < 1 || day > 31))
		{
			System.out.println("輸入日期資料有誤!!\n");
		}
		else
		{
			if(month == 2)
			{
				if((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && day > 29)
				{
					System.out.println("輸入日期資料有誤!!\n");
				}
				else if((year % 400 != 0 && (year % 4 != 0 || year % 100 == 0)) && day > 28)
				{
					System.out.println("輸入日期資料有誤!!\n");
				}
				else
				{
					System.out.println("正確日期!");
					System.out.println("您輸入的日期為" + year + "年" + month + "月" + day + "日\n");
				}
			}
			else if(month == 4 || month == 6 || month == 9 || month == 11)
			{
				if(day > 30)
				{
					System.out.println("輸入日期資料有誤!!\n");
				}
				else
				{
					System.out.println("正確日期!");
					System.out.println("您輸入的日期為" + year + "年" + month + "月" + day + "日\n");
				}
			}
			else
			{
				System.out.println("正確日期!");
				System.out.println("您輸入的日期為" + year + "年" + month + "月" + day + "日\n");
			}

		}
	}
	public static void main(String[] args)
	{
		int Y, M, D;
		Scanner scanner = new Scanner(System.in);
		try
		{
			System.out.println("請輸入年/月/日: ");
			Y = scanner.nextInt();
			M = scanner.nextInt();
			D = scanner.nextInt();
			Date date = new Date(Y, M, D);
			date.Test();
		}
		catch(Exception e)
		{
			System.out.println("error : " + e);
		}
		
	}
}