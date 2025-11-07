package project;

public class TestProject {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "이수인";
		p1.age = 12;
		p1.sex = "에겐녀";
		p1.say();
	}

}


class Person {
	String name;
	int age;
	String sex;
	int num1;
	int num2;
	
	void say() {
		System.out.printf("이름은 %s이고, 나이는 %d이고, 성별은 %s 입니다", name, age, sex);
	}
}