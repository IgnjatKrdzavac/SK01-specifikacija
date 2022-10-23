package com.sk01.utils;

import java.util.ArrayList;
import java.util.List;

public class Config {

    private List<String> unsuportedFiles;
    private String maxSize;
    private int numberOfFiles;
    private String path;

    public Config(){
        this.unsuportedFiles = new ArrayList<>();
        this.maxSize = "100000";
        this.numberOfFiles = 5;
        this.path = "";
    }

    public Config(List<String> unsuportedFiles, String maxSize, int numberOfFiles, String path) {
        this.unsuportedFiles = unsuportedFiles;
        this.maxSize = maxSize;
        this.numberOfFiles = numberOfFiles;
        this.path = path;
    }

    public List<String> getUnsuportedFiles() {
        return unsuportedFiles;
    }

    public void setUnsuportedFiles(List<String> unsuportedFiles) {
        this.unsuportedFiles = unsuportedFiles;
    }

    public String getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }

    public int getNumberOfFiles() {
        return numberOfFiles;
    }

    public void setNumberOfFiles(int numberOfFiles) {
        this.numberOfFiles = numberOfFiles;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
