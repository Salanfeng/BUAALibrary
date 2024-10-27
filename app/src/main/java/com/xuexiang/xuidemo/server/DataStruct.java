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

public class DataStruct {
    public class Book {
        private String id;
        private String name;
        private String author;
        private String coverUrl;
        private String category;

        private String description;
        private BorrowInfo borrowInfo;

        // 构造方法
        public Book(String id, String name, String author, String coverUrl, String category, String description) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.coverUrl = coverUrl;
            this.category = category;
            this.description = description;
        }

        // Getter和Setter方法
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public BorrowInfo getBorrowInfo() {
            return borrowInfo;
        }

        public void setBorrowInfo(BorrowInfo borrowInfo) {
            this.borrowInfo = borrowInfo;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", coverUrl='" + coverUrl + '\'' +
                    ", category='" + category + '\'' +
                    ", borrowInfo=" + borrowInfo +
                    '}';
        }
    }

    public class BorrowInfo {
        private String borrowerId;
        private String borrowDate;
        private String returnDate;
        private boolean isReturned;

        // 构造方法
        public BorrowInfo(String borrowerId, String borrowDate, String returnDate, boolean isReturned) {
            this.borrowerId = borrowerId;
            this.borrowDate = borrowDate;
            this.returnDate = returnDate;
            this.isReturned = isReturned;
        }

        // Getter和Setter方法
        public String getBorrowerId() {
            return borrowerId;
        }

        public void setBorrowerId(String borrowerId) {
            this.borrowerId = borrowerId;
        }

        public String getBorrowDate() {
            return borrowDate;
        }

        public void setBorrowDate(String borrowDate) {
            this.borrowDate = borrowDate;
        }

        public String getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(String returnDate) {
            this.returnDate = returnDate;
        }

        public boolean isReturned() {
            return isReturned;
        }

        public void setReturned(boolean returned) {
            isReturned = returned;
        }

        @Override
        public String toString() {
            return "BorrowInfo{" +
                    "borrowerId='" + borrowerId + '\'' +
                    ", borrowDate='" + borrowDate + '\'' +
                    ", returnDate='" + returnDate + '\'' +
                    ", isReturned=" + isReturned +
                    '}';
        }
    }

}
