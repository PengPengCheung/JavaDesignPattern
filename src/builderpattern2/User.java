package builderpattern2;

public class User {
	private String name;
	private int age;
	private String phone;
	
	//ͨ��һ��Builder������������ֵ������һ���Զ�User�����Խ��и�ֵ
	//����User�Ĺ��췽�������private����ζ�Ų������ڿͻ��˴���User���󣬱���ͨ���佨����Builder������
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
	
	//ע�ⶨ���static�������޷���Userûʵ����ǰ�������UserBuilder�ڲ�������User���й���
	public static class UserBuilder implements Builder {
		private String name;
		private int age;
		private String phone;

		public UserBuilder() {
			// TODO Auto-generated constructor stub
		}
		
		//ͨ��build������User�Ĺ��췽�����ж���ע��
		@Override
		public User build() {
			// TODO Auto-generated method stub
			User user = new User(this);
			return user;
		}
		
		//ͨ�����µ�����������Builder�����Խ��и�ֵ��Ȼ�󷵻�Builder�Ķ���
		//ʵ���Ͼ����ȶԽ����������Ը�ֵ��Ȼ��ͨ��������Я�����ݴ���User �У�����ý�������build������User����ʵ����
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

