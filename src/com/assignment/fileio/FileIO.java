package com.assignment.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIO {

    public static void WriteFile(Object object, String path) throws IOException, FileNotFoundException {
        FileOutputStream fos  = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(object);
        oos.close();
        fos.close();
    }
    public static Object ReadFile(String path) throws IOException, FileNotFoundException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        return ois.readObject();
    }
}
