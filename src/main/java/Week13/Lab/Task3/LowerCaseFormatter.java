package Week13.Lab.Task3;

import org.w3c.dom.Text;

public class LowerCaseFormatter implements TextFormatter{
    @Override
    public String formatText(String message){
        return message.toLowerCase();
    }
}
