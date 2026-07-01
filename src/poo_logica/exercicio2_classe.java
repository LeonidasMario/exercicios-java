package poo_logica;

public class exercicio2_classe {

	public String name;
	public Double grossSalary;
	public Double tax;
	
	
	public double NetSalary() {
		double net = grossSalary -tax;
		return net;
	}
	public void increaseSalary(double percentage ) {
	grossSalary += grossSalary*percentage /100.0;  
	}
	
	public String toString() {
		return name+ "," + String.format("%.2f",NetSalary());
	}
}
