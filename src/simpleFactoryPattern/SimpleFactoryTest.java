package simpleFactoryPattern;

import java.util.Scanner;

public class SimpleFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String strA = sc.next();
		String oper = sc.next();
		String strB = sc.next();
		sc.close();
		
		Operation op = SimpleFactory.createOpertion(oper.charAt(0));
		op.setNumA(Double.parseDouble(strA));
		op.setNumB(Double.parseDouble(strB));
		System.out.println(op.getResult());
		
	}

}
