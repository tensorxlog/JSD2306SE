package homework.day01;

import java.util.Scanner;

/**
 * 改正下面代码的错误
 * 
 * 代码要实现的功能:要求用户输入一个网址，格式如:
 * www.baidu.com
 * 然后判断根据域名判断是百度(baidu)或者达内(tedu)或其他
 * 然后输出判断结果
 * 
 * 单词记一记:
 * start 开始
 * end 结束
 * 
 * 解决问题后，记录下来遇到的问题，以及解决办法
 * 
 * @author Xiloer
 *
 */
public class Test05 {
	public static void main(String[] args) {
		System.out.println("请输入一个网址:");
Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		//截取域名
	int start = line.indexOf(".");
	int end = line.indexOf(".",start);
		String name = line.substring(start,end);
		//判断域名是否为baidu
if(name=="baidu") {
	System.out.println("这是百度网站");
	//判断域名是否为tedu	
}else if(name=="tedu") {
			System.out.println("这是达内网站");
	}else {
			System.out.println("这是其他网站");}
		
	}
}






