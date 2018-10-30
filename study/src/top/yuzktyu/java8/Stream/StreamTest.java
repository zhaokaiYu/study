package top.yuzktyu.java8.Stream;
/*
* @author yuzk
* @date 2018年10月27日 下午5:04:10
* @version 1.0
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest {
	static List<Person> createPeople(){
		List<Person> list = new ArrayList<>();
		Person p1 = new Person("张飞",48,Person.Sex.MAIL,1.8);
		Person p2 = new Person("刘备",32,Person.Sex.MAIL,1.7);
		Person p3 = new Person("关羽",45,Person.Sex.MAIL,1.9);
		Person p4 = new Person("诸葛亮",34,Person.Sex.MAIL,1.6);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		return list;
	}
	public static void main(String[] args) {
		List<Person> people = createPeople();
		Stream<Person> stream = people.stream();
		stream.forEach(p->System.out.println(p.toString()));
	}
}


