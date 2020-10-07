package com.example.simplesurveycreator.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplesurveycreator.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainScreen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainScreen extends Fragment {

    private RecyclerView recyclerViewInventory;
    private Button btn1;


    public MainScreen() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment MainScreen.
     */
    // TODO: Rename and change types and number of parameters
    public static MainScreen newInstance(String param1, String param2) {
        MainScreen fragment = new MainScreen();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {




        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main_screen, container, false);

        btn1 = (Button)rootView.findViewById(R.id.btnChoose);
        recyclerViewInventory = (RecyclerView) rootView.findViewById(R.id.recycler_view_inventory);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());

        recyclerViewInventory.setLayoutManager(mLayoutManager);
        recyclerViewInventory.setItemAnimator(new DefaultItemAnimator());
        recyclerViewInventory.addItemDecoration(new DividerItemDecoration(container.getContext(), LinearLayoutManager.VERTICAL));


templatemenue templatemenue = new templatemenue();

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

       getFragmentManager().beginTransaction().replace(R.id.fragmentContainer, templatemenue).addToBackStack(null).commit();



            }

        });

        return rootView;
    }
}