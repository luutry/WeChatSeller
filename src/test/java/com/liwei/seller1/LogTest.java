package com.liwei.seller1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liwei on 2017/11/26.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class LogTest {

   // private final Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void log(){
//        logger.info("info ------------");
//        logger.debug("debug------------");
//        logger.error("error-------------");

        String name = "name";
        String password = "password";
        log.info("info ------------");
        log.debug("debug------------");
        log.error("error-------------");
        log.info("name: {}, password: {}", name ,password);
    }
}
