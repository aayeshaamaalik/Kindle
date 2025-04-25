package org.example.SimpleFactory;
import org.example.Common.*;

public class SimpleReaderFactory {
    public static Reader createReader(Format format) {
        switch (format) {
            case PDF: return new PDFReader();
            case MOBI: return new MOBIReader();
            case EPUB: return new EPUBReader();
            default: throw new IllegalArgumentException("Unsupported format");
        }
    }
}
