package noDp;
import java.util.Arrays;
import java.util.List;
public class Floor {
	
/*public static void main(String[] args){
	Integer []floor=new Integer[15];
	for(int i=0;i<floor.length;i++){
		floor[i]=floor.length-i;
	}
}*/

	private Elevator f;

	int currentFloor=1;
 	

	
	public int getCurrentFloor() {
		return currentFloor;
	}

	int totalFloors=15;
 	
	public Floor(){
		this.f = new Elevator();
		f.setDesFloor(4);
	
	}

	public int getDesFloor(){
		System.out.print("You want to move to floor no ");
		return f.getDesFloor();
	}

	public void CheckFloor(){
		int destfloor=f.getDesFloor();
		if(currentFloor < destfloor){
			f.setState("closed");
			int i;
			System.out.println("elevator is moving up");
			for(i=currentFloor;i<=destfloor;i++){
				System.out.print(" " +i);
			} currentFloor=i-1;
		}
		
		else if(currentFloor > destfloor)
		{int i;
		f.setState("closed");
			System.out.println("elevator is moving down");
			for(i=currentFloor;i>=destfloor;i--){
				System.out.print(" " +i);
			}currentFloor=i+1;
		}
		else 
		{
			System.out.println("elevator is static");
		}
	}

	
	
}
