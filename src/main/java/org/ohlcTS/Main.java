package org.ohlcTS;

import org.ohlcTS.TimeStream.Clients.ClientImpl;
import org.ohlcTS.TimeStream.ServiceManager;
import software.amazon.awssdk.services.timestreamquery.TimestreamQueryClient;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        KafkaManager kafkaManager = new KafkaManager();
//        TimestreamQueryClient timestreamQueryClient = new ClientImpl().buildQueryClient();
//        ServiceManager serviceManager = new ServiceManager();
//        serviceManager.runQuery(timestreamQueryClient);
//        serviceManager.startTest();
    }
}