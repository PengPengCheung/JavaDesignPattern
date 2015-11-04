package callbackmechanism;

public class CallbackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbackResolver resolver = new CallbackResolver();
		
		//传入接口，并实现 接口中没实现的方法，没实现的方法作为setCallback方法中的一部分，仍可以执行set方法内的剩余部分
		resolver.setCallback(new ICallBack() {
			
			@Override
			public void executeCallback() {
				// TODO Auto-generated method stub
				update();
			}
		});
		
		//传入实现了ICallBack接口的类，并且回调这个类的executeCallback方法，即实现了的ICallBack接口的方法
		resolver.setCallback(new SubclassofICallback());
	}

	protected static void update() {
		// TODO Auto-generated method stub
		System.out.println("This is ICallback update.");
	}

}
