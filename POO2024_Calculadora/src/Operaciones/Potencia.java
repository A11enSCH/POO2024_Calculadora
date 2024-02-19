package Operaciones;

public class Potencia implements Operacion{
	public double calcular(double x, double y) {
		double z=x;
		if (y==0)
		{
			return 1;
		}
        for (int i=1; i<y; i++)
        {
        	z*=x;
        }
        return z;
    }
}
