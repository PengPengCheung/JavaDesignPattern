package mementopattern;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public MemetoInterface createMemeto(){
		return new Memeto(state);
	}
	
	public void recoverMemeto(MemetoInterface memeto){
		this.setState(((Memeto)memeto).getState());
	}
	
	//Memeto类的所有属性和方法都定义成private，因此只能在类内部使用
	//无法在类外实例化这个Memeto类，保证备忘数据不会外泄
	//另外需要备份的时候，将这个类的内容传到CareTaker进行备份，需要的时候再从CareTaker里取回
	//如果在Originator外部要再使用这个类，则通过实现的MemetoInterface接口在类外部使用Memeto这个类
	private class Memeto implements MemetoInterface{
		private String state;
		
		private String getState() {
			return state;
		}

		private void setState(String state) {
			this.state = state;
		}

		private Memeto(String state){
			this.state = state;
		}
		
		
	}
	
}
