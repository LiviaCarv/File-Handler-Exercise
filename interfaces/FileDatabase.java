package FileHandlerExercise.interfaces;

import FileHandlerExercise.model.MFileAnnotationTypeEnum;

public interface FileDatabase {

    void saveFile(String directory, String content, MFileAnnotationTypeEnum type, String nameFile);
    void recoveryFile (String directory, String nameFile);
    void removeFile(String directory, String nameFile, MFileAnnotationTypeEnum type);
    void listAllFiles(String directory);

}
