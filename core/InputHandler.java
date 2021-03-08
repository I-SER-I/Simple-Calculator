package core;

import java.io.*;
import java.util.*;

public class InputHandler {
    private List<String> dataList;

    public InputHandler() {}

    public InputHandler(String firstValue, String secondValue, String operation) {
        dataList = List.of(firstValue, secondValue, operation);
    }

    public InputHandler read() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            input = reader.readLine();
            dataList = new ArrayList<>(Arrays.asList(input.split(" ")));
        } catch (IOException exception) {
            System.out.println(exception);
        }
        return this;
    }
    public List<String> getValue() {
        return dataList;
    }
}
