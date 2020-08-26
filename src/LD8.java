public class LD8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human H1 = new Human("Liene","Liepina");
		System.out.println(H1.toString());
		Human H2 = new Human("Jurijs","Kalnajs");
		System.out.println(H2.toString());
		Human H3 = new Human(H1);
		System.out.println(H3.toString());
		Employee E1 = new Employee("Kaiva","Klavina",666.55);
		System.out.println(E1.toString());
		Employee E2 = new Employee("Ilze","Liela",500.20);
		System.out.println(E2.toString());
		Employee E3 = new Employee(E2);
		System.out.println(E3.toString());
		
		
		Firm F1 = new Firm("Rudzaji",2);
				
		F1.add(E1);
		F1.add(E2);
		F1.add(E3);
		System.out.println(F1.toString());
		
		
		
	}

}
