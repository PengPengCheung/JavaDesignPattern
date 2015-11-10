package statepattern;

/* 
 * 状态管理器，设置初始状态，得到当前状态，可以通过传入这个Context类来设置下一个状态
 * 
 */ 
public class Context {
	private State state;
	
	public State getState() {
		return state;
	}

	//设置当前状态
	public void setState(State state) {
		this.state = state;
		System.out.println("set State " + state.toString());
	}

	
	//请求改变现在的状态，实际上通过state中的handle方法对状态进行设置。
	public void Request(){
		//传入状态管理器，可通过管理器中的set方法设置下一个状态，也可以添加设置上一个状态的方法
		state.handle(this);
	}
}
