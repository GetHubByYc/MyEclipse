package Bean;

public class Person {
	private String name;
	private int age;
	private String addr;
	private String sex;

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getAddr(){
		return addr;
	}
	public String getSex(){
		return sex;
	}
}
