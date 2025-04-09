package guru.springframework.spring6gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class Spring6GatewayApplicationTests {

    @Test
    void contextLoads(ApplicationContext appCtx) {
        // This test will fail if the application context cannot start
        // and all beans are not loaded correctly.
        // You can add assertions here to check specific beans if needed.
        // For example:
        assertThat(appCtx.getBean("spring6GatewayApplication")).isNotNull();
    }

}
