package com.veryqy.gen.config;

import org.jodconverter.office.LocalOfficeManager;
import org.jodconverter.office.OfficeException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JodConverterConfig {

    @Bean
    LocalOfficeManager localOfficeManager(){
        final LocalOfficeManager officeManager = LocalOfficeManager.install();
        try {
            officeManager.start();
        } catch (OfficeException e) {
            e.printStackTrace();
        }
        return officeManager;
    }

}
