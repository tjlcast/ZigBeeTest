package service;

import org.springframework.stereotype.Service;

@Service
public class Downstreaam {
    public void send2Gateway(String shortAddress, String endPoint) {
        System.out.printf("send msg to device{shortAddress: %s, endpoint: %s}\n", shortAddress, endPoint);
    }
}
