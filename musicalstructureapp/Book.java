package com.example.musicalstructureapp;

public class Book {

        /** Author of the book */
        private String mAuthorName;

        /** title of the book */
        private String mTitleName;

        /**
         * Create a new Word object.
         *
         * @param authorName is author for the book
         *
         * @param titleName is the title for the book
         */
        public Book(String authorName, String titleName) {
            mAuthorName = authorName;
            mTitleName = titleName;
        }

        /**
         * Get the author for the book.
         */
        public String getAuthorName() {
            return mAuthorName;
        }

        /**
         * Get the title for the book.
         */
        public String getTitleName() {
            return mTitleName;
        }


}
