package EqualsAndHashCode;

public class EqualsHashCode {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Idel Mury";
		u1.email = "idelMury@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Idel Mury";
		u2.email = "idelMury@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
}
