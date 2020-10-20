package uprajnenie;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		numerator=0;
		denominator=1;
		
	}
	public Fraction(int numeratorValue) {
		numerator=numeratorValue;
		denominator=1;
		
	}
	public Fraction(int numeratorValue, int denominatorValue)  {
		numerator=numeratorValue;
		if(denominatorValue!=0) {
		denominator=denominatorValue;
		}
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	public String toString() {
		String result="";
		result+=numerator+"/"+denominator;
		return result;
	}
	Fraction add(Fraction f) {
		Fraction sbor=new Fraction();
		sbor.numerator=(numerator * f.denominator)+(f.numerator*denominator);
		sbor.denominator=denominator*f.denominator;
		return sbor;
	}
	Fraction substract(Fraction f) {
		Fraction razlika=new Fraction();
		razlika.numerator=(numerator * f.denominator)-(f.numerator*denominator);
		razlika.denominator=denominator*f.denominator;
		return razlika;
	}
	 Fraction multiply(Fraction f) {
		 Fraction proizvedenie=new Fraction();
		 proizvedenie.numerator=numerator*f.numerator;
		 proizvedenie.denominator=denominator*f.denominator;
		 return proizvedenie;
	 }
	 Fraction divide(Fraction f) {
		 Fraction chastno=new Fraction();
		 chastno.numerator=numerator*f.denominator;
		 chastno.denominator=denominator*f.numerator;
		 return chastno;
	 }
	 public int nod() {
		 int c,d;
		 c=Math.abs(numerator);
		 d=Math.abs(denominator);
		 while(c!=d) {
			 if(c>d) {
				 c=c-d;
			 }else {
				 d=d-c;
			 }
		 }
		 return c;
	 }
	 public void simplify() {
		 if(numerator<0 && denominator<0) {
			 numerator*=-1;
			 denominator*=-1;
		 }
		 if(numerator>=0 && denominator<0) {
			 numerator*=-1;
			 denominator*=-1;
		 }
		 int n=nod();
		 numerator= numerator/n;
		 denominator=denominator/n;
	 }


}