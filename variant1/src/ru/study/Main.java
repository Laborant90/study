package ru.study;

import ru.study.exceptions.TextValidationException;

import java.io.InputStream;
import java.io.StringReader;

public class Main {

    public static String INPUT_TEXT = "";

    public static void main(String[] args) {
        try {
            if (INPUT_TEXT.isEmpty()) {
                throw new TextValidationException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (TextValidationException e) {
            e.printStackTrace();
        }
    }

}
