package homework.day01.answer;
/**
 * 修改下面代码的错误
 * 
 * 下面代码完成的功能是输出字符串中的每一个字符
 * 
 * @author Xiloer
 *
 */
public class Test03 {
    //缺少main方法
    public static void main(String[] args) {
        //String的类名拼写错误
//		string str = "hello world! i love java!";
        String str = "hello world! i love java!";
        //1:字符串的length是一个方法
        //2:循环体的作用域不对
        //循环的下标应当是<length().
//        for(int i = 0;i<=str.length;i++) {}
        for(int i = 0;i<str.length();i++) {
            //3:charAt方法是字符串的方法
//            char c = i.charAt(i);
            char c = str.charAt(i);
//            System.err.println(c);
            System.out.println(c);
        }
    }
}






