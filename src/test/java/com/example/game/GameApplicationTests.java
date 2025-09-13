package com.example.game;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
    properties = {
      "spring.datasource.url=jdbc:h2:mem:testdb",
      "spring.datasource.driver-class-name=org.h2.Driver",
      "spring.datasource.username=test",
      "spring.datasource.password=test",
      "spring.jpa.hibernate.ddl-auto=create-drop",
      "spring.sql.init.mode=never"
    })
class GameApplicationTests {

  @Test
  void contextLoads() {}
}
