
public class Circulo_ASG extends FiguraGeometrica_ASG {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_ASG(double r, String tipoFigura) {
		super(tipoFigura);
		if(r<0) {
			r = Math.abs(r);
		}
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
