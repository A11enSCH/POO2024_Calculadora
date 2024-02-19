package Operaciones;

public class Factorial implements Operacion {
    public double calcular(double x, double y) {
    	double aux=1;
    	if (x<0)
    	{
    		for (int i=-2; i>=x; i--)
            {
            	aux*=i;
            }
            return -aux;
    	}
        for (int i=2; i<=x; i++)
        {
        	aux*=i;
        }
        return aux;
    }
}