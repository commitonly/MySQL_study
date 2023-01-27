package query;

public class DB_SQL_1 {
    public static void main(String[] args) {
/**
 *
 *
 *
 * DML : 데이터베이스의 테이블에 있는 내용을 직접 조작하는 기능
 * 테이블의 레코드를 CRUD
 *
 insert = 데이터베이스 객체에 데이터를 입력
 delete = 데이터베이스 객체에 데이터를 삭제
 update = 데이터베이스 객체 안의 데이터 수정
 select = 데이터베이스 객체 안의 데이터 조회

 DDL : 데이터베이스의 스키마를 정의,생성, 수정하는 기능
 테이블 생성, 컬럼 추가, 타입 변경, 각종 제약조건 지정, 수정 등

 SQL문

 create : 데이터베이스 객체를 생성
 drop : 데이터베이스 객체를 삭제
 alter : 기존에 존재하는 데이터베이스 객체를 다시 정의

 DCL : 데이터베이스의 테이블에 접근 권한이나 CRUD 권한을 정의하는 기능
 특정 사용자에게 테이블의 조회권한 허가 및 금지 등


 SQL문

 grant : 데이터베이스 객체에 권한을 부여
 revoke : 이미 부여된 데이터베이스 객체 권한을 취소


 CRUD

 create - 생성 - insert
 read - 읽기(인출) - select
 update - 갱신 - update
 delete(destroy) - 삭제 - delete


 Create : 데이터베이스 객체 생성
 - insert into
 - 새로운 레코드를 추가

 Update : 데이터베이스 객체 안의 데이터 수정
 -update
 -특정 조건의 레코드의 컬럼 값을 수정

 Delete : 데이터베이스 객체의 데이터 삭제
 -delete
 -특정 조건의 레코드를 삭제

 Retrieve : 데이터베이스 객체 안의 데이터 검색
 -select
 -조건을 만족하는 레코드를 찾아 특정 컬럼 값(모두표시 *)을 표시

 select 명령문 :

 select 컬럼명 from 테이블명 where 조건절;

 "world" DB에서의 쿼리 예제

 국가 코드가 "KOR"으로 되어 있는 도시들의 이름을 구하시오
 select Name from city where CountryCode='KOR';

 인구가 500만 이상인 도시들의 이름을 구하시오
 select Name from city where Population > 50000000;


 insert into 명령문 :

 - 예제

 # 각각의 필드와 대응 시켜줘서 insert를 시켜주어야 한다.

 insert into city (ID, Name, CountryCode, District, Population) values (10000, "Sample" "KOR', "Test", 1000000):

 # 이 경우에는 모든 컬럼 값들이 필드와 대응되면 생략 가능

 insert into city values (20000, "SampleTest", "KOR", "Test", 2000000);

 - 결과확인

 #ID 가 100000 인 레코드 출력

 select * from city where ID = 20000;

 #ID 가 200000 인 레코드 출력
 select * from city where ID = 10000;


 update 명령문 :

 update 테이블명 set 컬럼명 = 값, .... where 조건절;

 - 예제

 #ID 가 10000 인 레코드의 name 을 "SampleRevised" 로 변경
 update city set name = "SampleRevised" where id = 10000;

 - 걀과 확인

 # ID 가 100000 인 레코드 출력
 select * from city where ID = 10000;


 delete 명령문 :

 delete from 테이블명 where 조건절;

 - 예제

 # ID 가 20000 이며 Popultaion 이 2000000 인 레코드를 삭제
 delete from city where (ID = 20000) AND (Population = 2000000);

 # ID 가 10000 이며 Population이 1000000 인 레코드를 삭제
 delete from city where (ID = 100000) AND (Population = 1000000);


 - 결과 확인
 # ID 가 100000 인 레코드 출력
 select * from city where ID = 100000;

 # ID 가 200000 인 레코드 출력
 select * from city where ID = 20000;

































 **/
    }
}
