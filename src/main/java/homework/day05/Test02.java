package homework.day05;

import java.io.File;
import java.io.FileFilter;
/**
 * 列出当前目录中所有名字包含s的子项。
 * 
 * 使用匿名内部类和lambda两种写法
 * 
 * 单词记一记:
 * FileFilter   文件过滤器
 * accept       接受
 * 
 * @author Xiloer
 *
 */
public class Test02 {
	public static void main(String[] args) {
		File dir = new File(".");

		// 使用lambda的写法
		File[] files = dir.listFiles(file -> file.getName().contains("s"));
		for (File file: files) {
			System.out.println(file.getName());
		}

		// 使用匿名内部类的写法
		File[] files1 = dir.listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				return pathname.getName().contains("s");
			}
		});
		for (File file: files1) {
			System.out.println(file.getName());
		}

	}
}
