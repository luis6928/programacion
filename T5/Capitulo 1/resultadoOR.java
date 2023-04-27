public class resultadoOR {

		public static void main(String[] args) {
			
			boolean a, b, c, d;
			a= true;
			b=true;
			c=false;
			d=false;
			
			System.out.println("true or true= "+ (a || b));
			System.out.println("true or false= "+ (a || c));
			System.out.println("false or true= "+ (c || b));
			System.out.println("false orfalse= "+ (c || d));
		}
}
