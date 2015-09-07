package com.example.android.firebaseexample;

import com.firebase.client.ValueEventListener;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.firebaseexample.News.CricketNews;
import com.example.android.firebaseexample.News.Item;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements ValueEventListener {

    private final String LOG_TAG = MainActivityFragment.class.getSimpleName();
    private Firebase mRef;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(getContext());
        mRef = new Firebase("https://monusurana.firebaseio.com/news");
        mRef.addValueEventListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        Log.d(LOG_TAG, "onDataChange ");
        CricketNews cricketNews = dataSnapshot.getValue(CricketNews.class);
        List<Item> items = cricketNews.getItem();
        for (int i = 0; i < items.size(); i++) {
            Log.d(LOG_TAG, items.get(i).getTitle());
        }
    }

    @Override
    public void onCancelled(FirebaseError firebaseError) {

    }
}
