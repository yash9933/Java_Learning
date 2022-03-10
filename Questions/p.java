import java.util.*;

class p{
	public static void main(String []args)
	{
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		isArmstrong(num);
	}
	
	static void isArmstrong(int num){
		int tempNum = num;
		int cubeSum = 0;
		
		while(tempNum>0)
		{
			int unit = tempNum%10;
			cubeSum += (unit*unit*unit);
			tempNum/=10;
		}
		
		if(cubeSum == num)
		{
			System.out.println("The entered number is an armstrong number.");
		}
		else
		{
			System.out.println("The entered number is not an armstrong number.");
		}
	}
}