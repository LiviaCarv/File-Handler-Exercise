package FileHandlerExercise;

import FileHandlerExercise.interfaces.FileDatabase;
import FileHandlerExercise.interfaces.FolderManagement;
import FileHandlerExercise.interfaces.ImageFileDatabase;
import FileHandlerExercise.model.MFile;
import FileHandlerExercise.orchestrators.FileOrchestrator;

public class HandlerFile extends FileOrchestrator {
    ImageFileDatabase imageFileOrchestrator;
    FileDatabase fileOrchestrator;
    FolderManagement folderManagement;

    public void saveFileWithDirectory(MFile mFile) {
        fileOrchestrator.saveFile(
                mFile.getPath(),
                mFile.getContent(),
                mFile.getType(),
                mFile.getNameFile()
        );
    }


}
