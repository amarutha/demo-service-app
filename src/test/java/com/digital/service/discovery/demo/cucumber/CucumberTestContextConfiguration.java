package com.digital.service.discovery.demo.cucumber;

import com.digital.service.discovery.demo.GatewayApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = GatewayApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
