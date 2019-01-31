import java.util.Scanner;

public class programa08 {
//Dia de la semana segun el numero que se ponga
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int diasem=0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el dia de la semana con un numero (1-7) ");
		diasem = leer.nextInt();
		
		switch (diasem) {
		case 1:
			System.out.println("El dia es Lunes");
			break;
		case 2:
			System.out.println("El dia es Martes");
			break;
		case 3:
			System.out.println("El dia es miercoles");
			break;
		case 4:
			System.out.println("El dia es Jueves");
			break;
		case 5:
			System.out.println("El dia es Viernes");
			break;
		case 6:
			System.out.println("El dia es Sabado");
			break;
		case 7:
			System.out.println("El dia es Domingo");
			break;
			
			default:
			System.out.println("Valor no valido, teclee un valor valido");
			break;
		
		}
	}

}
