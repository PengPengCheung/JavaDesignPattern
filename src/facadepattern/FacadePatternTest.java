package facadepattern;

public class FacadePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		不用外观模式时的用法
//		SubSystemA subA = new SubSystemA();
//		SubSystemB subB = new SubSystemB();
//		SubSystemC subC = new SubSystemC();
//		subA.subSystemAMethod();
//		subB.subSystemBMethod();
//		subC.subSystemCMethod();
		
//		只用具体外观模式的写法
//		Facade facade = new Facade();
//		facade.FacadeMethod();
		
//		使用抽象外观类的写法
		AbstractFacade facade = new Facade();
		facade.FacadeMethod();
	}

}
