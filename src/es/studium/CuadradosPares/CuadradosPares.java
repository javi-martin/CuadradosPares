package es.studium.CuadradosPares;

public class CuadradosPares {

	public static void main(String[] args) 
	{
		int resultado;
		
		for(int i=1; i<=100; i++)
		{
			if(i%2==0) 
			{
				resultado = funCalcular(i);
				System.out.println(resultado);
			}
		}
	}
	
	public static int funCalcular(int i) 
	{
		return(i*i);
	}

}
