package com.example.cerouno;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentContainer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;

import static com.example.cerouno.R.id.botonOk;
import static com.example.cerouno.R.id.can_ant;
import static com.example.cerouno.R.id.canal0;
import static com.example.cerouno.R.id.canal1;
import static com.example.cerouno.R.id.canal2;
import static com.example.cerouno.R.id.canal3;
import static com.example.cerouno.R.id.canal4;
import static com.example.cerouno.R.id.canal5;
import static com.example.cerouno.R.id.canal6;
import static com.example.cerouno.R.id.canal7;
import static com.example.cerouno.R.id.canal8;
import static com.example.cerouno.R.id.canal9;
import static com.example.cerouno.R.id.canalDw;
import static com.example.cerouno.R.id.canalUp;
import static com.example.cerouno.R.id.flechaDw;
import static com.example.cerouno.R.id.flechaLeft;
import static com.example.cerouno.R.id.flechaRight;
import static com.example.cerouno.R.id.flechaUp;
import static com.example.cerouno.R.id.input_tv;
import static com.example.cerouno.R.id.mute;
import static com.example.cerouno.R.id.onOff_tv;
import static com.example.cerouno.R.id.volumeDw;
import static com.example.cerouno.R.id.volumeUp;




public class Televisor extends Fragment implements View.OnClickListener{

    public Button btn_input;
    public Button btn_power;
    public Button btn_mute;
    public Button btn_anterior;

    public Button btn_ch0;
    public Button btn_ch1;
    public Button btn_ch2;
    public Button btn_ch3;
    public Button btn_ch4;
    public Button btn_ch5;
    public Button btn_ch6;
    public Button btn_ch7;
    public Button btn_ch8;
    public Button btn_ch9;

    public Button btn_volumeUp;
    public Button btn_volumeDw;
    public Button btn_canalUp;
    public Button btn_canalDw;

    public Button btn_flechaUp;
    public Button btn_flechaDw;
    public Button btn_flechaRight;
    public Button btn_flechaLeft;
    public Button btn_botonOk;


    private List <Integer> identificadores;
    private static final int[] botones_ids = {

            input_tv,
            onOff_tv,
            mute,
            can_ant,
            canal0,
            canal1,
            canal2,
            canal3,
            canal4,
            canal5,
            canal6,
            canal7,
            canal8,
            canal9,
            volumeUp,
            volumeDw,
            canalUp,
            canalDw,
            flechaUp,
            flechaDw,
            flechaLeft,
            flechaRight,
            botonOk
    };

    private admin admin = new admin("","");


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View myView = inflater.inflate(R.layout.fragment_televisor, container, false);

        listeners(myView);

        return myView;
    }


    @Override
    public void onClick(View view) {

        Log.d("prueba", view.getTag().toString());
    }

    private void listeners(View myView){


            btn_input = myView.findViewById(input_tv);
            btn_input.setOnClickListener(this);

            btn_power = myView.findViewById(R.id.onOff_tv);
            btn_power.setOnClickListener(this);

            btn_mute = myView.findViewById(R.id.mute);
            btn_mute.setOnClickListener(this);

            btn_anterior = myView.findViewById(R.id.can_ant);
            btn_anterior.setOnClickListener(this);

            btn_ch0 = myView.findViewById(R.id.canal0);
            btn_ch0.setOnClickListener(this);

            btn_ch1 = myView.findViewById(R.id.canal1);
            btn_ch1.setOnClickListener(this);

            btn_ch2 = myView.findViewById(R.id.canal2);
            btn_ch2.setOnClickListener(this);

            btn_ch3 = myView.findViewById(R.id.canal3);
            btn_ch3.setOnClickListener(this);

            btn_ch4 = myView.findViewById(R.id.canal4);
            btn_ch4.setOnClickListener(this);

            btn_ch5 = myView.findViewById(R.id.canal5);
            btn_ch5.setOnClickListener(this);

            btn_ch6 = myView.findViewById(R.id.canal6);
            btn_ch6.setOnClickListener(this);

            btn_ch7 = myView.findViewById(R.id.canal7);
            btn_ch7.setOnClickListener(this);

            btn_ch8 = myView.findViewById(R.id.canal8);
            btn_ch8.setOnClickListener(this);

            btn_ch9 = myView.findViewById(R.id.canal9);
            btn_ch9.setOnClickListener(this);

            btn_volumeUp = myView.findViewById(R.id.volumeUp);
            btn_volumeUp.setOnClickListener(this);

            btn_volumeDw = myView.findViewById(R.id.volumeDw);
            btn_volumeDw.setOnClickListener(this);

            btn_canalUp = myView.findViewById(R.id.canalUp);
            btn_canalUp.setOnClickListener(this);

            btn_canalDw = myView.findViewById(R.id.canalDw);
            btn_canalDw.setOnClickListener(this);

            btn_flechaUp = myView.findViewById(R.id.flechaUp);
            btn_flechaUp.setOnClickListener(this);

            btn_flechaDw = myView.findViewById(R.id.flechaDw);
            btn_flechaDw.setOnClickListener(this);

            btn_flechaLeft = myView.findViewById(R.id.flechaLeft);
            btn_flechaLeft.setOnClickListener(this);

            btn_flechaRight = myView.findViewById(R.id.flechaRight);
            btn_flechaRight.setOnClickListener(this);

            btn_botonOk = myView.findViewById(R.id.botonOk);
            btn_botonOk.setOnClickListener(this);

        }
    }

