package firnas;

public class CloneDemo {
	public static void main(String[] args) {
		Service s1=new Service();
		Service s2=s1.getClone();
		Service s3=s1.getClone();
		
		s1.item="bus";
		s2.item="car";
		s3.item="flight";
		
		System.out.println("s1....:"+s1.item);
		System.out.println("s2....:"+s2.item);
		System.out.println("s3....:"+s3.item);
	}
}
class Service implements Cloneable{
	public Service() {
		System.out.println("cons called...");
	}
	String item;
	
	public Service getClone() {
		try {
			return (Service)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
