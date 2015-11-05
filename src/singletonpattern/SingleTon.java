package singletonpattern;

public class SingleTon {
	//��ԱҪ�ĳ�˽�еģ������Ͳ���������ֱ�ӵ��ó�Ա������
	private static SingleTon singleton;
	
	//���췽���޸ĳ�˽�е�
	private SingleTon(){
		System.out.println("SingleTon Class has been created!");
//		singleton = new SingleTon();
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
