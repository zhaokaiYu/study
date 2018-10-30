package top.yuzktyu.java8.Interface;
/*
* @author yuzk
* @date 2018年10月27日 下午3:14:49
* @version 1.0
*/
interface InterTest1 {
	static void test1(){
		System.out.println("接口静态方法执行。。。");
	}
	default void test2(){
		System.out.println("接口InterTest1默认方法执行。。。");
	}
}
interface InterTest2{
	default void test2(){
		System.out.println("接口InterTest2默认方法执行。。。");
	}
}
// 实现类有多个继承，有相同方法，实现类中可以通过特殊的语法指定要访问哪个接口的方法，在实现类中重写默认方法
class InterMainTest implements InterTest2,InterTest1{
	@Override
	public void test2() {
		InterTest2.super.test2();
	}
}
public class InterTest{
	
	public static void main(String[] args) {
		InterMainTest mainTest = new InterMainTest();
		mainTest.test2();
	}
}
// @FunctionalInterface 注解  接口只能有一个抽象方法
@FunctionalInterface
interface InterTest3{
	void test1();
}
