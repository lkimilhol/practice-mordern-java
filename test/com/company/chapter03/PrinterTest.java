package com.company.chapter03;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrinterTest {
    private Printer printer;

    @BeforeEach
    void setup() {
        printer = new Printer();
    }

    @DisplayName("한 줄 출력")
    @Test
    void printLine() {
        // given

        // when
        String oneLine = printer.processFile((BufferedReader br) -> br.readLine());

        // 메서드 참조 방식
        // String oneLine = printer.processFile(BufferedReader::readLine);

        // then
        assertEquals("1", oneLine);
    }

    @DisplayName("두 줄 출력")
    @Test
    void printTwoLine() {
        // given

        // when
        String twoLines = printer.processFile((BufferedReader br) -> br.readLine() + br.readLine());

        // then
        assertEquals("12", twoLines);
    }
}