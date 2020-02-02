package packone;

public class CallMethods {

	public static void main(String[] args) {
		
		Methods m=new Methods();
		m.launchApp("http://facebook.com");
		m.elementAvailable("email", true);
		m.elementAvailable("pass", false);
		m.elementAvailable("day", true);
		m.elementAvailable("month", false);
		m.elementsCount("a", 53);
		m.elementsCount("img", 5);			
		m.closeApp();
		m.launchApp("http://yahoomail.com");
		m.elementsCount("a", 20);
		m.elementsCount("select", 5);
		m.closeApp();
		
		
		

	}

}
