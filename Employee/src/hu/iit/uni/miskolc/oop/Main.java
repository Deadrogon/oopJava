package hu.iit.uni.miskolc.oop;

public class Main {

	public static void main(String[] args) {
		Employee viktor = new Employee();
		viktor.setName("Gonczi Viktor");
		viktor.setSalary(0);
		System.out.println("Employee toString: " + viktor.toString());
		viktor.raiseSalary(666);
		System.out.println("Employee toString toString kir�sa n�lk�l" + viktor); System.out.println(viktor.isBetweenSalary(200, 1000)); System.out.println(viktor.isBetweenSalary(1000, 2000));
		System.out.println(viktor.getTax());
		Employee marci = new Employee();
		marci.setName("M�rci Matiscs�k");
		marci.setSalary(9999999);
		System.out.println(viktor.getName()+" fizet�se nagyobb: "+viktor.isBiggerSalary(marci));
		
		
		
	}

}
