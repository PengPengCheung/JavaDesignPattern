package mementopattern;

public class MemetoPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		originator.setState("ON");
		
		CareTaker caretaker = new CareTaker();
		caretaker.setMemeto(originator.createMemeto());
		
		originator.setState("OFF");
		originator.recoverMemeto(caretaker.getMemeto());
	}

}
