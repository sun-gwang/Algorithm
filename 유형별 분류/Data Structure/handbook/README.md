## 자료구조 내용정리

### 1. List 인터페이스 메서드

| 메서드 | 사용 |
| --- | --- |
| add(int index, Object element) | 주어진 인덱스에 객체를 추가한다. |
| addAll(int index, Collection c) | 주어진 인덱스에 컬렉션을 추가한다. boolean 타입을 리턴 |
| set(int index, Object element) | 주어진 인덱스에 객체를 저장. Object 타입을 리턴 |
| indexOf(Object o) / lastIndex(Object o) | 순방향 / 역방향으로 탐색하여 주어진 객체의 위치를 반환한다.  int 타입 리턴 |
| listIterator() / listIterator(int index) | List의 객체를 탐색할 수 있는 ListIterator 반환 / 주어진 index부터 탐색할 수 있는 ListIterator 타입 리턴 |
| subList(int fromIndex, int toIndex) | fromIndex부터 toIndex까지의 객체를 반환한다. List 타입을 리턴한다 |
| remove(int index) | 주어진 인덱스에 저장된 객체를 삭제 후, 삭제된 객체를 반환 Object 타입 리턴 |
| remove (Object o)  | 주어진 객체를 삭제한다. boolean 타입을 리턴 |
| sort(Comparator c) | 주어진 비교자(comparator)로 List를 정렬한다. |

### 2. Map 인터페이스 메서드

| 메서드 | 사용 |
| --- | --- |
| put(Object a, Object b) | Key = a, Value = b로 저장 |
| get(Object o) | Key 값이 o인 Value를 반환한다. Object타입 리턴 |
| containsKey(Object o) | o라는 Key 값이 있는지 확인하여 값을 반환한다. boolean 타입 리턴 |
| remove(Object o) | Key값이 o인 객체를 삭제 후, 그 value값을 반환한다. Object 타입 리턴 |
| size() | Map의 갯수를 리턴한다. int 타입 리턴 |
| isEmpty() | 해당 맵이 비어있는지 확인 boolean 타입 리턴 |
| replace(Object k, Object v) | k라는 Key값에 해당하는 Value값을 v로 대체, 바뀌기 전 Value 값 리턴 |
| replace(Object key, Object oldValue, Object newValue) | key값에 대응하는 키의 값을 새로운 값으로 대체, boolean값 리턴으로 확인 |

### 3. Set 인터페이스 메서드

| 메서드 | 사용 |
| --- | --- |
| boolean add(Object o) | 데이터 중복확인 후 요소 추가(중복되어 값이 안들어갔으면 false)후 bolean타입 리턴 |
| boolean remove(Object o) | 지정된 요소가 있는경우 Set에서 제거 후 true반환,  boolean타입 리턴 |
| boolean contains(Obnect o) | Set에 지정된 요소가 포함되어 있으면 true 반환, boolean 타입 |
| int size() | 집합의 요소 수 반환 int 타입 |
| Iterator<E> iterator() | Set의 요소 반복 반환, 특정 순서로 반환 되지 않음 |

### 4. Stack 인터페이스 메서드

| 메서드 | 사용 |
| --- | --- |
| boolean push(E e) | 주어진 객체를 맨 위에 추가한다. bolean타입 리턴 |
| pop() | 스택의 맨 위 요소를 제거하고 반환한다. |
| peek() | 스택의 맨 위에 요소를 반환만 한다. (제거X) |
| search(Object o) | 스택에서 객체를 찾고 1-based위치를 반환, 찾지 못하면 -1을 반환한다. |
| boolean isEmpty() | 스택의 요소가 비어있는지 확인 bolean타입 리턴 |

### 5. Queue 인터페이스 메서드

| 메서드 | 사용 |
| --- | --- |
| boolean offer(E e) | 주어진 객체를 넣는다. bolean타입 리턴 |
| peek() | 큐의 객체 중 먼저 들어온 맨 앞 하나를 리턴 |
| poll() | 가장 먼저 들어온 맨 앞 객체 제거, 제거된 객체 턴 |
| int size() | 큐의 요소 수 반환 int 타입 |
| boolean isEmpty() | 큐의 요소가 비어있는지 확인 bolean타입 리턴 |
