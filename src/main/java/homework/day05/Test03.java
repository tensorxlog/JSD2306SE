package homework.day05;

import java.io.*;

/**
 * 将当前目录下的所有文件都复制一份，复制的文件命名为:原
 * 文件名_cp.后缀
 * 比如原文件为:test.dat
 * 复制后的文件为:test_cp.dat
 * 
 * 
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) throws IOException {
		File dir = new File(".");
		File[] files = dir.listFiles(file -> file.isFile());
		for (File file: files) {
			// 获取新文件名
			String oldName = file.getName();
			String newName;
			int dotIndex = oldName.lastIndexOf(".");
			if (dotIndex == -1) {
				newName = oldName + "_cp";
			} else {
				newName = oldName.substring(0, dotIndex) + "_cp" + oldName.substring(dotIndex);
			}

			// 复制文件
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(newName);
			byte[] buffer = new byte[1024 * 10];
			int d;
			while ((d = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, d);
			}
			fis.close();
			fos.close();
		}
	}
}




/**
 * 思路:
 * 分为几部分考虑.
 * 第一个是要获取到当前目录中的所有文件(思考哪个API可以解决)
 * 第二个是获取到的每一个文件都要复制(复制用什么API)
 * 第三个是复制的文件名，如何重新组建xxx_cp.xxx的名字?
 *      这里要将原文件名拆开后想办法拼接_cp.
 */


