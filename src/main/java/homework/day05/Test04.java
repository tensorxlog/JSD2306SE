package homework.day05;

import java.io.File;
import java.util.Scanner;

/**
 * 改错练习:
 * 
 * 程序启动后要求用户输入一个关键字，然后列出当前项目下所有
 * 名字中包含该关键字的子项
 * 
 * 单词记一记:
 * key  计算机中为"关键"的含义，不译为钥匙
 * dir  是单词directory的缩写，目录的意思
 * list 列表
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入关键字:");
		String key = s.nextLine();
		//定位当前目录
		File dir = new File(".");
		//判断是否为目录
		if(dir.isDirectory()) {
			//获取该目录下所有子项
			File files[] = dir.listFiles();
			for(int i = 0; i < files.length; i++) {
				//获取每一个子项的名字
				String fileName = files[i].getName();
				//判断名字中是否包含key的内容
				if(fileName.contains(key)) {
					//包含就输出这个名字
					System.out.println(fileName);
				}
			}
		}
	}
}







