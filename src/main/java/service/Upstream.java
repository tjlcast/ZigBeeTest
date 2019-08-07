package service;

import controller.RpcController;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Upstream {
    public void resolution() {
        Map<String, String> resp = RpcController.resp;
        String deviceId = "TEST1";
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
        resp.put(deviceId, "1");
    }
}
