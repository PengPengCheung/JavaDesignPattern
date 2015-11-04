package adapterpattern;

public class AdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target classTarget = new ClassAdapter();
		System.out.println("classTarget:");
		classTarget.targetMethod();//调用类适配器中的方法，可以调用Source类中的方法，实现适配
		Target objectTarget = new ObjectAdapter();//创建ObjectAdapter的时候，同时在构造方法中创建了Source实例
		System.out.println("objectTarget:");
		objectTarget.targetMethod();//调用对象适配器的方法，可以调用source类中的方法
	}

}
