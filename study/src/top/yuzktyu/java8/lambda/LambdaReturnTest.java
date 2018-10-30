package top.yuzktyu.java8.lambda;

import com.sun.org.apache.regexp.internal.recompile;

/*
* @author yuzk
* @date 2018年10月27日 下午4:37:48
* @version 1.0
*/

public class LambdaReturnTest {
	void re(LambdaReturn lr){
		int i = lr.test();
		System.out.println("返回值"+i);
	}
	public static void main(String[] args) {
		LambdaReturnTest lrt = new LambdaReturnTest();
		lrt.re(()->{return 14;});
		lrt.re(()->14);
 	}
}
interface LambdaReturn{
	int test();
}

