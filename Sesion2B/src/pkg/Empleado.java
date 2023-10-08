package pkg;

public class Empleado {

	public enum tipo {Vendedor, Encargado, Otro};
	
	
	public static float CalculoNominalBruto(tipo e, float ventas, float extra) {
		float salario=0, primas=0, extras=0;
		
		if(e==tipo.Encargado) salario=3500;
		else if(e==tipo.Vendedor) salario=2000;
		
		if(ventas>=1500) primas=200;
		else if(ventas>=1000) primas=100;
		
		extras=extra*30;
		
		return salario+extras+primas;
	}
	
	public static float CalculoNominaNeta(float bruta) {
		float retencion=0;
		if(bruta<2100) retencion=0;
		else if ((bruta>=2100)&(bruta<2500)) retencion=15;
		else if(bruta>=2500) retencion=18;
		
		float r=retencion/100;
		
		return bruta*(1-r);
	}
}
