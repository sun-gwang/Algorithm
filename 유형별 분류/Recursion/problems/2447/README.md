<h1><a href="https://www.acmicpc.net/problem/25501">✔️25501번: 재귀의 귀재 </a></h1>

### 1.문제
```
재귀적인 패턴으로 별을 찍어 보자. N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.

크기 3의 패턴은 가운데에 공백이 있고, 가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.

***
* *
***
N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 예를 들어 크기 27의 패턴은 예제 출력 1과 같다.


입력

첫째 줄에 N이 주어진다. N은 3의 거듭제곱이다. 즉 어떤 정수 k에 대해 N=3k이며, 이때 1 ≤ k < 8이다.


출력

첫째 줄부터 N번째 줄까지 별을 출력한다.
```


### 2. 접근
```

```


### 3. 풀이 
```

```



### 4. 코드
```
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));       
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 별을 찍을 배열 선언
    static char[][] arr;

    static void draw(int x, int y, int n){
        int size = n/3;
        // 현재 x,y 좌표에 별 찍고 종료
        if(n==1){
            arr[x][y] ='*';
            return;
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                // 중앙엔 비워둠
                if(!(i==1 && j==1)){
                    draw(x+(i*size), y+(j*size), size);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
      
        int n = Integer.parseInt(br.readLine());
        
        // 크기가 정사각형이다.
        arr = new char[n][n];

        // 전부 빈 상태로 초기화 후 별을 찍어준다.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = ' ';
            }
        }

        // 별 찍기
        draw(0,0,n);

        for(int i=0; i<n; i++){
            bw.write(String.valueOf(arr[i])+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
```
