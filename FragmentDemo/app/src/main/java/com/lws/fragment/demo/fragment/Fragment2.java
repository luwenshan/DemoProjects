package com.lws.fragment.demo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.lws.fragment.demo.R;

import timber.log.Timber;

/**
 * Created by lws on 2017/12/25.
 */

public class Fragment2 extends Fragment {
    @Override
    public void onAttach(Context context) {
        Timber.d("[onAttach] BEGIN");
        super.onAttach(context);
        Timber.d("[onAttach] END");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Timber.d("[onCreate] BEGIN");
        super.onCreate(savedInstanceState);
        Timber.d("[onCreate] END");
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Timber.d("[onViewCreated] BEGIN");
        super.onViewCreated(view, savedInstanceState);
        Timber.d("[onViewCreated] END");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Timber.d("[onActivityCreated] BEGIN");
        super.onActivityCreated(savedInstanceState);
        Timber.d("[onActivityCreated] END");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Timber.d("[onCreateView]");
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        Button btn = view.findViewById(R.id.btn_go);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 f3 = Fragment3.newInstance();
                getFragmentManager().beginTransaction()
                        .replace(R.id.container, f3, "f3")
                        .addToBackStack(Fragment3.class.getSimpleName())
                        .commit();
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        Timber.d("[onStart] BEGIN");
        super.onStart();
        Timber.d("[onStart] END");
    }

    @Override
    public void onResume() {
        Timber.d("[onResume] BEGIN");
        super.onResume();
        Timber.d("[onResume] END");
    }

    @Override
    public void onPause() {
        Timber.d("[onPause] BEGIN");
        super.onPause();
        Timber.d("[onPause] END");
    }

    @Override
    public void onStop() {
        Timber.d("[onStop] BEGIN");
        super.onStop();
        Timber.d("[onStop] END");
    }

    @Override
    public void onDestroyView() {
        Timber.d("[onDestroyView] BEGIN");
        super.onDestroyView();
        Timber.d("[onDestroyView] END");
    }

    @Override
    public void onDestroy() {
        Timber.d("[onDestroy] BEGIN");
        super.onDestroy();
        Timber.d("[onDestroy] END");
    }

    @Override
    public void onDetach() {
        Timber.d("[onDetach] BEGIN");
        super.onDetach();
        Timber.d("[onDetach] END");
    }

    public static Fragment2 newInstance() {
        return new Fragment2();
    }
}
