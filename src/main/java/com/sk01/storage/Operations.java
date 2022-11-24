package com.sk01.storage;

import com.sk01.exceptions.NameException;

import java.io.File;
import java.util.List;

public abstract class Operations {

    abstract public void deleteFile(String path) throws Exception;

    abstract public void deleteDir(String path) throws Exception;

    abstract public void deleteAll(String path) throws Exception;

    abstract public void moveFiles(String fromPath, String toPath) throws Exception;

    abstract public void downloadFile(String pathFrom, String pathTo) throws Exception;

    abstract public void rename(String path, String name) throws Exception;

}
