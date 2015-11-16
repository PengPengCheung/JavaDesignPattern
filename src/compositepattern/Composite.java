package compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	//通过关联的方式，管理一组Component对象，其中这个Component是Leaf和Composite的统一
	//因此凡是Composite类和Leaf类都可以作为这个list的元素
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
