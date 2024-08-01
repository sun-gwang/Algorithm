<h1><a href="https://www.acmicpc.net/problem/10870">✔️10870번: 피보나치 수 5 BronzeⅡ </a></h1>

### 1.문제
```
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.


입력

첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.


출력

첫째 줄에 n번째 피보나치 수를 출력한다.
```

### 2. 접근
```
1. 재귀를 사용하여 자리수를 입력하면 피보나치의 해당 자리 수 값을 출력하는 함수를 만들어준다.
```

### 3. 풀이
```
1. 피보나치의 구조를 파악한다

  - 피보나치 수열은 자신의 전(n-1), 전전(n-2)의 수를 더하는 수열이다.

  - 0번 = 0
    1번 = 1
    2번 = 피보나치(1) + 피보나치(0) = 1
    3번 = 피보나치(2) + 피보나치(1) = 2
    4번 = 피보나치(3) + 피보나치(2) = 3
    5번 = 피보나치(4) + 피보나치(2) = 5
    6번 = 피보나치(5) + 피보나치(4) = 8
    7번 = 피보나치(6) + 피보나치(5) = 13


2. 재귀를 이용한 피보나치 함수 구현

public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if (n==1) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
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


public class Main {

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if (n==1) {
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int result = fibonacci(n);
        bw.write(String.valueOf(result));
       
        bw.flush();
        bw.close();
        br.close();
    }
}
```

