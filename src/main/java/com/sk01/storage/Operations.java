package com.sk01.storage;

import com.sk01.exceptions.NameException;

import java.io.File;
import java.util.List;

abstract public class Operations {



    abstract public void deleteFiles(List files);

    abstract public void deleteFiles(String path);

    abstract public void deleteDir(File dir);

    abstract public void moveFiles(List files, File dir1, File dir2);

    abstract public void downloadFile(String pathFrom, String pathTo);

    abstract public void rename(File file) throws Exception;

}
