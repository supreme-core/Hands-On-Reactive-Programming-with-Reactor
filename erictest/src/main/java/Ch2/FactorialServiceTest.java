package Ch2;

import reactor.core.publisher.Flux;


public class FactorialServiceTest {

    public static void testFactorial() {
        Flux<Double> factorialGenerator = new FactorialService().generateFactorial(10);
        factorialGenerator
                .doOnNext(t -> System.out.println(t))
                .last()
                .subscribe(t -> System.out.println(3628800.0 == t));
    }

    public static void main(String[] args) {
        testFactorial();
    }
}
