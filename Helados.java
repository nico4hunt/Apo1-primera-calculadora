import java.util.Scanner;
public class Helados {

     public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String saborhelado; // Declararlo
		
		System.out.println( "cual es tu sabor de helado favorito? ");
		
		saborhelado = in.nextLine();
		
		System.out.println(" tu sabor elegido fue: " + saborhelado);
		
		double porcentajeComision;
		
		System.out.println("Cual es tu porcentaje de comision en la venta ? ");
		
		porcentajeComision = in.nextDouble();
		
		System.out.println( "tu porcentaje de comision es " + porcentajeComision);
		
	 }
	 
}	 