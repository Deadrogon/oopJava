package hu.iit.uni.miskolc.hu;

public class Main {

	public static void main(String[] args) {
		
		Person viktor = new Person(new Person.Name("Gonczi", "Viktor"), 22);
		System.out.println(viktor);
		Person.Name adamName = new Person.Name("Satan", "Adam");
		Person adam = new Person(adamName, 22);
		System.out.println(adam.getName());

	}

}
