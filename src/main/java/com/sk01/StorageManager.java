package com.sk01;

import com.sk01.storage.Create;
import com.sk01.storage.Operations;
import com.sk01.storage.Search;
import com.sk01.storage.Storage;

public class StorageManager {

    private static Create create;
    private static Operations operations;
    private static Search search;
    private static Storage storage;

    public static void registerStorage(Create c, Operations o, Search s, Storage strg){
        create = c;
        operations = o;
        search = s;
        storage = strg;
    }

    public static Create getCreate(){
        return create;
    }

    public static Operations getOperations(){
        return operations;
    }

    public static Search getSearch(){
        return search;
    }

    public static Storage getStorage(){
        return storage;
    }

}
