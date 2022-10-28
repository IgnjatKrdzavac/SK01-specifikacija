package com.sk01.utils;

import java.util.ArrayList;
import java.util.List;

public class Config {

    private List<String> unsuportedFiles;
    private String maxSize;
    private String numberOfFiles;
    private String path;

    public Config(){
        path = "";
        maxSize = "";
        numberOfFiles = "";
        unsuportedFiles = new ArrayList<>();

    }

    public Config(List<String> unsuportedFiles, String maxSize, String numberOfFiles, String path) {
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

    public String getNumberOfFiles() {
        return numberOfFiles;
    }

    public void setNumberOfFiles(String numberOfFiles) {
        this.numberOfFiles = numberOfFiles;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean checkArgs(String strNum) {

        try {
            Long.parseLong(strNum);
        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
