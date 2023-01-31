package FileHandlerExercise.orchestrators;

import FileHandlerExercise.interfaces.FolderManagement;

import java.io.File;


public class FolderOrchestrator implements FolderManagement {
    @Override
    public void createAFolder(String path) {
        new File(path).mkdir();
    }

    @Override
    public void removeAFolder(String path) {
        new File(path).delete();
    }

    @Override
    public void listAllFoldersCreated() {

    }
}
