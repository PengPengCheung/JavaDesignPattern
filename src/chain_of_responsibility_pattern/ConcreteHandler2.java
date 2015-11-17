package chain_of_responsibility_pattern;

public class ConcreteHandler2 extends AbstractHandler {

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if (request >= 10 && request < 20) {
			System.out.println("ConcreteHandler2 handle the request!");
		} else if (this.getSuccessor() != null) {//如果在职责链中还存在下一个successor,则将请求传递到下一个successor，否则在这个handler中处理
			this.getSuccessor().handleRequest(request);
		}
	}

}
