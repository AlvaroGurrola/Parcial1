import java.util.Scanner;

public class programa09 {
//Programa que convierte pulgadas a centimetros, pies a centimetros y pies a pulgadas
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pulg,pie, op;
		double cm;
Scanner leer = new Scanner(System.in);
System.out.println("Ingresa un numero segun la operacion que deseas realizar");

	System.out.println("1: Pulgadas a centimetros");
	System.out.println("2: Pies a centimetros");
	System.out.println("3: Pies a pulgadas");
	op = leer.nextInt();
	
	switch(op) {
	
	case 1:
		System.out.println("Ingrese las pulgadas para convertirlas a centimetros");
		pulg= leer.nextInt();
		cm=pulg/0.39370;
		System.out.println("El resultado de la conversion es "+cm);
		break;
		
	case 2:
		System.out.println("Ingrese los pies para convertirlos en centimetros ");
		pie=leer.nextInt();
		cm=pie/0.032808;
		System.out.println("El resultado de la conversion es: "+cm);
		break;
		
	case 3:
		System.out.println("Ingrese los pies para convertirlos a pulgadas");
		pie=leer.nextInt();
		cm=pie*12;
		System.out.println("El resultado de la conversion es: "+ cm);
		break;
		
	default:
		System.out.println("Ingrese un valor que este en los rangos que se mestran al principio (1-4)");
	}
	
	}

}