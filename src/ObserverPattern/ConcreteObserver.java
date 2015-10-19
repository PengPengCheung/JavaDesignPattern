package ObserverPattern;

public class ConcreteObserver implements Observerable {

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println("notify new Message!");
	}

}
