package com.example.wafill;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Bundle bundle=new Bundle();
//        bundle.getString("hellorKey");
//        Toast.makeText(getContext(),"rwn"+bundle,Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_profile, container, false);


    }
}
