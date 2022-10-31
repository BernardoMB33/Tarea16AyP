//BERANRDO MARCO BORGARO
//ITAM
import java.util.*;

public class MainMenu {

	public static void main(String[] args) {
		
		int pool=5;
		Rectangulo[] albercas = new Rectangulo[pool];
		albercas[0]= new Rectangulo(30, 11);
		albercas[1]= new Rectangulo(6, 15);
		albercas[2]= new Rectangulo(3, 8);
		albercas[3]= new Rectangulo(4, 24);
		albercas[4]= new Rectangulo(6, 10);
		
		
		Institucion s1 = new Institucion("Club de Natacion S.A. de C.V", "Av. San Jeronimo 240, Tizapan San Angel, Jardines del Pedregal, Coyoacan, 10200 Ciudad de Mexico, CDMX", pool, albercas);
		
		int opcion;
		double altura, base;
		int numero;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Escoga una opción:  ");
			System.out.println("1. IMPRIMIR COSTO DE TECHADO ALBERCA INDICANDO MEDIDAS (Largo x Ancho)");
			System.out.println("2. IMPRIMIR COSTO DE TECHADO ALBERCA INDICANDO POSICION (INICIA EN 0)");
			System.out.println("3. CONOCER DATOS (To String)");
			System.out.println("0. SALIR DEL MENU \n\n");

			
			opcion=sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Ingrese Largo: \t");
				altura=sc.nextDouble();
				System.out.println("Ingrese Ancho: \t");
				base= sc.nextDouble();
				System.out.println();
				if (s1.cnTecho(base, altura)==0) {
					System.out.println("No hay alberca de dichas dimensiones.");
				}
				else {
				System.out.printf("Costo: $ %,.2f", s1.cnTecho(base, altura));
				}
				System.out.println();
				break;
			case 2:
				System.out.println("Indique posicion: \t");
				numero=sc.nextInt();
				System.out.println();
				if (s1.cnTechoNum(numero)==0) {
					System.out.println("No hay alberca en dicha posicion");
				}
				else {
				System.out.printf("Costo: $ %,.2f", s1.cnTechoNum(numero));
				}
				System.out.println();
				break;
			case 3:
				System.out.println();
				System.out.println(s1.toString());
				System.out.println();
				break;
			case 0:
				System.out.println();
				System.out.println("GRACIAS POR USARME");
				System.out.println();
				break;
			default:
				break;
			}
			
		} while (opcion!=0);

	}

}
