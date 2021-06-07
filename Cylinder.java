package two;

public class Cylinder implements C {
	public double radius; 
	public String color;
	public double height;
		public Cylinder(double radius, double height) {
			this.radius = radius;
			this.height = height;
		}
		@Override
		public double area() {
			double area = 2*pi*this.radius*this.height + 2*pi*this.radius*this.radius;
			return area;
		}
		@Override
		public void setColor(String color) {
			// TODO Auto-generated method stub
			this.color = color;
		}
		@Override
		public double volume() {
			// TODO Auto-generated method stub
			double volume = pi*this.radius*this.radius*this.height;
			return volume;
		}
		
}