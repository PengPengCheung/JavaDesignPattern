package statepattern;

/* 
 * ״̬�����������ó�ʼ״̬���õ���ǰ״̬������ͨ���������Context����������һ��״̬
 * 
 */ 
public class Context {
	private State state;
	
	public State getState() {
		return state;
	}

	//���õ�ǰ״̬
	public void setState(State state) {
		this.state = state;
		System.out.println("set State " + state.toString());
	}

	
	//����ı����ڵ�״̬��ʵ����ͨ��state�е�handle������״̬�������á�
	public void Request(){
		//����״̬����������ͨ���������е�set����������һ��״̬��Ҳ�������������һ��״̬�ķ���
		state.handle(this);
	}
}
