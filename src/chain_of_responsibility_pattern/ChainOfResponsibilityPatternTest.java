package chain_of_responsibility_pattern;

public class ChainOfResponsibilityPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractHandler handler = new ConcreteHandler();
		AbstractHandler handler2 = new ConcreteHandler2();
		AbstractHandler handler3 = new ConcreteHandler3();
		
		//设置职责链中的下一个负责处理的角色，如果没有下一个角色则交由当前角色对请求进行处理
		handler.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		
		int[] request = {2, 45, 13, 12, 20, 234, 4};
		
		for(int num:request){
			handler.handleRequest(num);
		}
		
	}

}
