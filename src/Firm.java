
class Firm {

	private String Firmname;
	private Employee[] E;
	private int EmplAmount;
	
	public Firm (String Firmname, int MaxEmplAmount){
		this.Firmname = Firmname;
		this.EmplAmount = 0;
		this.E = new Employee[MaxEmplAmount];
	}
	

	public void add(Employee E){
		
		try {
			this.E[EmplAmount]= E;
			this.EmplAmount++;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ir pârsniegts maksimâlais darbinieku daudzums!");
		}
	}
	
	@Override
	public String toString() {
		String temp = ("Firma: " +Firmname+ " Darbinieku skaits: " +EmplAmount);
		StringBuilder SB = new StringBuilder(temp);
		
		SB.append(System.lineSeparator());		
		
		int i = 0;
		
		while (i != EmplAmount) {
			
			SB.append("	" +E[i]+ System.lineSeparator());			
			i++;
		}
		temp = SB.toString();
		return temp;
	}


}
