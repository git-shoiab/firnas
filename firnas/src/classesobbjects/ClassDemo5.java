package classesobbjects;

public class ClassDemo5 {
	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		BluePaint rp=new BluePaint();	
		brush.doPaint(rp);
	}
}
class PaintBrush{
	
	public void doPaint(Paint rp) {
		System.out.println(rp);
	}
}
abstract class PartyHall{
	
}

abstract class Paint{
	
}
class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}
abstract class Shoe{}
abstract class ShoeShop{}

class BirthdayPartyHall extends PartyHall{
	
}
class MarriagePartyHall extends PartyHall{
	
}
class ReceptionPartyHall extends PartyHall{
	
}