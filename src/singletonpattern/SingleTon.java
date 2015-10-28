package singletonpattern;

public class SingleTon {
	private static SingleTon singleton;
	
	//���췽���޸ĳ�˽�е�
	private SingleTon(){
		System.out.println("SingleTon Class has been created!");
	}
	
	//��ΪSingleTon��û�а취���ⲿ����ʵ���������췽��Ϊ˽�У��������Ҫ����������һ������ʵ���ķ���
	//�˷���Ҳ����Ϊstatic
	public static SingleTon getInstance(){
		if(singleton == null){
			singleton = new SingleTon();
			return singleton;
		}
		return singleton;
	}
}
