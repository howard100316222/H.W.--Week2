import java.text.DecimalFormat;
import java.util.*;


public class Array
{
	public static void main(String[] args)
	{
		int[] number={1,2,3,4,5,6,7,8,9};
		int sum=0;
		double avg=0.00;
		for(int i=0;i<number.length;i++)
		{
			sum += number[i];
		}
		System.out.println("個數:"+number.length);
		System.out.println("總和:"+sum);
		avg = sum/number.length;
		System.out.println("平均:"+avg);
	}
}