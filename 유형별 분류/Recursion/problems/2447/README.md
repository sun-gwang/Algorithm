<h1><a href="https://www.acmicpc.net/problem/2447">✔️2447번: 별찍기 - 10 </a></h1>

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
1. 별찍기 구조 파악 


- n이 3일 경우

 -> 1x1 정사각형을 가운데 비워두고 1의 패턴으로 둘러 싼 형태

    ***
    * *
    ***


- n이 9일 경우

 -> 3x3 정사각형을 가운데 비워두고 3의패턴으로 둘러 싼 형태

    *********
    * ** ** *
    *********
    ***   ***
    * *   * *
    ***   ***
    *********
    * ** ** *
    *********


- n이 27일 경우

 -> 9x9 정사각형을 가운데 비워두고 9의 패턴으로 둘러 싼 형태

    ***************************
    * ** ** ** ** ** ** ** ** *
    ***************************
    ***   ******   ******   ***
    * *   * ** *   * ** *   * *
    ***   ******   ******   ***
    ***************************
    * ** ** ** ** ** ** ** ** *
    ***************************
    *********         *********
    * ** ** *         * ** ** *
    *********         *********
    ***   ***         ***   ***
    * *   * *         * *   * *
    ***   ***         ***   ***
    *********         *********
    * ** ** *         * ** ** *
    *********         *********
    ***************************
    * ** ** ** ** ** ** ** ** *
    ***************************
    ***   ******   ******   ***
    * *   * ** *   * ** *   * *
    ***   ******   ******   ***
    ***************************
    * ** ** ** ** ** ** ** ** *
    ***************************
```


### 3. 풀이 
```
1. 구조가 nxn의 정사각형 구조이므로 2차원 배열로 크기를 nxn으로 설정해준다.

 -  arr = new char[n][n];


2. 기본 뼈대가 되는 3의 패턴을 그리는 재귀 함수를 구현해준다.

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

 - n=3

    -> size=1이므로 (0,0)(1,0)(2,0)
                    (0,1)(1,1)(2,1)
                    (0,2)(1,2)(2,2) 에 1사이즈 별을 찍게 된다.

 - n=9

    -> size=3 이므로 (0,0)(3,0)(6,0)
                     (0,3)(3,3)(6,3)
                     (0,9)(3,9)(6,9) 에 3사이즈 별을 찍게 된다.

- n=27

    -> size=9 이므로 (0,0)(9,0)(18,0)
                     (0,9)(9,9)(18,9)
                     (0,18)(9,18)(18,18) 에 9사이즈 별을 찍게 된다
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
