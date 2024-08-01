<h1><a href="https://www.acmicpc.net/problem/10870">✔️10870번: 피보나치 수 5 BronzeⅡ </a></h1>

### 1.문제
```
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.


입력

첫째 줄에 정수 N(0 ≤ N ≤ 20)이 주어진다.


출력

첫째 줄에 N!을 출력한다.
```


### 2. 접근
```
1. 수를 입력하면 입력한 수 N!을 출력하는 함수를 만들어준다.
```


### 3. 풀이 
```
1. 팩토리얼 구조 파악

  0! = 1
  1! = 1 * 0!(1)
  2! = 2 * 1!(1x1)
  3! = 3 * 2!(2x1)
  4! = 4 * 3!(3x2x1)


2. 팩토리얼 함수 구현 (17부터 int가 못담기 때문에 함수 출력을 long으로 해줘야 오류 안생김)

  public static long factorial(int n){

        if(n == 0) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
```



### 4. 코드
```
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;


public class Main {

    public static long factorial(int n){

        if(n == 0) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(factorial(n)));
       
        bw.flush();
        bw.close();
        br.close();
    }
}
```
