<h1><a href="https://www.acmicpc.net/problem/1417">✔️1417번: 국회의원 선거 SILVERⅤ</a></h1>

### 1. 문제
```
다솜이는 사람의 마음을 읽을 수 있는 기계를 가지고 있다. 다솜이는 이 기계를 이용해서 2008년 4월 9일 국회의원 선거를 조작하려고 한다.

다솜이의 기계는 각 사람들이 누구를 찍을 지 미리 읽을 수 있다. 어떤 사람이 누구를 찍을 지 정했으면, 반드시 선거때 그 사람을 찍는다.

현재 형택구에 나온 국회의원 후보는 N명이다. 다솜이는 이 기계를 이용해서 그 마을의 주민 M명의 마음을 모두 읽었다.

다솜이는 기호 1번이다. 다솜이는 사람들의 마음을 읽어서 자신을 찍지 않으려는 사람을 돈으로 매수해서 국회의원에 당선이 되게 하려고 한다. 다른 모든 사람의 득표수 보다 많은 득표수를 가질 때, 그 사람이 국회의원에 당선된다.

예를 들어서, 마음을 읽은 결과 기호 1번이 5표, 기호 2번이 7표, 기호 3번이 7표 라고 한다면, 다솜이는 2번 후보를 찍으려고 하던 사람 1명과, 3번 후보를 찍으려고 하던 사람 1명을 돈으로 매수하면, 국회의원에 당선이 된다.

돈으로 매수한 사람은 반드시 다솜이를 찍는다고 가정한다.

다솜이가 매수해야하는 사람의 최솟값을 출력하는 프로그램을 작성하시오.

입력 : 첫째 줄에 후보의 수 N이 주어진다. 둘째 줄부터 차례대로 기호 1번을 찍으려고 하는 사람의 수, 기호 2번을 찍으려고 하는 수, 이렇게 총 N개의 줄에 걸쳐 입력이 들어온다. N은 50보다 작거나 같은 자연수이고, 득표수는 100보다 작거나 같은 자연수이다.
```

### 2. 접근
```
  가장 큰 득표를 한 후보의 표를 매수하면서 가장 크게 만들어야 함
```

### 3. 풀이
```
1. 가장 많은 표를 받은 사람을 가져오기 위해 우선순위 큐를 내림차순 정렬하여 맨 앞이 가장 큰 수가 오게 한다
  -> Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
     이렇게 하면 queue.peek()가 가장 큰 득표수이다.

2. while문을 이용해 매수 횟수를 세어주고, 다솜이가 가장 큰 수가 될 때까지 루프시켜준다.
  -> while(dasom <= queue.peek())

3. 가장 큰 득표를 한 후보의 표를 매수하면서 다솜이의 득표를 +1하며 반복한다.
  ->   count++;
       queue.offer(queue.poll()-1);
       dasom++;
```

### 4. 코드
```

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;



public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 사람 수 입력
        System.out.print("후보의 수를 입력하세요: ");
        int people = Integer.parseInt(reader.readLine());

        System.out.print("다솜이의 득표 수: ");
        int dasom = Integer.parseInt(reader.readLine());

        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<people-1; i++){
            queue.offer(Integer.parseInt(reader.readLine()));
        }

        int count = 0;

       while(dasom <= queue.peek()){
            count++;
            queue.offer(queue.poll()-1);
            dasom++;
            
       }

        bw.write("매수 횟수: "+count+"\n");
        bw.flush();
        bw.close();

        reader.close();
    }   
}
```
