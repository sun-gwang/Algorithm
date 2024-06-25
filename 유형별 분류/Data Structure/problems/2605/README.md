```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
  public static void main(String[] args) {
    System.out.print("사람수 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<>();
		
		int n = sc.nextInt();
		
		for(int i =0; i< n; i++) {
      System.out.print("번호뽑기 입력 : ");
			int k= sc.nextInt();
			list.add(i-k, i+1);
		}
		
		for(int m : list) {
			System.out.print(m + " ");
		}
	}
}
```
