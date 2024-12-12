package structra.assignment.task.impl;
import structra.assignment.framework.llm.KeyProvider;

public class ProvideKey implements KeyProvider {
    @Override
    public String getApiKey() throws RuntimeException{
        return "structra-1343abnc-dGhpcyBpcyBub3Qgb3VyIGFwaSBrZXksIG5pY2UgdHJ5IHRobyA6KQ==";
    }

}
