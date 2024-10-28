package com.xuexiang.xuidemo.server;

import static com.xuexiang.xui.XUI.getContext;

import android.content.Context;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    ArrayList<Book> books;
    HashMap<String, ArrayList<Integer>> tagBooks;

    public Library() {
        books = new ArrayList<>();
        initBooks();
    }

    private void initBooks() {
        Context context = getContext();
        String json = JsonReader.loadJSONFromAsset(context, "data/books.json");
        JSONArray bookArray = JSON.parseArray(json);
        int i = 0;
        try {

            for (Object bookObj : bookArray) {
                i += 1;
                JSONObject bookJson = (JSONObject) bookObj;
                int id = bookJson.getIntValue("id");
                String name = bookJson.getString("name");
                String url = bookJson.getString("url");
                String img = bookJson.getString("img");
                String baseTag = bookJson.getString("base_tag");
                String subTag = bookJson.getString("sub_tag");
                String writer = bookJson.getString("writer");
                String nation = bookJson.getString("nation");
                String comment = bookJson.getString("comment");
                String score = bookJson.getString("score");
                int pages = bookJson.getIntValue("pages");
                if (tagBooks.containsKey(subTag)) {
                    tagBooks.get(subTag).add(id);
                } else {
                    ArrayList<Integer> ids = new ArrayList<>();
                    ids.add(id);
                    tagBooks.put(subTag, ids);
                }
                Book book = new Book(id, name, url, img, baseTag, subTag, writer, nation, comment, score, pages, 10);
                books.add(book);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Book getBookById(int id) {
        return books.get(id);
    }
}
