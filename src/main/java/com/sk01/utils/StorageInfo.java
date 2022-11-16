package com.sk01.utils;

public class StorageInfo {

    private Config config;


    private static volatile StorageInfo instance = null;

    private StorageInfo(){
        init();

    }

    public static StorageInfo getInstance(){

        if(instance == null){
            synchronized (StorageInfo.class) {
                if(instance == null) {
                    instance = new StorageInfo();
                }
            }
        }
        return instance;
    }


    public void init() {
        config = new Config();
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}
