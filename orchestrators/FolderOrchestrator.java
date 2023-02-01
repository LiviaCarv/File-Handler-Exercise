package FileHandlerExercise.orchestrators;

import FileHandlerExercise.interfaces.FolderManagement;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;


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
        File file = new File("C:\\Users\\livia\\OneDrive\\Documents");
        String[] directories = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File current, String name) {
                return new File(current, name).isDirectory();
            }
        });
        System.out.println(Arrays.toString(directories));
    }
}
