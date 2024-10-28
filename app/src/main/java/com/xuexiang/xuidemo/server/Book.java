/*
 * Copyright (C) 2024 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.xuidemo.server;

import java.util.ArrayList;

public class Book {
        private int id;
        private String name;
        private String url;
        private String img;
        private String base_tag;
        private String sub_tag;
        private String writer;
        private String nation;
        private String comment;
        private String score;
        private int pages;
        private int nums;
        private ArrayList<BorrowInfo> borrowInfos;

        // 构造方法
        public Book(int id, String name, String url, String img, String base_tag, String sub_tag, String writer, String nation, String comment, String score, int pages, int nums) {
            this.id = id;
            this.name = name;
            this.url = url;
            this.img = img;
            this.base_tag = base_tag;
            this.sub_tag = sub_tag;
            this.writer = writer;
            this.nation = nation;
            this.comment = comment;
            this.score = score;
            this.pages = pages;
            this.nums = nums;
            borrowInfos = new ArrayList<>();
        }

        public boolean borrow(String borrowerId, String borrowDate, String returnDate, boolean isReturned) {
            if (nums <= borrowInfos.size()) {
                return false;
            }
            borrowInfos.add(new BorrowInfo(borrowerId, borrowDate, returnDate, isReturned));
            return true;
        }

        public boolean returnBook(String borrowerId) {
            for (BorrowInfo borrowInfo : borrowInfos) {
                if (borrowInfo.getBorrowerId().equals(borrowerId)) {
                    borrowInfos.remove(borrowInfo);
                    return true;
                }
            }
            return false;
        }

        public int getId() {
            return id;
        }
    }



