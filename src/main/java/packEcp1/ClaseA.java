package packEcp1;

public class ClaseA {
	
	private int num1;
	
	private Semana dia;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void mostrarDatos(){
		System.out.println("Información: " + this.dia  + "," + this.num1);
	}

}
