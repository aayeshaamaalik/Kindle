package org.example.FactoryMethod;

import org.example.Common.PDFReader;
import org.example.Common.Reader;

public class PDFKindleReader extends KindleReader {
    protected Reader createReader() {
        return new PDFReader();
    }
}
