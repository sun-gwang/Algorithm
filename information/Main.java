import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {

    // 2 = 피보나치(1) + 피보나치(0) = 1
    // 3 = 피보나치(2) + 피보나치(1) = 2
    // 4 = 피보나치(3) + 피보나치(2) = 3
    // 5 = 피보나치(4) + 피보나치(2) = 5
    // 6 = 피보나치(5) + 피보나치(4) = 8
    // 7 = 피보나치(6) + 피보나치(5) = 13
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