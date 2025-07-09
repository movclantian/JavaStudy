package compactGame;

public class Gametest {
	public static void main(String argv[]) {
		role r1= new role("jack", 100);
		role r2= new role("lucy", 100);
		
		while(true) {
			r1.attack(r2);
			
			if(r2.getBlood()==0) {
				System.out.println(r1.getName()+"打败了"
						+r2.getName());
				break;
				
			}
			r2.attack(r1);
			if(r1.getBlood()==0) {
				System.out.println(r2.getName()+"打败了"
						+r1.getName());
				break;
				
			}
		    try {
	            Thread.sleep(1000); //1000 毫秒，也就是1秒.
	            } catch(InterruptedException ex) {
	            Thread.currentThread().interrupt();
	            }
			
		}
		
	}
}
