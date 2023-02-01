package FileHandlerExercise.orchestrators;

import FileHandlerExercise.interfaces.FileDatabase;
import FileHandlerExercise.interfaces.ImageFileDatabase;
import FileHandlerExercise.model.MFile;
import FileHandlerExercise.model.MFileAnnotationTypeEnum;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class FileOrchestrator extends FolderOrchestrator implements ImageFileDatabase, FileDatabase {
    @Override
    public void saveFile(String directory, String content, MFileAnnotationTypeEnum type, String nameFile) {
        if (type.equals(MFileAnnotationTypeEnum.IMAGE)) {
            directory += "\\images";
            saveImageFile(directory, content, nameFile);
        } else if (type.equals(MFileAnnotationTypeEnum.REMINDER)) {
            directory += "\\reminders";
            createAFolder(directory);
            saveTxtFile(directory, content, nameFile);
        } else if (type.equals(MFileAnnotationTypeEnum.IMPORTANT)) {
            directory += "\\importants";
            createAFolder(directory);
            saveTxtFile(directory, content, nameFile);
        } else {
            saveTxtFile(directory, content, nameFile);
        }

    }

    @Override
    public void recoveryFile(String directory, String nameFile) {

    }

    @Override
    public void removeFile(String directory, String nameFile, MFileAnnotationTypeEnum type) {
        switch (type) {
            case IMAGE:
                removeImageFile(directory, nameFile);
                break;
            case SIMPLE:
                removeTxtFile(directory, nameFile);
                break;
            default:
                removeTxtFile(directory, nameFile);
                removeAFolder(directory);
        }
    }

    @Override
    public void listAllFiles(String directory) {
        File file = new File(directory);
        String[] files = file.list();
        System.out.println("List: ");
        Arrays.stream(files).forEach(str -> System.out.println(str + " "));

    }

    @Override
    public void saveImageFile(String directory, String urlContent, String nameFile) {

    }

    @Override
    public void recoveryImageFile(String directory) {

    }

    @Override
    public void removeImageFile(String directory, String nameFile) {

    }

    @Override
    public void listAllImageFiles(String directory) {

    }

    public void saveAllListOfFiles(List<MFile> mFileList) {
        for (MFile file: mFileList) {

        }
    }



    public void saveTxtFile (String directory, String content, String nameFile) {
        new File(directory+ "\\" + nameFile + ".txt");
        try {
            PrintWriter writer =  new PrintWriter(directory+ "\\" + nameFile + ".txt");
            writer.println(content);
            writer.close();
            System.out.printf("\nFile created: %s.txt", nameFile);
        } catch (IOException e) {
            System.out.println("An error ocurred: " + e.getMessage());
        }

    }

    public void removeTxtFile(String directory, String nameFile) {
        File file = new File(directory+ "\\" + nameFile + ".txt");
        if (file.exists()) {
            file.delete();
            System.out.printf("\nFile %s.txt deleted", nameFile);
        } else {
            System.out.println("File doesn't exist.");
        }

    }


}
