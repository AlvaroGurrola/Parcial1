import java.util.Scanner;

public class programa03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leer1 = new Scanner(System.in);
		
		int ed=0;
		double alt=0;
		
		System.out.println("Ingrese Su Nombre:");
		String nombre = leer1.nextLine();
		
		System.out.println("Ingrese Su Edad:");
		ed=leer1.nextInt();
		
		System.out.println("Ingrese su altura:");
		alt=leer1.nextDouble();
			
		System.out.println("Su nombre es: "+nombre);
		System.out.println("Su edad es: "+ed);
		System.out.println("Su altura es: "+alt);
	}

}
