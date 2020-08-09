package io.abdul.springbootdemo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class EmployeeManagementApplicationTest {

    @Test
    void contextLoads() {
        log.info("Spring Context loaded successfully!");
    }

}
