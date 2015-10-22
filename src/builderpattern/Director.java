package builderpattern;

public class Director {
	Builder builder;
	
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}
	
	//��ConcreteBuilder�ﶨ���˽��첿���ķ���������û�б����ã����Ҳ��ѽ��첿���ķ�����¶�ڿͻ�������
	//�������������������Builder��Ľ��췽��
	//���԰���һ����˳���ţ�Ҳ����������һЩ����֮���ٽ��жԾ���Ĳ�Ʒ�������н���
	public void construct(String head, String body, String foot){
		builder.buildHead(head);
		builder.buildBody(body);
		builder.buildFoot(foot);
	}

}
