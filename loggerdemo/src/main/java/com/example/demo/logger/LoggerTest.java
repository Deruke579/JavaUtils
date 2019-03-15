package com.example.demo.logger;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Kelly on 2019/1/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

//    Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test(){
//        logger.error("error...");
//        logger.info("info...");
//        logger.debug("debug...");

        log.info("info...");
        log.debug("debug...");
        log.error("error...");
    }
}
