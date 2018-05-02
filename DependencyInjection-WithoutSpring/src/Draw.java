
public class Draw {

	Shape shape;
	
	public void setShape(Shape shape){
		shape.draw();
	}
	public static void main(String[] args) {
		Draw draw= new Draw();
		
		draw.setShape(new Triangle());
		draw.setShape(new Square());

	}

}
