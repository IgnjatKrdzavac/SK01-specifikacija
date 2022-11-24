package com.sk01.storage;

import java.io.File;
import java.sql.Time;
import java.util.List;

public abstract class Search {

    abstract public List<File> getFile(String path) throws Exception;

    abstract public List<File> getFiles(String podstring) throws Exception;

    abstract public List<File> getFilesWithExtension(String extension) throws Exception;

    abstract public List<File> getAllFiles(String path) throws Exception;

    abstract public boolean containsFiles(String path, List fileNames) throws Exception;

    abstract public File getDir(String fileName) throws Exception;

    abstract public List<File> sortByName(List files) throws Exception;

    abstract public List<File> sortByDate(List files) throws Exception;

    abstract public List<File> getFiles(String path, Time pocetak, Time kraj) throws Exception;

    abstract public List<File> filtrate(String string) throws Exception;

}
