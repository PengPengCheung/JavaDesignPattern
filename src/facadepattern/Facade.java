package facadepattern;

/*
 * 1������࣬�ṩһ��ͳһ��׼�Ľӿڸ��ͻ��˽��е��ã��������ÿͻ���ֱ�ӽӴ����ӵ���ϵͳ
 * 2����ϵͳ�п�����ƶ������࣬Ϊ������ϵͳ�Ϳͻ����ṩ�ӿڣ�ÿ������඼Ϊ�ض�����ϵͳ����
 * 3��������ṩһ�����������࣬�������µ���ϵͳ���߹��ܵ�ʱ��Ҫ��ԭ�е����������޸ģ�Υ���˿���ԭ��
 * ���Ϊ�˽��������⣬���������������࣬�������µľ�������࣬�þ��������ʵ�������Ĺ���
 * */
public class Facade {
	private SubSystemA subA;
	private SubSystemB subB;
	private SubSystemC subC;
	
	public Facade(){
		subA = new SubSystemA();
		subB = new SubSystemB();
		subC = new SubSystemC();
	}
	
	public void FacadeMethod(){
		subA.subSystemAMethod();
		subB.subSystemBMethod();
		subC.subSystemCMethod();
	}
}
