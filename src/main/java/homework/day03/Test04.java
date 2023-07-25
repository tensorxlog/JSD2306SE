package homework.day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 生成10个0-100的随机数并存入一个List集合中并输出
 * 之后将集合第3到第6个元素翻转并输出
 * 
 * @author Xiloer
 *
 */
public class Test04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int rand = (int) Math.round(100 * Math.random());
            list.add(rand);
        }
        System.out.println(list);
        Collections.reverse(list.subList(2, 6));
        System.out.println(list);
    }
}
