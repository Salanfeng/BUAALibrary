package com.xuexiang.xuidemo.server;

import android.os.Build;

import java.util.ArrayList;
import com.alibaba.fastjson.JSON;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public static void main() {
        Library library = new Library();
        ArrayList<Book> books = library.getBooks();
        // you got it!
    }
}