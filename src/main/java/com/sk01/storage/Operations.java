package com.sk01.storage;

import com.sk01.exceptions.NameException;

import java.io.File;
import java.util.List;

public abstract class Operations {

    abstract public void deleteFiles(List files) throws Exception;

    abstract public void deleteFiles(String path) throws Exception;

    abstract public void deleteDir(File dir) throws Exception;

    abstract public void moveFiles(List files, File dir1, File dir2) throws Exception;

    abstract public void downloadFile(String pathFrom, String pathTo) throws Exception;

    abstract public void rename(File file) throws Exception;

}
