# Algorithm 학습
> Java를 이용한 기본 알고리즘 학습

## Java note

*StringBuilder 를 사용하는 이유* :

    String 을 이용해서 + 연산을 수행시 성능이 저하되서 StringBuilder 를 이용한다.
    (append 함수를 이용하여 문자열을 더한다.)

*StringBuilder.toString() 과 String.valueOf(StringBuilder)의 차이점은?*

    대상이 null 인 경우에 toString()의 경우는 Null Pointer Exception(NPE)을 발생시킴, String.valueOf()는 null이라는 문자열로 처리한다.

*substring() 사용*

    1. 매개변수가 하나 => (String 변수).substring(5); : String 변수의 index가 5인 위치부터 끝까지의 문자열을 가져오게 된다.
    2. 매개변수가 둘 => (String 변수).substring(2,6); : String 변수의 index가 2인 위치부터 5인 위치까지의 문자열을 가져오게 된다.
    __(매개변수가 두 개 일때, 뒤에 오늘 숫자-1 까지의 index로 자른다는 것을 꼭 기억!!!)__
