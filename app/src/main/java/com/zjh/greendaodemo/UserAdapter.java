package com.zjh.greendaodemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zjh.greendaodemo.greendao.User;

import java.util.List;

/**
 * Created by zjh on 2016/7/17.
 */
public class UserAdapter extends BaseAdapter {
    private Context mContext;
    private List<User> mUserList;
    private LayoutInflater mLayoutInflater;

    private TextView textView;

    public UserAdapter(Context context, List<User> mUserList) {
        this.mContext = context;
        this.mUserList = mUserList;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return mUserList.size();
    }

    @Override
    public User getItem(int position) {
        return mUserList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.item_adapter, parent, false);
            textView = (TextView) convertView.findViewById(R.id.text);
            textView.setText(mUserList.get(position).getName());
        }
        return convertView;
    }
}
