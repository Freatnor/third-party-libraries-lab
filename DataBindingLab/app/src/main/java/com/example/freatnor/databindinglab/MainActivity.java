package com.example.freatnor.databindinglab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.freatnor.databindinglab.model.User;
import com.example.freatnor.databindinglab.presenter.DataBindingAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<User> users = initUsers();


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        DataBindingAdapter adapter = new DataBindingAdapter();
        adapter.setUsers(users);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private ArrayList<User> initUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("User1", "History", 20));
        users.add(new User("User2", "English", 22));
        users.add(new User("User3", "Economics", 24));
        users.add(new User("User4", "Physics", 17));
        users.add(new User("User5", "French", 30));
        return users;
    }
}
