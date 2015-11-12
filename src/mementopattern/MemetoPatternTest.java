package mementopattern;

public class MemetoPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		originator.setState("ON");//设置originator的状态
		
		//在需要的时候才实例化Memeto，然后将originator的数据备份到CareTaker 类中
		CareTaker caretaker = new CareTaker();
		caretaker.setMemeto(originator.createMemeto());
		
		//在状态改变时，想要恢复原有的状态，就从CareTaker类里面取回备份数据
		originator.setState("OFF");
		originator.recoverMemeto(caretaker.getMemeto());
	}

}
