package factorypattern;

import java.util.Scanner;

public class FatoryPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String strA = sc.next();
//		String oper = sc.next();
		String strB = sc.next();
		sc.close();
		
		//�����ӷ����������Ҫ��������������Ҫ����ʵ������Ӧ�Ĺ���
		AbstractFactory factory = new AddFactory(); 
//		AbstractFactory factory = new SubFactory();
		Operation op = factory.createOperation();
		op.setNumA(Double.parseDouble(strA));
		op.setNumB(Double.parseDouble(strB));
		System.out.println(op.getResult());

	}

}
