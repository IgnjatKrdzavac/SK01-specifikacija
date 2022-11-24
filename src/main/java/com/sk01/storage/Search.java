package com.sk01.storage;

import java.io.File;
import java.util.Date;
import java.util.List;

public abstract class Search {

    abstract public File getFile(String path) throws Exception;

    abstract public List<File> getFiles(String podstring) throws Exception;

    abstract public List<File> getFilesWithExtension(String extension) throws Exception;

    abstract public List<File> getAllFiles(String path) throws Exception;

    abstract public List<File> getAllFiles() throws Exception;

    abstract public boolean containsFiles(String path, List fileNames) throws Exception;

    abstract public String getDir(String fileName) throws Exception;

    abstract public List<File> sortByName(String dirPath) throws Exception;

    abstract public List<File> sortByDate(String dirPath) throws Exception;

    abstract public List<File> getFiles(String path, Date pocetak, Date kraj) throws Exception;

    abstract public List<File> filtrate(String string) throws Exception;

}
