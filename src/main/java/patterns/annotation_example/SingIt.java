package main.java.patterns.annotation_example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME) // указать жизненный цикл аннотации:
// будет она присутствовать только в исходном коде, в скомпилированном файле, или она будет также видна и в процессе выполнения
public @interface SingIt {
    String sing() default "La-la-la!";
}
