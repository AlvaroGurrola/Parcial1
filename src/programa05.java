import java.util.Scanner;

public class programa05 {
	
//Programa que pide una calificacion y te dice si estas aprobado o reprobado
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		double cal=0;
				
	System.out.println("Ingrese la calificacion del examen");
	cal=leer.nextDouble();
	
	if (cal>=80)
	{
		System.out.println("Estas aprobado");
		
	}
	else
	{
		System.out.println("Estas reprobado");	
	}
	
	}

}