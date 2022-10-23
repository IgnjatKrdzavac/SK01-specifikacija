package com.sk01.storage;

import com.sk01.utils.Config;

import java.util.List;

public abstract class Storage {

    Config config;

    private Config readConfig(String path){
        //TODO Citaj json sa patha i upisi u novi config pa vrati
        return new Config();
    }

    public void createSkladiste(Config config){
        this.config = config;
    }

    public void createSkladiste(){
        this.config = new Config();
        config.setMaxSize("10000");
        config.setNumberOfFiles(5);
        config.setUnsuportedFiles(null);
    }

}
