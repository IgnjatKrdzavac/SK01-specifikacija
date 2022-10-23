package com.sk01.storage;

import java.io.File;
import java.sql.Time;
import java.util.List;

public abstract class Search {

    abstract public void getFiles(File dir);

    abstract public void getFiles(String podstring, String name);

    abstract public void getFiles(String extension);

    abstract public void getAllFiles(File dir);

    abstract public boolean containsFiles(File dir, List fileNames);

    abstract public File getDir(String fileName);

    abstract public void sortByName(List files);

    abstract public void sortByDate(List files);

    abstract public void getFiles(File dir, Time pocetak, Time kraj);

    abstract public void filtrate(String string);

}
