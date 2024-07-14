<h1><a href="https://www.acmicpc.net/problem/1080">✔️1080번: 행렬 SILVERⅠ </a></h1>

### 1.문제
```
0과 1로만 이루어진 행렬 A와 행렬 B가 있다. 이때, 행렬 A를 행렬 B로 바꾸는데 필요한 연산의 횟수의 최솟값을 구하는 프로그램을 작성하시오.

행렬을 변환하는 연산은 어떤 3×3크기의 부분 행렬에 있는 모든 원소를 뒤집는 것이다. (0 → 1, 1 → 0)

입력
첫째 줄에 행렬의 크기 N M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 행렬 A가 주어지고, 그 다음줄부터 N개의 줄에는 행렬 B가 주어진다.

출력
첫째 줄에 문제의 정답을 출력한다. 만약 A를 B로 바꿀 수 없다면 -1을 출력한다.
```

### 2. 접근
```
1. 행렬의 크기 N,M이 주어지는데 크기가 N인 행렬M개의 행렬 A, 크기가 똑같은 행렬 B가 주어진다고 되어있는데,
 쉽게 2차원 행렬로 접근하면 된다.

2. 2차원 행렬 A를 B와 같게 만들기 위해 3X3의 행렬을 뒤집어야 하는데, 요소를 처음부터 확인하여 뒤집어주면 된다.

3. 뒤집어 줄 때 오른쪽 끝으로 부터 2개 이상 떨어져야 뒤집을 수 있으므로 모두 확인하지 않아도 된다.
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
import java.util.StringTokenizer;


public class Main {

    // n개의 행렬 A가 주어지고, 바꿔야할 행렬 n개 B가 주어진다.
    // 행렬의 크기는 m
    static int n, m;

    static int[][]A;
    static int[][]B;

    // 행렬을 뒤집는 함수
    // 선택된 좌표 +2까지 모두 뒤집어야 함
    public static void change(int x, int y) {
        for(int i=x; i<x+3; i++){
            for(int j=y; j<y+3; j++){
              // 1 - 행렬의 값 하면 값이 무조건 0,1이므로 뒤집히는 효과
              A[i][j] = 1-A[i][j];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n= Integer.parseInt(st.nextToken());
        m= Integer.parseInt(st.nextToken());

        A = new int[n][m];
        B = new int[n][m];

        // 행렬 A 입력
        for(int i= 0; i<n; i++){
            String arr = br.readLine();
            for(int j=0; j<m; j++){
                A[i][j] = Integer.parseInt(String.valueOf(arr.charAt(j)));
            }
        }
        // 행렬 B 입력
        for(int i= 0; i<n; i++){
            String arr = br.readLine();
            for(int j=0; j<m; j++){
                B[i][j] = Integer.parseInt(String.valueOf(arr.charAt(j)));
            }
        }

        // 횟수 세기
        int count = 0;

        // 행렬 비교하기
        boolean isSame = true;

        // (0,0)부터 차례로 A와 B가 다른지 확인 후 다르면 행렬 뒤집기
        for(int i=0; i<=n-3; i++){
            for(int j=0; j<=m-3; j++){
                if(A[i][j] != B[i][j]){
                    change(i, j);
                    count++;
                }
            }
        }

        // 행렬 A와 B 비교
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(A[i][j] != B[i][j]){
                    isSame = false;
                    break;
                }
            }
            if(!isSame){
                break;
            }
        }
        if(isSame){
            bw.write(String.valueOf(count));
        }else{
            bw.write("-1");
        }

        bw.flush();
        bw.close();
        br.close();
        
    }


}
```
