package Week13.Lab.Task3;

public class Task3Main {
    public static void main(String[] args) {
        // Instantiate TextEditor
        TextEditor textEditor = new TextEditor();

        // Set different text formatters dynamically
        textEditor.setFormatter(new UpperCaseFormatter());
        String upperCaseResult = textEditor.formatText("Hello, World!");
        System.out.println("Upper Case Result: " + upperCaseResult);

        textEditor.setFormatter(new LowerCaseFormatter());
        String lowerCaseResult = textEditor.formatText("Hello, World!");
        System.out.println("Lower Case Result: " + lowerCaseResult);

        textEditor.setFormatter(new CamelCaseFormatter());
        String camelCaseResult = textEditor.formatText("hello world");
        System.out.println("Camel Case Result: " + camelCaseResult);
    }
}
