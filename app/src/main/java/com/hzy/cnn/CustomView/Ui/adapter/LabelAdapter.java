package com.hzy.cnn.CustomView.Ui.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.hzy.cnn.CustomView.R;

import java.util.List;

public abstract  class LabelAdapter<T> {
    private List<T> datas;

    public LabelAdapter(List<T> datas) {
        this.datas = datas;
    }

    public abstract View getView(ViewGroup parent, int position, T t);

    public T getItem(int position) {
        return datas.get(position);
    }

    public int getCount(){
        return datas.size();
    }
}
