package com.example.alumnos.juancmhnd2;

import com.example.alumnos.juancmhnd2.bein.PersonajesBean;


import java.util.ArrayList;


public class PersonajesInfo {

    public static ArrayList<PersonajesBean> getPersonajes(){

        ArrayList<PersonajesBean> personajes = new ArrayList<>();

        personajes.add(new PersonajesBean( R.drawable.boss, "Boss Satan","Desde que te crearon te tuvo en su punto de mira." , "Es una de las naves con más defensa de la galaxia tienes que ser el mejor para vencelor."));
        personajes.add(new PersonajesBean( R.drawable.enemy, "Enemy Star","Un contrincante con el que tendras la mayoria de batallas." , "Cuidado tiene un nivel bajo pero en grupos grandes son mortales."));
        personajes.add(new PersonajesBean( R.drawable.gladiator, "Gladiator PP","Esta será tu nave con una tecnologia de ultima generación." , "Tiene un armamento de ultima generación y una velocidad inmejorable para una sensación inmejorable."));


        return personajes;

    }
}
