package com.vastik.spring.data.faker.test;

import com.vastik.spring.data.faker.DataFaker;
import com.vastik.spring.data.faker.source.SimpleClass;
import org.junit.Test;

public class DataFakerTest {

    public DataFakerTest() {
    }

    @Test
    public void test() throws Exception {
        DataFaker dataFaker = new DataFaker();
        SimpleClass fake = dataFaker.fake(SimpleClass.class);
    }
}
