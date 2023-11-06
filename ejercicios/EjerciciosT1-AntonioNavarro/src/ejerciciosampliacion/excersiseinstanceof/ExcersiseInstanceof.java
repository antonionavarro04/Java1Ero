package excersiseinstanceof;

import java.util.*;

public class ExcersiseInstanceof {

	public static void main(String[] args) {
		final Scanner read = new Scanner(System.in);
		final Random rng = new Random();
		
		System.out.println(read instanceof Scanner);
		System.out.println(rng instanceof Random);
		
		// Da error: System.out.println(read instanceof Random);
		
		read.close();

	}

}
