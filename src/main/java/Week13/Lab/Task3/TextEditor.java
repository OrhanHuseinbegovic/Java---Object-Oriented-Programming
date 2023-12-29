package Week13.Lab.Task3;

class TextEditor {
    private TextFormatter textFormatter;

    // Setter method to set the text formatter dynamically
    public void setFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    // Method to format text using the current text formatter
    public String formatText(String text) {
        if (textFormatter == null) {
            throw new IllegalStateException("TextFormatter not set");
        }
        return textFormatter.formatText(text);
    }
}
