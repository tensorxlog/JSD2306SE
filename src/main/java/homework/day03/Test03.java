package homework.day03;
/**
 * 生成10个0-100之间的不重复的随机数,并输出
 * @author Xiloer
 *
 */
public class Test03 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int rand = (int) Math.round(100 * Math.random());
			System.out.println(rand);
		}
	}
}
