import java.io.*;
import java.util.Scanner;

class Student
{
	public static void main(String[] args)
	{
		int opt, count = 0;
		int number;
		String[] name = new String[50];
		int[] grade = new int[50];
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("請輸入 1)新增學生資料 2)顯示全部學生資料 3)查詢特定學生資料  -1)離開 : ");
			opt = scanner.nextInt();

				if(opt==1)
				{
					System.out.println("請輸入學生姓名 : ");
					name[count] = scanner.next();
					System.out.println("請輸入學生成績 : ");
					grade[count] = Integer.parseInt(scanner.next());
					count++;
				}
				else if(opt==2)
				{
					System.out.println("編號\t姓名\t成績\n");
					for(int i = 1; i <= count; i++)
					{
						System.out.println(i + "\t" + name[i-1] + "\t" + grade[i-1]);
					}
				}
				else if(opt==3)
				{
					System.out.println("請輸入編號 : ");
					number = scanner.nextInt();
					if(number > 0 && number <= count)
					{
						System.out.println("編號\t姓名\t成績:\n");
						System.out.println(number + "\t" + name[number - 1] + "\t" + grade[number - 1]);
					}
					else
					{
						System.out.println("此編號查無資料!");
					}
				}
				else if(opt==-1)
				{
					break;
				}
				else if(opt!=-1||opt!=1||opt!=2||opt!=3)
				{
					System.out.println("查無此選項!");
				}
				
		}
	}
}