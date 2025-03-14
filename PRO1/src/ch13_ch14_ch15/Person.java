package ch13_ch14_ch15;

import java.io.Serializable;

//이 클래스는 Serializable 인터페이스를 구현클래스이다
class Person implements Serializable {
	/*serialVersionUID는 클래스의 버전을 나타내며, 
	 직렬화된 객체의 호환성을 유지하는 데 사용 
	 클래스가 변경되면 이 값을 변경하여 이전 버전과의 호환성을 관리할 수 있다
	 역직렬화 시 클래스의 구조가 변경되면 
	 ClassNotFoundException이 발생할 수 있으므로, 클래스의 버전을 관리*/
    private static final long serialVersionUID = 1L; // 직렬화 버전 UID

    private String name; // 이름
    private int age; // 나이

    //생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

 
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

