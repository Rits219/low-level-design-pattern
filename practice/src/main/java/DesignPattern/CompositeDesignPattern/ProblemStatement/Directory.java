package DesignPattern.CompositeDesignPattern.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String directoryName;
    private List<Object> fileObj;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileObj = new ArrayList<>();
    }

    public void add(Object obj) {
        fileObj.add(obj);
    }

    public void ls() {
        System.out.println("directory name is " + directoryName);
        for (Object obj : fileObj) {
            if (obj instanceof File) {
                ((File) obj).ls();
            } else if (obj instanceof Directory) {
                ((Directory) obj).ls();
            }
        }
    }
}
