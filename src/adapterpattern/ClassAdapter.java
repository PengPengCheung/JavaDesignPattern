package adapterpattern;

/*
 * 类适配器，只为适配Source类的适配器，因为只能单重继承，所以类适配器没法对其他类进行适配
 * */
public class ClassAdapter extends Source implements Target {
	
	@Override
	public void targetMethod() {
		// TODO Auto-generated method stub
		sourceMethod();
	}

}
