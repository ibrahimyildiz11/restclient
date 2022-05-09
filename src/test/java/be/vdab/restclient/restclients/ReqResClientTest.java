package be.vdab.restclient.restclients;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ReqResClientTest {
    private final ReqResClient client;

    ReqResClientTest(ReqResClient client) {
        this.client = client;
    }

    @Test
    void findBestaandeUser() {
        assertThat(client.findById(1)).hasValueSatisfying(user ->
                assertThat(user.data().id()).isOne());
    }
    @Test
    void findOnbestaandeUser() {
        assertThat(client.findById(-1)).isEmpty();
    }
}