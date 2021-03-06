package com.vastik.spring.data.faker.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FakeDatePast {
    int value() default 1;
    TimeUnit unit() default TimeUnit.DAYS;
}
