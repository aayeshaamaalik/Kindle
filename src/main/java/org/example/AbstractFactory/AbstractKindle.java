package org.example.AbstractFactory;


import org.example.Common.Reader;

public class AbstractKindle {
    private ReaderFactory factory;

    public AbstractKindle(ReaderFactory factory) {
        this.factory = factory;
    }

    public void readBook(String title) {
        Reader reader = factory.createReader();
        reader.display(title);
    }
}
