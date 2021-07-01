
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Fulano de Tal");
		g1.setCpf("111.111.111-11");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(99999);
		boolean autenticou = g1.autentica(99999);
		System.out.println(autenticou);
	}
}
