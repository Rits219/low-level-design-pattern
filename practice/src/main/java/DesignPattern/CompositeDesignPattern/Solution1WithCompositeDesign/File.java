package DesignPattern.CompositeDesignPattern.Solution1WithCompositeDesign;

public class File implements FileSystem {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("file name is " + fileName);
    }
}
