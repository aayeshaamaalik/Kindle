package org.example.SimpleFactory;


import org.example.Common.Format;
import org.example.Common.Reader;

public class SimpleKindle {
    public void readBook(String title, Format format) {
        Reader reader = SimpleReaderFactory.createReader(format);
        reader.display(title);
    }
}

