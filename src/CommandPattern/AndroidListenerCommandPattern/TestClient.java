package CommandPattern.AndroidListenerCommandPattern;

public class TestClient {

	/**
	 * Invoker相当于Android当中的继承了View的控件（如Button、TextView等）
	 * setCommand相当于控件中setOnClickListener方法
	 * new Command()相当于new View.onClickListener()
	 * 实现Command当中的Execute()方法相当于实现onClickListener中的onClick()方法，事实上省略掉Receiver这个类，而把这个类需要执行的内容直接写在onClick()方法中
	 * invoker.Execute()相当于触发点击事件，在Android中一般在别的地方调用而不是在Activity中调用
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker invoker = new Invoker();
		invoker.setCommand(new Command() {
			
			@Override
			public void Execute() {
				// TODO Auto-generated method stub
				System.out.println("onClickListener Like Execute the Command!");
			}
		});
		/*
		 * Button button = (Button)findViewById(R.id.button);
		 * button.setOnClickListener(new View.onClickListener(){
		 * 		public void onClick(){
		 * 			System.out.println("...");
		 * 		}
		 * });
		 * */
		
		invoker.Execute();
	}

}
