package com.example.alumnos.juancmhnd2;


import com.example.alumnos.juancmhnd2.bein.TipsBean;

import java.util.ArrayList;

/**
 * Created by ALUMNOS on 16/03/2017.
 */

public class TipsInfo {

    public static ArrayList<TipsBean> getTips(){

        ArrayList<TipsBean> tips = new ArrayList<>();

        tips.add(new TipsBean( "INFOTIPS","Para saber todo lo necesario sobre tips y secretos ir a la pagina oficial"));
        tips.add(new TipsBean(  "FIX ERROR","Arreglo de todos los problemas de compatibilidad en otros moviles de gama china o desconocida"));
        tips.add(new TipsBean(  "4K EXPIRIENCE","Quereis sentir más que nunca la calidad en tu pantalla,con la proxima actualización podras verlo hasta en 4K" ));


        return tips;

    }
}

