package lod;

public class CouplingDemo {
	private Girl association = new Girl();//关联关系，或者 private Girl association; 也是关联关系
	private Girl[] aggregation;//聚合关系
	private Girl composition;//组合关系
	
	/*
	 * 组合关系：在对象实例化的时候也跟着具有组合关系的类也跟着实例化
	 * */
	public CouplingDemo(Girl composition){
		this.composition = composition;
	}
	
	/*
	 * 依赖关系：
	 * 具有依赖关系的类作为方法的入口参数传入，Girl与这个类为依赖关系
	 * */
	public void dependencyMethod(Girl girl){
		System.out.println("这是依赖关系的方法");
	}
	
	/*
	 * 聚合关系：
	 * 用set方法可实现聚合关系的整体和可分离
	 * */
	public void setAggregation(Girl[] aggregation){
		this.aggregation = aggregation;
	}
	
	
}
