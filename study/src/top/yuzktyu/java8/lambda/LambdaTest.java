package top.yuzktyu.java8.lambda;
/*
* @author yuzk
* @date 2018年10月27日 下午3:56:43
* @version 1.0
*/
public class LambdaTest {
	public static void main(String[] args) {
		// 匿名内部类方法
		LambdaInterface li = new LambdaInterface() {
			public void test(){
				System.out.println("匿名内部类实现");
			}
		};
		li.test();
		// lambda 表达式实现
		LambdaInterface li2 = () ->{
			System.out.println("使用Lambda表达式实现");
		};
		li2.test();
		// lambda 表达式简便方法
		// 方法体只有一句话  可以省略大括号  以及省略一个分号
		// 如果有返回值  return 也能省略
		LambdaInterface li3 =()-> System.out.println("使用Lambda表达式简便方法实现");
		li3.test();
		
		// 有参数
		// 参数不需要知道数据类型
		LambdaInterface2 li21 = (x)->{
			System.out.println("一个参数输出参数"+x);
		};
		li21.test(6);
		// 简便方法  参数列表只有一个参数  可以省略圆括号
		LambdaInterface2 li22 = x-> System.out.println("一个参数输出参数简便方法"+x);
		li22.test(6);
		
		LambdaInterface3 li31 = (i,j)->{
			System.out.println("两个参数"+i+"..."+j);
		};
		li31.test(5, 5);
		// 有返回值的方法
		LambdaInterface4 li41 = (b)->{
			b=b+10;
			return b;
		};
		System.out.println(li41.test(30));
		// 简便方法
		LambdaInterface4 li42 = b-> b+10;
		System.out.println(li42.test(10));
	}
}
// 没有参数没有返回值
interface LambdaInterface{
	void test();
}
// 一个参数 没有返回值
interface LambdaInterface2{
	void test(int i);
}
// 两个参数 没有返回值
interface LambdaInterface3{
	void test(int i,int j);
}
// 一个参数 有返回值
interface LambdaInterface4{
	int test(int i);
}
