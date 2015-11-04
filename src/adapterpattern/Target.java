package adapterpattern;

public interface Target {//现有Source和Target两个类，方法不同，无法适配，因此需要一个适配器来让两个一起适配
	public void targetMethod();
}
