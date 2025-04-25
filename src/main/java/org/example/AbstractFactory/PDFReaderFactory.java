package org.example.AbstractFactory;
import org.example.Common.PDFReader;
import org.example.Common.Reader;

public class PDFReaderFactory implements ReaderFactory {
    public Reader createReader() {
        return new PDFReader();
    }
}

