package org.example.FactoryMethod;

import org.example.Common.Reader;

public abstract class KindleReader {
    public void readBook(String title) {
        Reader reader = createReader();
        reader.display(title);
    }

    protected abstract Reader createReader();
}
