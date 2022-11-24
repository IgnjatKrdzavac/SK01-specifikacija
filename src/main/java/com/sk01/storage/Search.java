package com.sk01.storage;

import java.io.File;
import java.sql.Time;
import java.util.List;

public abstract class Search {

    abstract public void getFile(String path) throws Exception;

    abstract public void getFiles(String podstring) throws Exception;

    abstract public void getFilesWithExtension(String extension) throws Exception;

    abstract public void getAllFiles(String path) throws Exception;

    abstract public boolean containsFiles(String path, List fileNames) throws Exception;

    abstract public File getDir(String fileName) throws Exception;

    abstract public void sortByName(List files) throws Exception;

    abstract public void sortByDate(List files) throws Exception;

    abstract public void getFiles(String path, Time pocetak, Time kraj) throws Exception;

    abstract public void filtrate(String string) throws Exception;

}
