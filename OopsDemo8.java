package oops;
// Inheritance lead to reusability of objects
public class OopsDemo8 {
	public static void main(String[] args) {
		PaintBrush brush=new PaintBrush();
		brush.paint=new RedPaint();
	}
}
//By declaring Paint variable in PaintBrush, the paintbrush object
//has become reusable

//
class PaintBrush{
	Paint paint;
}

class Paint{
	
}

class RedPaint extends Paint{
	
}
class BluePaint extends Paint{
	
}