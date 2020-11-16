package stringmethods.filename;

public class FileNameManipulator {

    private boolean isEmpty(String string) {
        return string == null || string.isBlank();
    }

    public char findLastCharacter(String str){

        if (isEmpty(str)){
            throw new IllegalArgumentException("Empty string!");
        }
        str = str.trim();
        return  str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        if (isEmpty(fileName)){
            throw new IllegalArgumentException("Invalid file name!");
        }
        int dot = fileName.lastIndexOf(".");
        if (dot < 1 || dot == fileName.length() -1){
            throw new IllegalArgumentException("Invalid file name!");
        }

        return fileName.substring(dot);

    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        String fileExt = null;
        try {
            fileExt =(findFileExtension(fileName)).substring(1);
        } catch (IllegalArgumentException abc){
            throw new IllegalArgumentException("Invalid argument!");
        }

        if (isEmpty(ext)){
            throw new IllegalArgumentException("Invalid argument!");
        }

        return fileExt.equals(ext);


    }
    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if (isEmpty(searchedFileName) || isEmpty(actualFileName)){
            throw new IllegalArgumentException("Invalid argument!");
        }
        searchedFileName = changeExtensionToLowerCase(searchedFileName.trim());
        actualFileName = changeExtensionToLowerCase(actualFileName.trim());

        return searchedFileName.equals(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("Empty string!");
        }
        fileName = fileName.trim();
        String fileExt = null;
        try {
            fileExt = findFileExtension(fileName);
        } catch (IllegalArgumentException abc) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        String fileExtLower = fileExt.toLowerCase();
        return fileName.replace(fileExt, fileExtLower);
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("Empty string!");
        }

        if (fileName.contains(present)) {
            fileName = fileName.replace(present, target);
        }
        return fileName;
    }



}
