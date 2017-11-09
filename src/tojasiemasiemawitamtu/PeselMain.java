package tojasiemasiemawitamtu;

class PESEL{
	double pesel;
	
	public PESEL(double pesel) {
		this.pesel = pesel;
	}
	
	public PESEL(String str) {
		this.pesel = Long.parseLong(str);
	}
	
	public boolean isCorrect() {
		return false;
	}
	
	public boolean isMale() {
		return true;
	}
	
	public String isBorn() {
		return "";
	}
	
	public String toString() {
		String correct = "";
		if(isCorrect()) correct = "TAK";
		else correct = "NIE";
		String sex = "Kobieta";
		if(isMale()) sex = "Mężczyzna";
		return String.format("Poprawny: %s, Płeć: %s, Urodzony: %s", correct, sex, isBorn());
	}
}

public class PeselMain {
	
	public static void main(String [] args) {
		double pesel = 00281706299d;
		PESEL p1 = new PESEL(pesel);
		PESEL p2 = new PESEL("00220305752");
		p1.toString();
		p2.toString();
		
	}

}
