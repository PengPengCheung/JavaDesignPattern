package simpleFactoryPattern;

public class DivOperation extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if(getNumB()!=0){
			result = getNumA() / getNumB();
		}else{
			System.out.println("��������Ϊ0��");
		}
		return result;
	}

}
