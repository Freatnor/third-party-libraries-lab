package com.example.freatnor.databindinglab.presenter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.freatnor.databindinglab.R;
import com.example.freatnor.databindinglab.databinding.RecyclerViewItemBinding;
import com.example.freatnor.databindinglab.model.User;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by Jonathan Taylor on 8/24/16.
 */
public class DataBindingAdapter extends RecyclerView.Adapter<DataBindingAdapter.DataBindingViewHolder> {

    private ArrayList<User> mUsers;

    public void setUsers(ArrayList users){
        mUsers = users;
    }

    @Override
    public DataBindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new DataBindingViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(DataBindingViewHolder holder, int position) {
        User user = mUsers.get(position);
        holder.getBinding().setUser(user);
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }


    public static class DataBindingViewHolder extends RecyclerView.ViewHolder{

        private RecyclerViewItemBinding mBinding;

        public DataBindingViewHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }

        public RecyclerViewItemBinding getBinding(){
            return mBinding;
        }

    }
}
