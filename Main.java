
import java.lang.*;
import java.util.*;

class PatternX
{
	void Display(int iNo1, int iNo2)
	{
		if(iNo1 < 0)
		{
			iNo1 = -iNo1;
		}

		if(iNo2 < 0)
		{
			iNo2 = -iNo2;
		}

		if(iNo1 != 0 && iNo2 != 0)
		{
			for(int i = 1; i <= iNo1; i++)
			{
				for(int j = 1; j <= iNo2; j++)
				{
					if(j%2 == 0)
					{
						System.out.print("#\t");
					}
					else
					{
						System.out.print("*\t");
					}
				}
				System.out.println();
			}
		}
	}
}

class Main
{
	public static void main(String[] args)throws Exception
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter Count of Rows and Columns");
		int iValue1 = sobj.nextInt();
		int iValue2 = sobj.nextInt();

		PatternX pobj = new PatternX();
		pobj.Display(iValue1,iValue2);	
	}
}