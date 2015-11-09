package facadepattern;

/*
 * 1、外观类，提供一个统一标准的接口给客户端进行调用，而不用让客户端直接接触复杂的子系统
 * 2、在系统中可以设计多个外观类，为多种子系统和客户端提供接口，每个外观类都为特定的子系统负责
 * 3、如果不提供一个抽象的外观类，当增加新的子系统或者功能的时候要对原有的外观类进行修改，违反了开闭原则
 * 因此为了解决这个问题，可以引入抽象外观类，并创建新的具体外观类，让具体外观类实现新增的功能
 * */
public class Facade {
	private SubSystemA subA;
	private SubSystemB subB;
	private SubSystemC subC;
	
	public Facade(){
		subA = new SubSystemA();
		subB = new SubSystemB();
		subC = new SubSystemC();
	}
	
	public void FacadeMethod(){
		subA.subSystemAMethod();
		subB.subSystemBMethod();
		subC.subSystemCMethod();
	}
}
