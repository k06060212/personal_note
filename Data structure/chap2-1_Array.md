# 배열
## 자료구조의 정의
데이터 단위와 데이터 자체 사이의 물리적 또는 논리적인 관계

## 데이터 단위와 자료구조
데이터 단위는 데이터를 구성하는 항 덩이라고 생각하면 된다.
그리고 자료 구조는 쉽게 말해 자료를 효율적으로 이용할 수 있도록 컴퓨터에 저장하는 방법을 말한다.

## 배열
배열은 같은 자료형의 변수로 이루어진 구성 요소(component)가 모인 것입니다.

### 배열은 아래의 방식으로 선언한다.
int[] a;  // a는 자료형이 int형인 배열 : 형식 A
int a[];  // a는 자료형이 int형인 배열 : 형식 b

#### 예
구성 요소의 자료형이 int형이고, 구성 요소의 개수가 5개인 배열은 아래와 같이 선언합니다.
a = new int[5];

### new 연산자
new 연산자가 생성하는 것은 배열 본체에 대한 참조이다.
#### int[] a = new int[5];
참조하는 곳이 a에 대입되고 그 결과 배열 변수 a가 배열 본체를 참조하게 됩니다.

### 배열의 요소값을 초기화하며 배열 선언하기
int[] a = new int[]{1,2,3,4,5}

### 배열의 복제
배열 이름.clone()

### 배열 요소의 최대값 구하기
변수의 최대값을 구하는 방식과 같다.
예)
max = a[0];
if(a[1] > max) max = a[1];
if(a[2] > max) max = a[2];
....
------------------------------
max = a[0];
for(i = 1; 1 < n; i++)
  if(a[i] > max) max = a[i];
  
* 위와 같이 배열의 요소를 하나씩 차례로 살펴보는 과정을 알고리즘 용어로 주사(traverse)라고 한다. - 스캐닝과 같다. 무엇무엇을 스캔하다 같은

### 배열 요소의 최대값을 구하는 메서드
MaxOfArray 참조

# 접근 제한자란?
## 멤버는 객체에 자신만의 속성이자 특징이므로 외부에 공개하는 것이 반드시 좋은 것은 아니다.
## 그래서 객체의 멤버에 대한 접근을 제한할 때가 있는데, 이를 자바에서는 접근 제한자라 한다.

## 제한자 종류
### 1. public : 모든 접근 허용
### 2. protected : 같은 패키지(폴더)의 객체, 상속 관계의 객체 허용
### 3. default : 같은 패키지(폴더)의 객체 허용.
### 4. private : 현재의 객체 안에서만 허용

## 접근 제한자 사용
### 1. 클래스 : public, default
### 2. 생성자 : public, protected, default, private
### 3. 멤버 변수 : public, protected, default, private
### 4. 멤버 메서드 : public, protected, default, private
### 5. 지역 변수 : 접근 제한자를 사요할 수 없음.

# 배열 요소를 역순으로 정렬
1. 맨 앞의 요소 a[0] 과 a[n]의을 교환 
2. 차례로 a[0 + 1] 과 a[n-1]를 순차로 교환 
3. 교환 횟수는 -> 요소 개수 / 2 
4. 이 교환 횟수의 나눗셈에서는 나머지는 버린다.
5. 이 알고리즘을 간단히 나타낸다면 아래와 같다
 ### for(i = 0; i < n/2; i++)       // a[i]와 a[n - i -1]의 값을 교환
 
# 두 값의 교환
두 값의 교환을 위해 같은 자료형을 가진 변수를 하나 더 사용한다.
## 1. x 값을 t에 보관
## 2. y 값을 x에 대입
## 3. t에 보관한 처음 x 값을 y에 대입

# 두 배열의 비교
## 1. 두 배열 a,b 요소수(길이)를 비교한다. 다르면 false 반환
## 2. for문으로 두 배열을 처음부터 스캔하면서 요소 a[i]와 b[i]의 값을 비교하는 것을 반복한다. 다른 요소를 발견하면 false;
## 3. 위의 두가지가 아니면 true를 반환한다. 

# 기수 변환
CardConvRev

# 알고리즘을 수정하면 수행 횟수가 줄어들 수 있다.
1. 같은 답을 얻는 알고리즘은 하나가 아니다.
2. 빠른 알고리즘은 메모리를 많이 요구한다.

# 다차원 배열
- 배열을 구성 요소로 하는 것이 2차원 배열,
- 2차원 배열을 구성요소로 하는 것이 3차원 배열


