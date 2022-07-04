public class StringCoding {
    private String sourceString;

    public void setSourceString(String str) {
        this.sourceString = str;
    }

    public String getDestinationString() {
        int counter = 1;
        String destinationString = "";

        for(int i = 0; i < sourceString.length() - 1; i++) {
            if (sourceString.charAt(i) != sourceString.charAt(i + 1)) {
                destinationString += String.valueOf(counter) + sourceString.charAt(i);
                counter = 0;
            }
            if (i == sourceString.length() - 2) {
                destinationString += String.valueOf(++counter) + sourceString.charAt(i + 1);
            }
            counter++;
        }
        return destinationString;
    }
}


