package com.joantolos.kata.binary.tree;

import org.junit.Test;

public class PrinterTest extends TreeExamples {

    private final Printer printer = new Printer();

    @Test
    public void shouldPrintTreeOne() {
        this.printer.printNode("Example One", treeOne());
    }

    @Test
    public void shouldPrintTreeTwo() {
        this.printer.printNode("Example Two", treeTwo());
    }
}

