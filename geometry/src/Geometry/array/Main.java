package Geometry.array;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Barrel barrel = new Barrel(10, 10);
		System.out.println("barrel: " + barrel);
		System.out.println(barrel.getVolume());
		
		
		
		Cuboid cuboid = new Cuboid (10, 10, 10);
		System.out.println(cuboid);
		System.out.println(cuboid.getVolume());
		
		System.out.println(barrel.isBigger(cuboid));
	}

}
