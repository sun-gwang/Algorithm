## 자료구조 내용정리

## BufferedReader 사용 방법
```
public class test2 {
  public static void main(String[] args) {

    // BufferedReader는 try-catch 써줘야 하는 것 같음

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
    String name = reader.readLine();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
```
