import java.io.*;
import java.util.Scanner;

class Float
{
	public static void main(String[] args)
	{
		float x, y;
		int opt;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("請輸入2個浮點數 : ");
		x = Scanner.nextFloat();
		y = Scanner.nextFloat();
		System.out.println("請選擇運算子: 1.)+ 2.)- 3.)* 4.)/ : ");
		opt = Scanner.nextInt();
			if(opt==1)
			{
				System.out.println(x + "+" + y + "=" + (x + y));
			}
			else if(opt==2)
			{
				System.out.println(x + "-" + y + "=" + (x - y));
			}
			else if(opt==3)
			{
				System.out.println(x + "*" + y + "=" + (x * y));
			}
			else if(opt==4){
				if(y == 0)
				{
					System.out.println("除數不可為0!\n");
				}
				else
				{
					System.out.println(x + "/" + y + "=" + (x / y));
				}
			}
			else if(opt!=1||opt!=2||opt!=3||opt!=4)
			{
				System.out.println("輸入錯誤!!\n");
			}
		
	}
}