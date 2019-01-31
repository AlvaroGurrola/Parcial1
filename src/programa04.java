import java.util.Scanner;

public class programa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		int ed=0;
				
	System.out.println("Ingrese su edad");
	ed=leer.nextInt();
	
	if (ed>=80)
	{
		System.out.println("Eres mayor de edad");
		
	}
	else
	{
		System.out.println("Eres menor de edad");	
	}
	
	}

}