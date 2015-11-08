package lod;


public class CorrectExampleTeacher {
	/*
	 * CorrectExampleTeacher和GroupLeader属于依赖关系，是朋友关系的一种，只与自己的直接朋友通讯
	 * 而且这个类没有和非朋友关系的Girl类有耦合，因此满足迪米特法则
	 * 如果要和Girl类进行通讯，则必须通过GroupLeader作为沟通的桥梁，否则违反了迪米特法则
	 * */
	public void command(GroupLeader leader){
		
		leader.countGirls();
	}
}
