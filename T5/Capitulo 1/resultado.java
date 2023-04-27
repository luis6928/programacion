public class resultado {

		public static void main(String[] args) {
			
			boolean a, b, c, d;
			a= true;
			b=true;
			c=false;
			d=false;
			
			System.out.println("true y true= "+ (a && b));
			System.out.println("true y false= "+ (a && c));
			System.out.println("false y true= "+ (c && b));
			System.out.println("false y false= "+ (c && d));
		}
}
