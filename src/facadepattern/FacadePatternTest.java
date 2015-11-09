package facadepattern;

public class FacadePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SubSystemA subA = new SubSystemA();
//		SubSystemB subB = new SubSystemB();
//		SubSystemC subC = new SubSystemC();
//		subA.subSystemAMethod();
//		subB.subSystemBMethod();
//		subC.subSystemCMethod();
		
		Facade facade = new Facade();
		facade.FacadeMethod();
	}

}
