package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	//ͨ�������ķ�ʽ������һ��Component�����������Component��Leaf��Composite��ͳһ
	//��˷���Composite���Leaf�඼������Ϊ���list��Ԫ��
	List<Component> list = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component c) {
		// TODO Auto-generated method stub
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		// TODO Auto-generated method stub
		list.remove(c);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		for (int i = 0; i < depth; i++) {
			System.out.print("-");
		}
		System.out.println(name);
		for (Component c : list) {
			c.display(depth + 2);
		}
	}

}
