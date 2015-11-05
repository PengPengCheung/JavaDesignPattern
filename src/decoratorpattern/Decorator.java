package decoratorpattern;

/*
 * 装饰者类既需要继承Component类，也需要组合Component类
 * 继承是为了可以一直传入被装饰的对象，如果仅仅注入Component类并不能一直往装饰对象添加新功能
 * 注入Component类是为了可以调用Component基类的Operation方法，实现运行时多态
 * */
public abstract class Decorator extends Component{//关键继承，如果不继承Component，Decorator的子类就无法用setComponent一层一层地装饰了
	
	private Component component;
	
	//可换成构造方法注入Component类
	//此Component类的对象可以是被装饰了很多层的对象A，然后在注入这个对象A的decorator子类operation方法中调用它的Operation方法
	public void setComponent(Component component){
		this.component = component;
	}
	
	public Component getComponent(){
		return this.component;
	}
	
	//可写成operation方法也可以用其他方法名，但是其内部要有component的operation方法
	//此方法被其子类在未实现的Operation方法中进行调用，实际上是调用了传入的component对象的operation方法
	public void decorate() {
		// TODO Auto-generated method stub
		if(component!=null){
			component.Operation();
		}
	}

}
