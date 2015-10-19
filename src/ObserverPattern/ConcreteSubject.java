package ObserverPattern;




public class ConcreteSubject extends Subject {

	private String state;//用于标识和模拟具体主题的变化
	
	public void set(String state){
		
	}
	
	public String get(){
		return state;
	}

}
