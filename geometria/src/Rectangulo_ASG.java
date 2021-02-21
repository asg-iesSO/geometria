
/**
 * @author Adolfo Sobrino Gomez
 * @version 1.2
 */
public class Rectangulo_ASG extends FiguraGeometrica_ASG {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase rectangulo.
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_ASG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Este metodo calcula el area del rectangulo multiplicando lado por lado.
	 * @return el area del rectangulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Este metodo calcula el perimetro del rectangulo sumando todos sus lados.
	 * @return el perimetro del rectangulo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
