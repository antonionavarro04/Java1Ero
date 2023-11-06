package asignacion;

public class Asignacion {

	public static void main(String[] args) {
		boolean bool = true;
		byte a = 2;
		int b = -10;
		
		bool &= 1 == 2;
		System.out.println(bool);
		
		bool |= 9 == 2 || 2 == 2;
		System.out.println(bool);
		
		a <<= 1;
		System.out.println(a);
		
		a >>= 1;
		System.out.println(a);
		
		b >>>= 1;
		System.out.println(b);

	}

}
