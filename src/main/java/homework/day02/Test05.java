package homework.day02;

import java.util.Scanner;

/**
 * 程序需求:
 * 程序启动后，实例化一个Person，然后要求用户输入用户名
 * 和年龄.并加以验证:
 * 名字至少一个字符，否则输出:姓名不能为空!
 * 年龄必须是0-100之间的数字，否则输出:年龄不合法!
 * 
 * 都输入正确时最后输出该用户信息
 * 
 * 将下面写好的代码解除注释改正里面的错误使得程序可以正常
 * 运行。
 * 异常记一记:
 * 下面会出现的每一种异常先翻译异常的名字，然后解决该异常后
 * 思考是什么原因引起的错误并在注释中标注出来
 *
 * @author Xiloer
 *
 */
public class Test05 {
	
	
	public static void main(String[] args) {
		Person p = new Person();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入姓名:");
		String name = scanner.nextLine();
		if(name.length()==0) { //会出现空指针异常，因为当Person被创建时它的name属性是null，不能对null调用length()方法
			System.out.println("姓名不能为空!");
			return;
		}else{
			p.setName(name);
		}
		System.out.println("请输入年龄:");
		String ageStr = scanner.nextLine(); //当输入的值不是整数时会出现输入不匹配异常
		if (!ageStr.matches("[0-9]+")) {
			System.out.println("输入不合法！");
			return;
		}
		int age = Integer.parseInt(ageStr);
		if(age < 0 || age > 100) {
			System.out.println("年龄不合法!");
			return;
		}else{
			p.setAge(age);
		}

		System.out.println("姓名:"+p.getName());
		System.out.println("年龄:"+p.getAge());
	}

	
}

class Person{
	private String name;
	private int age;
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
}