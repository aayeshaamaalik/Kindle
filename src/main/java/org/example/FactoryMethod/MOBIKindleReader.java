package org.example.FactoryMethod;

import org.example.Common.MOBIReader;
import org.example.Common.Reader;


public class MOBIKindleReader extends KindleReader {
    protected Reader createReader() {
        return new MOBIReader();
    }
}

