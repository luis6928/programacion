public class ejercicio2{
	
	public static void main (String[] args) {
		final int entero1;
		entero1= 5;
		final int entero2;
		entero2= 7;
		boolean a;
		a= (entero1>5) && (entero2+3<10);
		boolean b;
		b =(10 != entero1 + 5) || (20 > (entero2 +5) * entero1+ 5);
		int c;
		c = entero1 * entero2 +10+4/2-2*4+2 ;
		boolean d;
		d = (10/2 - 1==entero1) & (20 > entero2 + 13);
	    boolean e;
		e= 5-2>4 &&  5==25/5;
		boolean f;
		f= ('J'=='j' || 'S'=='s' );
		boolean g;
		g= 4*2<=8 || 2*2<5 && 4>3+1;
		boolean h;
		h= 10+4<15-3 || 2*5+1>14-2*2;






		System.out.println(" Resultado1= "+a);
		System.out.println(" Resultado2= "+b);
		System.out.println(" Resultado3= "+c);
		System.out.println(" Resultado4= "+d);
		System.out.println(" Resultado5= "+(!e));
		System.out.println(" Resultado6= "+f);
		System.out.println(" Resultado7= "+g);
		System.out.println(" Resultado8= "+h);
		
	
}}

