## 28417번 스케이트 문제
배운점: 
1. 공백을 기준으로 입력 받고 싶을 때 ```StringTokenizer st = new StringTokenizer(reader.readLine());``` 을 사용하자
2. Arrays.sort(배열)을 하면 오름차순으로 정렬된다.

## ✔️풀이!
```
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 사람 수 입력
        System.out.print("사람 수를 입력하세요: ");
        int people = Integer.parseInt(reader.readLine());

        // 각 사람의 런 점수와 트릭 점수를 저장할 배열
        int[] scores = new int[people];

        System.out.println(" ");

        // 사람 수 만큼 점수 출력
        for (int i = 0; i < people; i++) {
            System.out.println("사람 " + (i + 1) + "의 점수를 입력하세요 (7개의 숫자를 공백으로 구분하여 입력):");

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

        // 입력받은 최종 점수들 출력
        System.out.println("최종 점수들: " + Arrays.toString(scores));
    }
  ```

