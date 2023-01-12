package arrayListTask;

public class Love {
	public static int sequence;
	int num;
	String name;
	int age;
	
	{
		num = ++sequence;
	}
	
	public Love() {;}

	public int getNum() {
		return num;
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

	@Override
	public String toString() {
		return "Love [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
