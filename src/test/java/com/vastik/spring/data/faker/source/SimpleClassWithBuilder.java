package com.vastik.spring.data.faker.source;

import com.vastik.spring.data.faker.annotation.*;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Set;

@Getter
@Builder
public class SimpleClassWithBuilder {

    @FakeNumberRandom(15)
    private int count;

    @FakeFaker("gameOfThrones.dragon")
    private String name;

    @FakeEnum({"RED", "BLACK"})
    private Colors colors;

    @FakeNumberRandom(25)
    @FakeCollection(min = 5, max = 15)
    private Set<Integer> integers;

    @FakeInclude
    @Getter
    private AnotherClass anotherClass;
}
