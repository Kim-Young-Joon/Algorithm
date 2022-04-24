# Algorithm 학습
> Java를 이용한 기본 알고리즘 학습

## Java note

***
*StringBuilder 를 사용하는 이유* :

    String 을 이용해서 + 연산을 수행시 성능이 저하되서 StringBuilder 를 이용한다.
    (append 함수를 이용하여 문자열을 더한다.)

***
*StringBuilder.toString() 과 String.valueOf(StringBuilder)의 차이점은?*

    대상이 null 인 경우에 toString()의 경우는 Null Pointer Exception(NPE)을 발생시킴, String.valueOf()는 null이라는 문자열로 처리한다.
