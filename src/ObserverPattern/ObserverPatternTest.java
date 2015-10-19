package ObserverPattern;

public class ObserverPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实例化具体的主题对象
		Subject subject = new ConcreteSubject();
		
		//实例化具体的观察者对象
		Observerable observer1 = new ConcreteObserver();
		Observerable observer2 = new ConcreteObserver();
		Observerable observer3 = new ConcreteObserver();
		
		//主题关联观察者
		subject.Attach(observer1);
		subject.Attach(observer2);
		subject.Attach(observer3);
		
		//当主题发生更新时，通知所有观察者做出反应
		subject.Notify();
		
		//解除观察者2的关联
		subject.Detach(observer2);
		System.out.println("----------------");
		subject.Notify();
	}

}
