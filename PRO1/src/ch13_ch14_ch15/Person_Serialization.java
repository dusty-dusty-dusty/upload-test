package ch13_ch14_ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Person_Serialization {
	
	public static void main(String[] args) {
        //Person객체 생성
        Person person = new Person("Alice", 30);

        // Serialization: 객체를 파일에 저장
        /*writeObject 메서드를 호출하여 객체를 바이트 스트림으로 변환하고, 
          이를 파일에 저장*/
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
        	//객체를 직렬화하여 파일에 저장
            oos.writeObject(person); 
            System.out.println("Serialization 완료: " + person);
        } catch (IOException e) {
            e.printStackTrace(); //예외 발생 시 출력
        }

        // Deserialization: 파일에서 객체를 읽어오기
        //readObject 메서드를 호출하여 바이트 스트림을 객체로 변환
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject(); // 파일에서 객체를 역직렬화
            System.out.println("Deserialization 완료: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(); 
        }
    }
    
}

/*참고
try와 {} 사이에 있는 ()는 Java의 try-with-resources 구문을 사용하기 위함
=> 자원을 자동으로 관리하고, 사용이 끝난 후에 자원을 닫아주는 기능을 제공
==>try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser")))는 
ObjectOutputStream과 FileOutputStream을 생성하고, 
이 자원들이 사용이 끝난 후 자동으로 닫히도록 보장

*상세설명
1.자원 관리: ObjectOutputStream과 FileOutputStream은 
모두 java.lang.AutoCloseable 인터페이스를 구현. 
이 인터페이스를 구현한 객체는 사용이 끝난 후 자동으로 close() 메서드가 호출되어 자원이 해제. 
따라서, 명시적으로 close()를 호출할 필요가 없다.

2.코드 간결성: 추가적인 finally 블록을 작성할 필요가 없다.

3.예외 처리: 
try-with-resources 구문 내에서 발생하는 예외는 
catch 블록에서 처리할 수 있으며, 
자원 해제 과정에서 발생할 수 있는 예외도 자동으로 처리 */

/*아래는 try와 {} 사이에 있는 ()를 사용하지 않는 경우의 코드

ObjectOutputStream oos = null;
FileOutputStream fos = null;

try {
    fos = new FileOutputStream("person.ser");
    oos = new ObjectOutputStream(fos);
    
    // 객체를 직렬화하여 파일에 저장
    oos.writeObject(person); 
    System.out.println("Serialization 완료: " + person);
} catch (IOException e) {
    e.printStackTrace(); // 예외 발생 시 출력
} finally {
    // 자원 해제
    try {
        if (oos != null) {
            oos.close();
        }
        if (fos != null) {
            fos.close();
        }
    } catch (IOException e) {
        e.printStackTrace(); // 자원 해제 중 예외 발생 시 출력
    }
}
*/