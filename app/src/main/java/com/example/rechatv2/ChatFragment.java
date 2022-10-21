package com.example.rechatv2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ChatFragment extends Fragment {
    Person[] MyFriends = new Person[20];
    RecyclerView mRecyclerView;
    ChatAdapter mChatAdapter;

    public ChatFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialDataset();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_chat, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.ChatRecycleView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mChatAdapter = new ChatAdapter(getContext(), MyFriends);
        mRecyclerView.setAdapter(mChatAdapter);
        return rootView;
    }

    public void initialDataset() {
        MyFriends[0] = new Person(ResourcesCompat.getDrawable(getResources(), R.drawable.avatar01, null),
                "曾浩", "10:30");
    }
}