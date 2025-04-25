package org.example.AbstractFactory;
import org.example.Common.MOBIReader;
import org.example.Common.Reader;

public class MOBIReaderFactory implements ReaderFactory {
    public Reader createReader() {
        return new MOBIReader();
    }
}

