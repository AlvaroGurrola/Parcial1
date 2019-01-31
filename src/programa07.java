import java.util.Scanner;

public class programa07 {
	
	//Porgrama que pide una temperatura en grados Fahrenheith y la convierte en grados centigrados y al final muestra ambos

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp=0;
		double grad=0;
		Scanner leer = new Scanner(System.in);

	System.out.println("Ingrese la temperatura en grados Fahrenheith");
  temp =leer.nextDouble();
  
   grad=(temp-32)/1.8;
   
		   System.out.println("La temperatura en grados Fahrenheith es: "+temp);
   			System.out.println("La temperatura en grados centigrados es: "+grad);

	}

}