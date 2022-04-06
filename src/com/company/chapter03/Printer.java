package com.company.chapter03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Printer {
    public String processFile(BufferedReaderProcessor p) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "not find";
    }
}