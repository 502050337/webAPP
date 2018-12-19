package com.veryqy.gen.controller;

import com.veryqy.gen.GenApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GenApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ContractorControllerTest {

    /**
     * @LocalServerPort 提供了 @Value("${local.server.port}") 的代替
     */
    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void setUp() throws Exception {
        String url = String.format("http://localhost:%d/", port);
        System.out.println(String.format("port is : [%d]", port));
        this.base = new URL(url);
    }

    @Test
    public void excelimport() {

        ResponseEntity<String> response = this.restTemplate.getForEntity(
                this.base.toString() + "/test", String.class, "");
        System.out.println(String.format("测试结果为：%s", response.getBody()));
    }

    @Test
    public void genpdf() {
        ResponseEntity<String> response = this.restTemplate.getForEntity(
                this.base.toString() + "/excelimport/commodityquery", String.class, "");
        System.out.println(String.format("测试结果为：%s", response.getBody()));
    }

    @Test
    public void commodityquery() {
        ResponseEntity<String> response = this.restTemplate.getForEntity(
                this.base.toString() + "/excelimport/commodityquery", String.class, "");
        System.out.println(String.format("测试结果为：%s", response.getBody()));
    }
}