package main.java.patterns.annotation_example;

import java.lang.reflect.Field;

public class SingItTest {

    @SingIt
    public String defaultField;

    @SingIt(sing = "Cha-cha-cha")
    public String singField;

    public static void main(String[] args) throws IllegalAccessException {

        SingItTest singItTest = new SingItTest();

        //тут рефлексия
        for(Field field : SingItTest.class.getFields()) {
            SingIt singIt = field.getAnnotation(SingIt.class);
            field.set(singItTest, singIt.sing());
        }

        System.out.println(singItTest.defaultField);
        System.out.println(singItTest.singField);

        //La-la-la!
        //Cha-cha-cha
    }
}
