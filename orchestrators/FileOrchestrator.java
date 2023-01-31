package FileHandlerExercise.orchestrators;

import FileHandlerExercise.interfaces.FileDatabase;
import FileHandlerExercise.interfaces.ImageFileDatabase;
import FileHandlerExercise.model.MFileAnnotationTypeEnum;

public class FileOrchestrator extends FolderOrchestrator implements ImageFileDatabase, FileDatabase {
    @Override
    public void saveFile(String directory, String content, MFileAnnotationTypeEnum type, String nameFile) {
        switch (type) {
            case SIMPLE:

        }
    }

    @Override
    public void recoveryFile(String directory, String nameFile) {

    }

    @Override
    public void removeFile(String directory, String nameFile, MFileAnnotationTypeEnum type) {

    }

    @Override
    public void listAllFiles(String directory) {

    }

    @Override
    public void saveImageFile(String directory, String content, String nameFile) {

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
}
