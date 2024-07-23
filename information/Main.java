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