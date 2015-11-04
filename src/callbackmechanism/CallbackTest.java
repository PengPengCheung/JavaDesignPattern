package callbackmechanism;

public class CallbackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbackResolver resolver = new CallbackResolver();
		
		//����ӿڣ���ʵ�� �ӿ���ûʵ�ֵķ�����ûʵ�ֵķ�����ΪsetCallback�����е�һ���֣��Կ���ִ��set�����ڵ�ʣ�ಿ��
		resolver.setCallback(new ICallBack() {
			
			@Override
			public void executeCallback() {
				// TODO Auto-generated method stub
				update();
			}
		});
		
		//����ʵ����ICallBack�ӿڵ��࣬���һص�������executeCallback��������ʵ���˵�ICallBack�ӿڵķ���
		resolver.setCallback(new SubclassofICallback());
	}

	protected static void update() {
		// TODO Auto-generated method stub
		System.out.println("This is ICallback update.");
	}

}
