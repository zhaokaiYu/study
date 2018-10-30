package top.yuzktyu.java8.Stream;

import java.util.ArrayList;
import java.util.List;


/*
* @author yuzk
* @date 2018年10月30日 下午9:45:33
* @version 1.0
*/
public class FilterTest {
	public static void main(String[] args) {
		List<Person> people = createPeople();
		people.stream()
			.filter(p->p.getGender()==Person.Sex.FEMALE)
			.forEach(p->System.out.println(p));
	}
	static List<Person> createPeople(){
		List<Person> list = new ArrayList<>();
		Person p1 = new Person("张飞",48,Person.Sex.MAIL,1.8);
		Person p2 = new Person("刘备",32,Person.Sex.MAIL,1.7);
		Person p3 = new Person("关羽",45,Person.Sex.MAIL,1.9);
		Person p4 = new Person("小乔",34,Person.Sex.FEMALE,1.6);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		return list;
	}
}

