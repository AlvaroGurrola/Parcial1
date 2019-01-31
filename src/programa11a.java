import java.text.DecimalFormat;
import java.util.Scanner;

public class programa11a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte nempleados, i;
double sueldo=0.0, maximo=0.0, minimo=999999, total=0.0, isr=0.0;

Scanner leer=new Scanner(System.in);
DecimalFormat formateador = new DecimalFormat ("###,###.##");


System.out.println("Ingrese el numero de empleados: ");
nempleados= leer.nextByte();
i=1;

do {
	
	System.out.println("Ingrese el sueldo del empleado "+i+":");
	sueldo=leer.nextDouble();
	total+=sueldo;
	
	if(sueldo<minimo) {
		minimo=sueldo;
	}
	if(sueldo>maximo){
		maximo=sueldo;
	}
	i++;
}while(i<=nempleados);
isr=total*0.33;

System.out.println("El total es:"+formateador.format(total));
System.out.println("El ISR es: "+formateador.format(isr));
System.out.println("El salario maximo es: "+formateador.format(maximo));
System.out.println("El sueldo minimo es: "+formateador.format(minimo));

	}

}
