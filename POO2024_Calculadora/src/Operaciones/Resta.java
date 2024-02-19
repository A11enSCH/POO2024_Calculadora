package Operaciones;

public class Resta implements Operacion {
    public double calcular(double x, double y) {
    	if (x<=0 && y<=0)
    	{
    		return x + y;
    	}
        return x - y;
    }
}