package org.example.AbstractFactory;
import org.example.Common.EPUBReader;
import org.example.Common.Reader;

public class EPUBReaderFactory implements ReaderFactory {
    public Reader createReader() {
        return new EPUBReader();
    }
}
