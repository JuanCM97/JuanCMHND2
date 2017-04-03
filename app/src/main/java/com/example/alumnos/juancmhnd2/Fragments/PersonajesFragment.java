package com.example.alumnos.juancmhnd2.Fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.alumnos.juancmhnd2.Adapter.PersonajesAdapter;
import com.example.alumnos.juancmhnd2.PersonajesInfo;
import com.example.alumnos.juancmhnd2.PersonajeActivity;
import com.example.alumnos.juancmhnd2.R;
import com.example.alumnos.juancmhnd2.bein.PersonajesBean;

import java.util.ArrayList;


public class PersonajesFragment extends Fragment implements AdapterView.OnItemClickListener {
    private ListView listpersonajes;
    private ArrayList<PersonajesBean>personajes;
    private static final String PERSONAJE_KEY="PERSONAJE_KEY";


    public PersonajesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_personajes, container, false);
        listpersonajes= (ListView) view.findViewById(R.id.item_personajes);
        personajes= PersonajesInfo.getPersonajes();
        PersonajesAdapter adapter= new PersonajesAdapter(getActivity(), R.layout.item_personaje,personajes);
        listpersonajes.setAdapter(adapter);
        listpersonajes.setOnItemClickListener(this);

        return view;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    public static PersonajesFragment newInstance() {
        return new PersonajesFragment();

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
    PersonajesBean personajesBean= personajes.get(i);
        Intent intent = new Intent(getActivity(), PersonajeActivity.class);
        intent.putExtra(PERSONAJE_KEY, personajesBean);
        startActivity(intent);
    }
}

