package com.sk01.storage;

import com.sk01.exceptions.NameException;
import com.sk01.exceptions.UnexistingPathException;

import javax.naming.Name;
import java.util.List;

public abstract class Create {

    abstract public void createDir(String path) throws Exception;

    abstract public void createDir(String path, String name) throws Exception;

    abstract public void createDirs(int velicinaListe) throws Exception;

    abstract public void createFiles(String path) throws Exception;

    abstract public void createFiles(String path, String name) throws Exception;

    abstract public void createFiles(int velicinaListe) throws Exception;

}
