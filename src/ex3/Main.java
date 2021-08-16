package ex3;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Paulista p1 = new Paulista();
		Paulista p2 = new Paulista();
		Mineiro p3 = new Mineiro();
		Mineiro p4 = new Mineiro();
		Carioca p5 = new Carioca();
		Carioca p6 = new Carioca();
		
		String [] pessoas = {p1.giria(), p2.giria(), p3.giria(), p4.giria(), p5.giria(), p6.giria()};
		
		int cont = 0;
		while(cont<6) {
			System.out.println(pessoas[cont]);
			cont = cont +1;
		}
	}

}
