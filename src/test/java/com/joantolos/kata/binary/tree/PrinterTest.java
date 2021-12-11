package com.joantolos.kata.binary.tree;

import org.junit.Test;

public class PrinterTest extends TreeExamples {

    private final Printer printer = new Printer();

    @Test
    public void shouldPrintTreeOne() {
        this.printer.printNode(treeOne());
    }

    @Test
    public void shouldPrintTreeTwo() {
        this.printer.printNode(treeTwo());
    }
}

