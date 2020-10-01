package com.example.musicalstructureapp;

public class Book {

        /** Author of the book */
        private String mAuthorName;

        /** title of the book */
        private String mTitleName;


        private int mImageId;
        /**
         * Create a new Word object.
         *
         * @param authorName is author for the book
         *
         * @param titleName is the title for the book
         */
        public Book(String authorName, String titleName, int cover) {
            mAuthorName = authorName;
            mTitleName = titleName;
            mImageId = cover;
        }

        public Book(String authorName){
            mAuthorName = authorName;
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


        //get book cover
        public int getImageId() {
        return mImageId;
    }
        public void setImageId(int imageId) {
        mImageId = imageId;
    }
}
