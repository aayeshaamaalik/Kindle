package org.example.FactoryMethod;


import org.example.Common.EPUBReader;
import org.example.Common.Reader;

public class EPUBKindleReader extends KindleReader {
    protected Reader createReader() {
        return new EPUBReader();
    }
}
