<h1><a href="https://www.acmicpc.net/problem/28417">✔️28417번: 스케이트보드 BRONZEⅢ</a></h1>

## 1. 문제
```
2020년부터 올림픽 정식 종목으로 포함된 스케이트보드는 스트리트와 파크 종목으로 나뉜다. 그 중 스트리트는 계단, 난간, 레일, 경사면 등 다양한 구조물을 활용해 기술을 구사하는 종목이다.
스트리트 종목의 채점 방식은 다음과 같다.

각 선수는 두 차례의 런, 다섯 차례의 트릭 연기를 수행해 각각 
0부터 100 사이의 점수를 받는다.
두 차례의 런에서 받은 최고 점수와 다섯 차례의 트릭 연기를 통해 받은 점수 중 상위 2개의 점수, 총 3개의 점수를 더한 값이 최종 점수가 된다.
최종 점수가 가장 높은 사람을 우승자로 정한다. 단, 최고 득점자가 여러 명이면 공동 우승으로 한다.
출전한 선수들의 점수표가 주어졌을 때, 우승자의 최종 점수를 구해 보자.

입력
첫째 줄에 사람의 수 N이 주어진다.
둘째 줄부터 N 개의 줄에 걸쳐 2개의 런, 5개의 트릭 점수를 나타내는 정수 7개가 공백으로 구분되어 순서대로 주어진다.

출력
첫째 줄에 우승자의 최종 점수를 출력한다.
```
## 2. 접근
```
2개의 런 점수와 5개의 트릭 점수 그리고 선수들의 최종 점수를 저장 할 배열이 필요 할 것이다. 그리고 런 점수와 트릭점수를 정렬하여
런 점수는 가장 큰 1개, 트릭점수는 가장 큰 두개를 더해주고 각각 선수들 점수 배열에 넣어주어 정렬하여, 가장 높은 점수를 출력한다.
```

## 3.
```
배운점: 
1. 공백을 기준으로 입력 받고 싶을 때 ```StringTokenizer st = new StringTokenizer(reader.readLine());``` 을 사용하자
2. Arrays.sort(배열)을 하면 오름차순으로 정렬된다.

```

## 4. 풀이!
```
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 사람 수 입력
        //System.out.print("사람 수를 입력하세요: ");
        int people = Integer.parseInt(reader.readLine());

        // 각 사람의 런 점수와 트릭 점수를 저장할 배열
        int[] scores = new int[people];

        // 사람 수 만큼 점수 출력
        for (int i = 0; i < people; i++) {
            //System.out.println("사람 " + (i + 1) + "의 점수를 입력하세요 (7개의 숫자를 공백으로 구분하여 입력):");

            // 입력 받은 문자열을 StringTokenizer를 사용하여 공백을 기준으로 분리
            StringTokenizer st = new StringTokenizer(reader.readLine());

            // 두 차례의 런 점수 입력 (첫 번째와 두 번째)
            int[] run = new int[2];
            for (int j = 0; j < 2; j++) {
                run[j] = Integer.parseInt(st.nextToken());
                
            }

            // 두 차례의 런 점수 중 더 높은 점수 선택
            int trickHigh = Math.max(run[0], run[1]);

            // 다섯 차례의 트릭 점수 입력 (세 번째부터 일곱 번째)
            int[] trick = new int[5];
            for (int j = 0; j < 5; j++) {
                trick[j] = Integer.parseInt(st.nextToken());
            }

            // 트릭 점수 오름차순 정렬
            Arrays.sort(trick);

            // 최종 점수 계산
            int sumScore = trickHigh + trick[3] + trick[4];
            
            // 최종 점수를 scores 배열에 저장
            scores[i] = sumScore;
        }

         Arrays.sort(scores);

        // 우승자의 점수 출력
        System.out.println(scores[people-1]);
    }
}
  ```

