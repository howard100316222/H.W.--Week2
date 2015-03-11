import java.io.*;
import java.util.Scanner;
import java.text.*;

class Circle
{
	double r;
	Circle(double r)//半徑
	{
		this.r = r;
	}
	double Full()
	{
		return 3.14 * r * r;
	}
	double Arc(double degree)  //弧長
	{
		return 3.14 * 2 * r * (degree / 360);
	}
	double Pie(double degree)  //面積
	{
		return 3.14 * r * r * (degree / 360);
	}
	public static void main(String[] args)
	{
		//NumberFormat nf = NumberFormat.getInstance(); 
		//nf.setMaximumFractionDigits( 2 );
		double temp;
		double degree=0;
		int opt, count=0 ,temp2= 0;
		Circle[] c = new Circle[50];
		Scanner scanner = new Scanner(System.in);
		while(true)
		{
			System.out.println("選擇要求:1.)輸入邊長並新增圓形	2.)輸入編號、角度並算出弧長、面積 -1.)離開:");
			opt = scanner.nextInt();
			if(opt==1)
			{
					System.out.println("請輸入半徑:");
					temp = scanner.nextDouble();
					if(temp<=0)
					{
						System.out.println("輸入錯誤，半徑不可小於等於0!!\n");
						continue;
					}
					else
					{
						c[count] = new Circle(temp);
						System.out.println("圓面積:"+c[count].Full());
						count++;
					}
			}
			else if(opt==2)
			{
				System.out.println("請輸入編號(小於"+count+")");
				temp2 = scanner.nextInt();
				System.out.println("請輸入角度");
				degree = scanner.nextDouble();
				
				System.out.println("弧度:" + c[temp2-1].Arc(degree) + "\n面積:" + c[temp2-1].Pie(degree));
			}
			else if(opt==-1)
			{
				System.out.println("感謝使用!!\n");
				break;
			}
			else
			{
				System.out.println("選項錯誤!!\n");
				continue;
			}
		}
	}
}
