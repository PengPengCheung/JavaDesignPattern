package visitorpattern;

/*
 * 元素类，一般要用访问者模式的时候，元素类接口及其具体实现类应该是基本确定不变的数据结构
 * 如果元素类及其子类经常变化的话，定义在这个元素类中的Visitor类中的方法也要经常变化，而且每一个与具体实现类有关的Visitor都要改变，变动太大，不利于维护
 * 因此访问者模式适用于已确定数据结构并且不经常变化的系统，而不适用于经常更改数据结构的系统
 * */
public abstract class Element {
	public abstract void accept(Visitor visitor);
}
