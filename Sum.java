import java.io.*;

public class Sum
{
	public static void main(String[] args)
	{
		int H1=4;
		int H2=13;
		int M1=23;
		int M2=54;
		int S1=45;
		int S2=23;
		int Ssum;
		int Msum;
		int Hsum;
		int Sum;
		System.out.println("開始時間:4點23分45秒\n");
		System.out.println("結束時間:13點54分23秒\n");
		Ssum = S2-S1;
		Msum = (M2-M1)*60;
		Hsum = (H2-H1)*360;
		Sum = Ssum+Msum+Hsum;
		
		System.out.println("共經歷時間(秒):"+Sum);
	}	
}