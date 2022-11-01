package com.sk01.storage;

import com.google.gson.Gson;
import com.sk01.utils.Config;
import com.sk01.utils.StorageInfo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public abstract class Storage {



    public abstract File getConfig(String path);

    public abstract void editConfig(String path, String maxSize, String maxNumOfFiles, List<String> unsupportedFiles);

    public abstract void createStorage();


    public void configure(String maxSize, String numberOfFiles, List<String> unsupportedFiles) {


        boolean size = StorageInfo.getInstance().getConfig().checkArgs(maxSize);  //da korisnik nije uneo nesto sto nije broj
        boolean number = StorageInfo.getInstance().getConfig().checkArgs(numberOfFiles);  //da korisnik nije uneo nesto sto nije broj

        if (unsupportedFiles != null) {  //dodajemo ekstenzije na vec postojece
            unsupportedFiles.addAll(StorageInfo.getInstance().getConfig().getUnsuportedFiles());
        }

        if (size && number) {
            editConfig(StorageInfo.getInstance().getConfig().getPath(), maxSize, numberOfFiles, unsupportedFiles);  //azuriramo config.json
            readConfig(getConfig(StorageInfo.getInstance().getConfig().getPath()));  //azuriramo config u programu
        }

    }

    private void readConfig(File configFile) {
        Gson gson = new Gson();

        try {
            Reader reader = new FileReader(configFile);
            Config config = gson.fromJson(reader, Config.class);

            StorageInfo.getInstance().setConfig(config);
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
