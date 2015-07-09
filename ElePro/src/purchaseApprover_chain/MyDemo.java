package purchaseApprover_chain;

public class MyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondFloor s = new SecondFloor();
		ThirdFloor vp = new ThirdFloor();
		FirstFloor p = new FirstFloor();
		
		s.setSuccessor(vp);
		vp.setSuccessor(p);
		
		
		System.out.println("**************");
		Elevator p1 = new Elevator();
		s.getFloor(p1);
		
		Elevator p2 = new Elevator();
		s.getFloor(p2);

	}

}
