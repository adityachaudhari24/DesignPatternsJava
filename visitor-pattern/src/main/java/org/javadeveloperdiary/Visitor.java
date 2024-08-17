package org.javadeveloperdiary;

interface Visitor {
    void visit(Book book);
    void visit(Electronics electronics);
}
