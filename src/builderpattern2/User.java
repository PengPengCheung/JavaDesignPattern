package builderpattern2;

public class User {
	private String name;
	private int age;
	private String phone;
	
	//通过一个Builder对象传入多个属性值，可以一次性对User的属性进行赋值
	//而且User的构造方法定义成private，意味着不可以在客户端创建User对象，必须通过其建造器Builder来构造
	private User(UserBuilder builder){
		this.name = builder.name;
		this.age = builder.age;
		this.phone = builder.phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//注意定义成static，否则无法在User没实例化前调用这个UserBuilder内部类来对User进行构建
	public static class UserBuilder implements Builder {
		private String name;
		private int age;
		private String phone;

		public UserBuilder() {
			// TODO Auto-generated constructor stub
		}
		
		//通过build方法对User的构造方法进行对象注入
		@Override
		public User build() {
			// TODO Auto-generated method stub
			User user = new User(this);
			return user;
		}
		
		//通过以下的三个方法对Builder的属性进行赋值，然后返回Builder的对象。
		//实际上就是先对建造器的属性赋值，然后通过建造器携带数据传入User 中，最后用建造器的build方法对User进行实例化
		public UserBuilder Name(String name){
			this.name = name;
			return this;
		}
		
		public UserBuilder Age(int age){
			this.age = age;
			return this;
		}
		
		public UserBuilder Phone(String phone){
			this.phone = phone;
			return this;
		}
	}
}

