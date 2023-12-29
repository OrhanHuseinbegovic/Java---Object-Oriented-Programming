package Week13.Lab.Task3;

public class CamelCaseFormatter implements TextFormatter{
    /*
    public String formatText(String message){
        String listaMess[] = message.split("");
        StringBuilder stringBuilder = new StringBuilder();
        String newMessage = "";
        int i =0;
        for (String slovo : listaMess){
            if (i%2==0){
                stringBuilder.append(slovo.toUpperCase());
            }
            stringBuilder.append(slovo.toLowerCase());
            i++;
        }
        return newMessage;
    }

     */
    @Override
    public String formatText(String text) {
        // Simple camel case conversion for demonstration purposes
        String[] words = text.split("\\s");
        StringBuilder result = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            result.append(words[i].substring(0, 1).toUpperCase())
                    .append(words[i].substring(1).toLowerCase());
        }
        return result.toString();
    }
}
