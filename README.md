스프링 빈을 등록하는 2가지 방법
1. 컴포넌트 스캔으로 자동 의존관계 설정   
   @Component 를 통해 스프링 빈으로 자동 등록, @Service, @Controller, @Repository 에 포함이 되어 있다.
2. 자바 코드로 직접 스프링 빈 등록,   
   @Configuration @Bean 을 통해 스프링 빈으로 등록

DI 에는 필드주입(유연성이 떨어짐), setter 주입(setter 에 @Autowired - public 에 노출되는 단점), 생성자(조립 시점에만 호출되고, 추후 변경하지 못하게 막을 수 있다는 장점)이 있음

컴포넌트 스캔을 사용
- 정형화된 경우(컨트롤러, 서비스, 레파지토리)

스프링 빈으로 등록 
- 상황에 따라 구현 클래스를 변경해야 하면 설정을 통해 스프링 빈으로 등록

스프링 컨테이너에 올라가 있어야만 @Autowired 가 동작함