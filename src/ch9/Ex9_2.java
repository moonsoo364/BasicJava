package ch9;

class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id ==((Person)obj).id;
		}
		else
			return false;
		
	}
	public Person(long id) {
		this.id = id;
	}
}

public class Ex9_2 {
	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);
		
		if(p1.equals(p2)){
			System.out.println("p1와 p2는 같은 사랍 입니다.");
		}else {
			System.out.println("p1와 p2는 다른 사랍 입니다.");
			
		}

}
}
