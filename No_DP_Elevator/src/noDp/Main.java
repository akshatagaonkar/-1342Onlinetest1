package noDp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Door d = new Door();
		Floor f = new Floor();
		
		String state = d.getState();
		System.out.println(state);
		System.out.println("\ncurrent floor "+f.getCurrentFloor());
		
	
		
		
		int desFloor = f.getDesFloor();
		System.out.println(desFloor);
		f.CheckFloor();
		System.out.println("\ncurrent floor "+f.getCurrentFloor());
	}
	
	

}
