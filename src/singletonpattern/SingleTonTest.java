package singletonpattern;

public class SingleTonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon singleton1 = SingleTon.getInstance();
		SingleTon singleton2 = SingleTon.getInstance();
		
		//��������ֻ��һ��SingleTonʵ���������ʵ�����������ֱ�ʵ������������һ���Ķ������ǵ�����ִ��else������
		//���ֻ��ʵ������һ��������singleton1��singleton2��ȣ�ִ��if�е����
		if(singleton1 == singleton2){
			System.out.println("singleton1 is the same as singleton2.");
		}else{
			System.out.println("singleton1 is not the same as singleton2.");
		}
	}

}
