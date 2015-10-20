package simpleFactoryPattern;

public class DivOperation extends Operation {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if(getNumB()!=0){
			result = getNumA() / getNumB();
		}else{
			System.out.println("除数不能为0！");
		}
		return result;
	}

}
