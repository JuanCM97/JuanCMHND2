package com.example.alumnos.juancmhnd2;

import com.example.alumnos.juancmhnd2.bein.ObjetosBean;
import com.example.alumnos.juancmhnd2.bein.PersonajesBean;

import java.util.ArrayList;



public class ObjectosInfo {

        public static ArrayList<ObjetosBean> getObjetos(){

            ArrayList<ObjetosBean> objetos = new ArrayList<>();

            objetos.add(new ObjetosBean( R.drawable.rayolaser,"Rayo Laser","Simple pero eficaz en las distancias cortas" ));
            objetos.add(new ObjetosBean( R.drawable.superconcentrador, "Superconcentrador de Energia","Es un concentrador de energia para todas las distancias pero cuidado toma su tiempo en cargar"));
            objetos.add(new ObjetosBean( R.drawable.hiper, "HiperDes","Un Rayo que destruye por completo la gravedad de la nave enemiga" ));


            return objetos;

        }
    }