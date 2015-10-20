package factorypattern;

public abstract class Operation {
	private double numA;
	private double numB;
	protected  double result=0;
	
	public double getNumA() {
		return numA;
	}



	public void setNumA(double numA) {
		this.numA = numA;
	}



	public double getNumB() {
		return numB;
	}


	public void setNumB(double numB) {
		this.numB = numB;
	}

	
	public abstract double getResult();
}
