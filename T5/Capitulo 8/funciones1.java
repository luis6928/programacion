/**
* Devuelve verdadero si el número que se pasa como parámetro es capicúa y
falso en caso contrario.
* <p>
* Un número capicúa es el que se lee igual de izquierda a derecha que de
* derecha a izquierda.
*
* @param x número del que se quiere saber si es capicúa
* @return verdadero si el número que se pasa como parámetro es capicúa y
* falso en caso contrario
*/
public static boolean esCapicua(long x) {
	return x == voltea(x);
	}
	/**
	* Devuelve verdadero si el número que se pasa como parámetro es capicúa y
	* falso en caso contrario.
	* <p>
	* Un número capicúa es el que se lee igual de izquierda a derecha que de
	* derecha a izquierda.
	*
	* @param x número del que se quiere saber si es capicúa
	* @return verdadero si el número que se pasa como parámetro es capicúa y
	* falso en caso contrario
	*/
	public static boolean esCapicua(int x) {
	return esCapicua((long)x);
	}
	