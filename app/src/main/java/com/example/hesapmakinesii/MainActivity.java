package com.example.hesapmakinesii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonEkle , buttonCıkar , buttonBol ,
            buttonCarp, buttonC , buttonEsittir , buttonNokta;

    TextView islem, tumIslemler;

    float deger1 , deger2 ;

    boolean Toplama , Cıkarma ,Carpma ,Bolme ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 =findViewById(R.id.button0);
        button1 =findViewById(R.id.button1);
        button2 =findViewById(R.id.button2);
        button3 =findViewById(R.id.button3);
        button4 =findViewById(R.id.button4);
        button5 =findViewById(R.id.button5);
        button6 =findViewById(R.id.button6);
        button7 =findViewById(R.id.button7);
        button8 =findViewById(R.id.button8);
        button9 =findViewById(R.id.button9);

        buttonNokta =findViewById(R.id.buttonNokta);
        buttonEkle =findViewById(R.id.buttonEkle);
        buttonCıkar =findViewById(R.id.buttonCıkar);
        buttonCarp =findViewById(R.id.buttonCarp);
        buttonBol =findViewById(R.id.buttonBol);
        buttonC =findViewById(R.id.buttonTemizle);
        buttonEsittir =findViewById(R.id.buttonEsittir);


        islem =findViewById(R.id.Sonuc);
        tumIslemler =findViewById(R.id.TumSonuc);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"1");
                tumIslemler.setText(tumIslemler.getText()+"1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"2");
                tumIslemler.setText(tumIslemler.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"3");
                tumIslemler.setText(tumIslemler.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"4");
                tumIslemler.setText(tumIslemler.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"5");
                tumIslemler.setText(tumIslemler.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"6");
                tumIslemler.setText(tumIslemler.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"7");
                tumIslemler.setText(tumIslemler.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"8");
                tumIslemler.setText(tumIslemler.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"9");
                tumIslemler.setText(tumIslemler.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+"0");
                tumIslemler.setText(tumIslemler.getText()+"0");
            }
        });

        buttonEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (islem == null){
                    islem.setText("");
                }else {
                    tumIslemler.setText(tumIslemler.getText()+"+");
                    deger1 = Float.parseFloat(islem.getText() + "");
                    Toplama = true;
                    islem.setText(null);
                }
            }
        });
        buttonCıkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tumIslemler.setText(tumIslemler.getText()+"-");
                deger1 = Float.parseFloat(islem.getText() + "");
                Cıkarma = true ;
                islem.setText(null);
            }
        });

        buttonCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tumIslemler.setText(tumIslemler.getText()+"*");
                deger1 = Float.parseFloat(islem.getText() + "");
                Carpma  = true ;
                islem.setText(null);
            }
        });

        buttonBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tumIslemler.setText(tumIslemler.getText()+"/");
                deger1 = Float.parseFloat(islem.getText()+"");
                Bolme = true ;
                islem.setText(null);
            }
        });

        buttonEsittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger2 = Float.parseFloat(islem.getText() + "");

                if (Toplama == true){

                    islem.setText(deger1 + deger2 +"");
                    Toplama=false;
                }


                if (Cıkarma == true){
                    islem.setText(deger1 - deger2+"");
                    Cıkarma=false;
                }

                if (Carpma == true){
                    islem.setText(deger1 * deger2+"");
                    Carpma =false;
                }

                if (Bolme == true){
                    islem.setText(deger1 / deger2+"");
                    Bolme=false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText("");
                tumIslemler.setText("");
            }
        });

        buttonNokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setText(islem.getText()+".");
                tumIslemler.setText(tumIslemler.getText()+".");
            }
        });

    }
}