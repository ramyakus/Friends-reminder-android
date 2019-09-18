package com.trulden.friends.adapter;

import android.view.View;

public interface OnClickListener<T> {
    void onItemClick(View view, T obj, int pos);
    void onItemLongClick(View view, T obj, int pos);
}
