import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	DecimalFormat formateador = new DecimalFormat ("###,###.##");
	Scanner leer = new Scanner (System.in);
	int numproducto = 0, i=0;
	double precioProducto=0, suma=0, aumento=0;
	
	System.out.println("Ingrese el numero de productos");
	numproducto=leer.nextInt();
	i++;
	do {
	System.out.println("Ingrese el precio del producto: "+i+":");
	precioProducto=leer.nextDouble();
	suma+=precioProducto; //Esto sirve para no poner suma = suma+precioProducto
		i++;
		
	}while(i<numproducto);
	if (suma>=1500) {
		aumento=suma*0.11;
	}
	else
	{
		aumento=suma*0.10;
	}
	
	System.out.println("Total de productos: "+formateador.format(numproducto));
	System.out.println("El monto es: "+formateador.format(suma));
	System.out.println("El impuesto es: "+formateador.format(aumento));
	System.out.println("El monto total es: "+formateador.format((suma+aumento)));
	}

}
