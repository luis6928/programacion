public class fechanacimiento {

		public static void main(String[] args) {
			int year1;
			year1=2003;
			
			int year2;
			year2=2003;
			
			int suma;
			suma= (year1+year2);
			
			boolean mayor;
			mayor= (year1>year2);
			
			boolean menor;
			menor= (year2>year1);
			
			boolean igual;
			igual= (year1==year2);
			
			char miletra;
			miletra= 'L';
			
			char letracom;
			letracom= 'G';
			
			boolean lmayor;
			lmayor= miletra>letracom;	
			
			boolean lmenor;
			lmenor= miletra<letracom;
			
			boolean ligual;
			ligual= miletra==letracom;	
			System.out.println("Mi fecha es: "+year1);
			System.out.println("La fecha de mi companero es: "+year2);
			System.out.println("La suma de las fechas es: "+suma);
			System.out.println("Mi fecha es mayor: "+mayor);
			System.out.println("Mi fecha es menor: "+menor);
			System.out.println("Mi fecha es igual: "+igual);
			System.out.println("Mi letra es mayor: "+lmayor);
			System.out.println("Mi letra es menor: "+lmenor);
			System.out.println("Mi letra es igual: "+ligual);
		}
}
