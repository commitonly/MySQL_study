public class Mysql {
    public static void main(String[] args) {


//        SELECT문
//        CRUD ( R = READ )


//        *** 기본 조회 ***

//        SELECT 필드이름 FROM 테이블

//        *** 여러 필드 조회 ***

//        SELECT 필드명1, 필드명2 FROM 테이블

//        *** 모든 필드 조회 ***

//        SELECT * FROM 테이블

//        *** 중복된 데이터를 제외하고 조회 ***

//        SELECT DISTINCT 필드이름 FROM 테이블

//        *** 조건식 적용할 경우 ***

//        SELECT * FROM 테이블 WHERE 필드명=0

//        *** 여러 조건식을 적용하는 경우 ***

//        SELECT * FROM 테이블 WHERE 필드명1=0 AND 필드명2=0 OR 필드명3=0

//        *** 조건식의 종류 ***

//        WHERE 필드명 BETWEEN 0 AND 100
//        WHERE 필드명 NOT BETWEEN 0 AND 100

//        WHERE 필드명 IN (0, 10, 100)
//        WHERE 필드명 NOT IN (0, 10, 100)

//        WHERE 필드명 IS NULL
//        WHERE 필드명 IS NOT NULL

//        WHERE 필드명 LIKE '김__'
//        WHERE 필드명 NOT LIKE '김__'

//        WHERE 필드명 LIKE '홍%'
//        WHERE 필드명 NOT LIKE '홍%'

//        *** 특정 필드 기준으로 정렬하는 경우 ***

//        SELECT 필드이름 FROM 테이블 ORDER BY 필드명

//        *** 정렬 기준이 여러개인 경우 ***

//        SELECT 필드명 FROM 테이블 ORDER BY 필드명1, 필드명2 DESC, 필드명3 ASC

//        *** 내부 조인한 결과를 출력하는 경우 ***

//        SELECT 테이블1, 필드명 FROM 테이블1, 테이블2 WHERE 테이블1, 필드명 = 테이블2, 필드명

//        *** 별칭을 이용해 코드 간소화하는 경우 (위 코드와 동일)

//        SELECT A, 필드명 FROM 테이블1 A, 테이블2 B WHERE A, 필드명 = B, 필드명

//        *** 외부 조인한 결과를 출력하는 경우 ***

//        SELECT A필드명 FROM 테이블1 A, 테이블2 B WHERE A, 필드명 = B, 필드명(+)

//        *** 집합 연산을 이용해 결과를 출력하는 경우 ***

//        SELECT 필드명 FROM 테이블1 UNION (또는 UNION ALL, MINUS, INTERSET) SELECT 필드명 FROM 테이블2

//        *** 서브 쿼리(중첩 쿼리)를 실행하는 경우_서브 쿼리 결과가 하나 일 때

//        SELECT 필드명1 FROM 테이블 WHERE 테이블, 필드명2 <=( SELECT 필드명2 FROM 테이블 WHERE 조건문 )

//        *** 서브 쿼리(중첩 쿼리)를 실행하는 경우_서브 쿼리 결과가 여러개일 때

//        SELECT 필드명1 FROM 테이블 WHERE 테이블,필드이름 2 IN( SELECT 필드명2 FROM 테이블 WHERE 조건문 )
//        * IN외에 ANY, ALL, EXIST도 쓸 수 있음

//        *** INSERT문 ***
//        CRUD ( C = CREATE )

//        INSERT INTO 테이블(필드명1, 필드명2) VALUES (값1, 값2)

//        *** UPDATE문 ***
//        CRUD ( U = UPDATE )

//        UPDATE 테이블 SET 필드명1=값1, 필드명2=값2 WHERE 조건문

//        *** DELETE문 ***
//        CRUD ( D = DELETE )

//        DELETE FROM 테이블 WHERE 조건문






//        연산자

//        LIKE ' .. % ...' : 0-N개 문제를 가진 패턴
//        Like '... _ ... ' : _개수만큼의 문자를 가진 패턴





    }
}
