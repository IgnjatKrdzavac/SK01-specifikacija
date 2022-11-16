package com.sk01.storage;

import java.io.File;
import java.sql.Time;
import java.util.List;

public abstract class Search {

    abstract public void getFiles(File dir) throws Exception;

    abstract public void getFiles(String podstring, String name) throws Exception;

    abstract public void getFiles(String extension) throws Exception;

    abstract public void getAllFiles(File dir) throws Exception;

    abstract public boolean containsFiles(File dir, List fileNames) throws Exception;

    abstract public File getDir(String fileName) throws Exception;

    abstract public void sortByName(List files) throws Exception;

    abstract public void sortByDate(List files) throws Exception;

    abstract public void getFiles(File dir, Time pocetak, Time kraj) throws Exception;

    abstract public void filtrate(String string) throws Exception;

}
