package com.esteban_ramirez_osorio.punto1_practica1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bBoton;
    private RadioButton rCuadrado, rCirculo, rTriangulo, rCubo;
    private TextView tFondo, tLado, tRadio, tArea,tBase,tAltura;
    private EditText eLado, eRadio,eBase,eAltura;
    private int a = 0, area=0, bandera=0,perimetro=0,volumen=0;
    private String as = "",bs = "", area1="";
    private Double b=0.0,areab=0.0,perimetrob=0.0,c=0.0,d=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bBoton = (Button) findViewById((R.id.bBoton));
        tBase = (TextView) findViewById(R.id.tBase);
        tAltura = (TextView) findViewById(R.id.tAltura);
        tLado = (TextView) findViewById(R.id.tLado);
        tRadio = (TextView) findViewById(R.id.tRadio);
        tArea = (TextView) findViewById(R.id.tArea);
        tFondo = (TextView) findViewById(R.id.tFondo);
        rCuadrado = (RadioButton) findViewById(R.id.rCuadrado);
        rCirculo = (RadioButton) findViewById(R.id.rCirculo);
        rTriangulo = (RadioButton) findViewById(R.id.rTriangulo);
        rCubo = (RadioButton) findViewById(R.id.rCubo);
        eLado = (EditText) findViewById(R.id.eLado);
        eRadio = (EditText) findViewById(R.id.eRadio);
        eBase = (EditText) findViewById(R.id.ebase);
        eAltura = (EditText) findViewById(R.id.eAltura);


        rCirculo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                bandera = 1;
                tArea.setText("");
                tFondo.setBackground(getResources().getDrawable(R.drawable.a));
                eRadio.setVisibility(View.INVISIBLE);
                tRadio.setVisibility(View.INVISIBLE);
                eLado.setVisibility(View.VISIBLE);
                tLado.setVisibility(View.VISIBLE);
                eBase.setVisibility(View.INVISIBLE);
                tBase.setVisibility(View.INVISIBLE);
                eAltura.setVisibility(View.INVISIBLE);
                tAltura.setVisibility(View.INVISIBLE);



            }

        });
        rCuadrado.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                bandera = 2;
                tArea.setText("");
                tFondo.setBackground(getResources().getDrawable(R.drawable.b));
                eLado.setVisibility(View.INVISIBLE);
                tLado.setVisibility(View.INVISIBLE);
                eRadio.setVisibility(View.VISIBLE);
                tRadio.setVisibility(View.VISIBLE);
                eBase.setVisibility(View.INVISIBLE);
                tBase.setVisibility(View.INVISIBLE);
                eAltura.setVisibility(View.INVISIBLE);
                tAltura.setVisibility(View.INVISIBLE);

            }

        });

        rTriangulo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                bandera = 3;
                tArea.setText("");
                tFondo.setBackground(getResources().getDrawable(R.drawable.e));
                eLado.setVisibility(View.INVISIBLE);
                tLado.setVisibility(View.INVISIBLE);
                eRadio.setVisibility(View.INVISIBLE);
                tRadio.setVisibility(View.INVISIBLE);
                eBase.setVisibility(View.VISIBLE);
                tBase.setVisibility(View.VISIBLE);
                eAltura.setVisibility(View.VISIBLE);
                tAltura.setVisibility(View.VISIBLE);

            }

        });

        rCubo.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                tFondo.setBackground(getResources().getDrawable(R.drawable.d));
                bandera = 4;
                tArea.setText("");
                eRadio.setVisibility(View.INVISIBLE);
                tRadio.setVisibility(View.INVISIBLE);
                eLado.setVisibility(View.VISIBLE);
                tLado.setVisibility(View.VISIBLE);
                eBase.setVisibility(View.INVISIBLE);
                tBase.setVisibility(View.INVISIBLE);
                eAltura.setVisibility(View.INVISIBLE);
                tAltura.setVisibility(View.INVISIBLE);

            }

        });
        bBoton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                if (bandera == 1) {
                    as=eLado.getText().toString();
                    a=Integer.parseInt(as);
                    area=a*a;
                    perimetro=4*a;

                    tArea.setText("El area= "+area+"\nEl Perimetro es:"+perimetro+"\nEl volumen es:" +
                            "N/A");
                    eRadio.setText("");
                    eAltura.setText("");
                    eBase.setText("");
                }
                if (bandera == 2) {
                    as=eRadio.getText().toString();
                    b=Double.parseDouble(as);
                    areab=b*b*3.141598;
                    perimetrob=2*3.141598*b;

                    tArea.setText("El area= "+areab+"\nEl Perimetro es:"+perimetrob+"\nEl volumen es:" +
                            "N/A");
                    eLado.setText("");
                    eAltura.setText("");
                    eBase.setText("");
                }

                if (bandera == 3) {
                    as=eAltura.getText().toString();
                    b=Double.parseDouble(as);
                    bs=eBase.getText().toString();
                    c=Double.parseDouble(bs);
                    areab=(b*c)/2;
                    d=Math.sqrt(b+a);
                    perimetrob=b+c+d;

                    tArea.setText("El area del triangulo rectangulo es= "+areab+
                            "\nEl Perimetro del triangulo rectangulo es:"
                            +perimetrob+"\nEl volumen es:" +"N/A");
                    eLado.setText("");
                    eRadio.setText("");
                }

                if (bandera == 4) {
                    as=eLado.getText().toString();
                    a=Integer.parseInt(as);
                    area=a*a+6;
                    perimetro=4*a;
                    volumen=a*a*a;

                    tArea.setText("El area= "+area+"\nEl Perimetro es:"+"N/A"+"\nEl volumen es:" +
                            volumen);

                    eRadio.setText("");
                    eAltura.setText("");
                    eBase.setText("");
                }

            }
///////
            });

        }
    }