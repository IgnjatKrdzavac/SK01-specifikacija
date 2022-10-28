package com.sk01.utils;

public class StorageInfo {

    private Config config;


    public StorageInfo(){
        init();
    }


    public void init() {
        config = new Config();
    }

   /* private static final class StorageInfoHolder {
        static final StorageInfo storageInfo = new StorageInfo();
    }

    public static StorageInfo getStorageInfo() {
        return StorageInfoHolder.storageInfo;
    }*/

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }
}
