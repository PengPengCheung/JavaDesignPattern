package CommandPattern.AndroidListenerCommandPattern;

public class TestClient {

	/**
	 * Invoker�൱��Android���еļ̳���View�Ŀؼ�����Button��TextView�ȣ�
	 * setCommand�൱�ڿؼ���setOnClickListener����
	 * new Command()�൱��new View.onClickListener()
	 * ʵ��Command���е�Execute()�����൱��ʵ��onClickListener�е�onClick()��������ʵ��ʡ�Ե�Receiver����࣬�����������Ҫִ�е�����ֱ��д��onClick()������
	 * invoker.Execute()�൱�ڴ�������¼�����Android��һ���ڱ�ĵط����ö�������Activity�е���
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
