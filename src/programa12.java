import java.util.Scanner;

public class programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte nCalificaciones,i;
		double promedio=0.0, calificaciones;
		Scanner leer = new Scanner (System.in);
System.out.println("Ingresa el numero de calificaciones");
nCalificaciones=leer.nextByte();
i=0;
while (i<nCalificaciones) {
System.out.println("Ingresa la calificacion"+(i+1)+"1");
calificaciones=leer.nextDouble();
}

	}

}
