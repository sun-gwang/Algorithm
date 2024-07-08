
<h1><a href="https://www.acmicpc.net/problem/1764">✔️1764번: 듣보잡 SILVERⅣ </a></h1>

### 1.문제
```
김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다. 듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.

출력
듣보잡의 수와 그 명단을 사전순으로 출력한다.
```

### 2. 접근
```
1. 중복되는 사람들을 찾아 내야 하니 모든 사람들을 넣을 HashSet이 필요하다.(Set은 add 할 때 중복을 검사하여 boolean을 리턴한다.)

2. 중복되는 사람들을 넣을 List가 필요하다.
```

### 3. 풀이
```
1. 보도 못한 사람을 Set에 넣을 때 false라면, 중복이니 중복된 사람들을 넣을 List에 넣어준다.

2. 사전순 정렬이니 Collections.sort()를 사용하여 정렬해준다.
```

### 4. 코드
```

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;



public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = reader.readLine().split(" ");

        // 듣도 못한 사람 갯수
        int noListen = Integer.parseInt(input[0]);
        // 보도 못한 사람 갯수
        int noSaw = Integer.parseInt(input[1]);

        // 사람들 저장 Set
        HashSet<String> people = new HashSet<>();

        // 중복 사람들 저장
        ArrayList<String> answer = new ArrayList<>();

        for(int i=0; i<noListen; i++){
            String a = reader.readLine();
            people.add(a);
        }

        for(int i=0; i<noSaw; i++){
            String b = reader.readLine();
            Boolean a = people.add(b);

            if(!a){
                answer.add(b);
            }
        }
        
        Collections.sort(answer);
        bw.write(answer.size() + "\n");

        for (String name : answer) {
            bw.write(name+"\n");
        }
        bw.flush();
        bw.close();
        reader.close();
    }
}
```
