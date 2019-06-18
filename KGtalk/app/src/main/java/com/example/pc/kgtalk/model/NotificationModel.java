package com.example.pc.kgtalk.model;

public class NotificationModel {

    public String to;
    //Notification은 백그라운드로 푸쉬(앱꺼진후, 제한적 기능)
    //Notificaion 초기화 시키지 않을 시 에러 발생
    public Notification notification = new Notification();
    //Data는 포그라운드로 푸쉬
    public Data data = new Data();

    public static class Notification {

        public String title;
        public String text;
    }

    public static class Data {
        public String title;
        public String text;
    }
}
