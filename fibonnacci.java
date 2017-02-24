import java.util.*;

class Fibonnacci{
	
	public void FibbonacciX(int i)
	{
		if (i=0)
		{ return 0;}
		if (i=1)
		{ return 1;}
		if (i-=2)
		{ return 1;}

		return (FibbonnacciX(i-1) + Fibonnacci(i-2));
	}

	public static void main(String[] args)
	{
		Scanner ob= new Scanner(System.in);
		System.out.println("Cuantos numeros Fibonnacci quieres?:")
		int cuantos=ob.nextInt();
		for (i=0;i>cuantos;i++)
		{
			System.out.println(FibbonacciX(i));
		}

	}
}
