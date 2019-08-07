//package model;
//
//import java.util.Map;
//
//public class CommandThread implements Runnable{
//
//    private String deviceId;
//    private Map<String, String> deviceResp;
//
//    public CommandThread(String deviceId){
//        this.deviceId = deviceId;
//    }
//
//    public CommandThread(Map<String, String> resp){
//        this.deviceResp = resp;
//    }
//
//    public void run() {
//        while(!deviceResp.containsKey(deviceId));
//        System.out.printf("receive a message of device %s: %s", deviceId, deviceResp.get(deviceId))
//    }
//}