package com.jyc.cmpr_net_bd.config;

import com.jyc.cmpr_net_bd.client.PredictClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jin Yichao
 * @version 1.0
 * @date 2022/6/26 11:34
 */
@Configuration
public class PredictClientConfig {
    @Value("${thrift.host}")
    private String host;
    @Value("${thrift.port}")
    private int port;

    @Bean(initMethod = "init")
    public PredictClient thriftClient() {
        PredictClient predictClient = new PredictClient();
        predictClient.setHost(host);
        predictClient.setPort(port);
        return predictClient;
    }
}
