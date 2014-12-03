import java.util.Scanner;

public class convert 
{
	public static void main(String[] args)
	{
		int at = 14;
		System.out.print("mode 1 or 2");
		while(at == 14)
		{
			
		Scanner mode = new Scanner(System.in);
		int choice = mode.nextInt();
		if(choice == 1)
		{
			Scanner temperature = new Scanner(System.in);
			System.out.println("Convertir celsius -> Fahreneit");
			double temp = temperature.nextDouble();
			System.out.print(temp + " est égal à  " + 9/5 * temp + 32 + " degrés Fahreneit\n");
		}
		else if(choice == 2)
		{
			Scanner tempa = new Scanner(System.in);
			System.out.print("Convertir Fahreneit -> Celsius");
			double temp = tempa.nextDouble();
			System.out.print(temp + " degrés Fahreneit = " + (temp - 32) * 5 / 9);
		}
		else
		{
			System.out.print("Entrez un mode correct ! ");
		}
		
		} // FIN DE BOUCLE
	}
}
