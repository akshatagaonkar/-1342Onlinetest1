package voting;

public class Main {
	//Proxy pattern separates interface from implementation
	//Proxy object controls access to the real object.
	public static void main(String[] args)
	{
		ProxyController pp = new ProxyController();
		pp.printer_request();
	}
}
