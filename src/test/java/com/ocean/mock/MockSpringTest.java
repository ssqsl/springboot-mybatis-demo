package com.ocean.mock;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.codehaus.plexus.util.IOUtil;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

import static org.mockito.Mockito.when;

public class MockSpringTest {

    @InjectMocks
    private OrderCreate orderCreate;

    @Mock
    private OrderHelper orderHelper; // 此mock将被注入到orderCreate

    @Before
    public void initMocks() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void create() {
        System.out.println("start mock...");
        String content = "";
//        try {
//            content = IOUtil.toString(resourceLoader.getResource("classpath:123.txt").getInputStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            ClassPathResource classPathResource = new ClassPathResource("ydxd.txt");
            InputStream inputStream =classPathResource.getInputStream();
            content=IOUtil.toString(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        when(orderHelper.resolve()).thenReturn(content);
        orderCreate.create();
    }
}
