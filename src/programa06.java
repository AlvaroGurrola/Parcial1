import java.util.Scanner;

public class programa06 {
//Programa que te dice si un numero es para o es impar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, residuo = 0;
Scanner leer = new Scanner(System.in);
System.out.println("Ingrese un numero entero");
num = leer.nextInt();
residuo=(num/2);
	
if (residuo==0)
{
	System.out.println("El numero es " + num + " y es par");
	
}
else
{
	System.out.println("El numero es " + num + " y es impar");
}
	}
	
}

