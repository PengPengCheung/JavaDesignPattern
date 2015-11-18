package flyweightpattern;

public class FlyweightPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory factory = new FlyweightFactory();
		
		Flyweight flyweightA = factory.getFlyweight("A");//A为从外部传入的内蕴状态
		flyweightA.Opertion("flyweightA");//flyweightA为外蕴状态
		
		Flyweight flyweightB = factory.getFlyweight("B");
		flyweightB.Opertion("flyweightB");
		
		Flyweight flyweightC = factory.getFlyweight("A");
		flyweightC.Opertion("flyweightC");
		
		//如果flyweightA和flyweightC相等，则它们共享同一个对象空间，这也体现了享元模式中的共享思想
		if(flyweightA == flyweightC){
			System.out.println("flyweightA and flyweightC are the same!");
		}
	}

}
