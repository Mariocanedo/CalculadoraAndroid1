package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // infla vista
        setContentView(R.layout.activity_main);



        // cambiar elementos a EditText
        // recibir datos desde layot
        EditText txt1 =findViewById(R.id.num1);
        EditText txt2 = findViewById(R.id.num2);
        TextView txt3 = findViewById(R.id.resul);


        Button btn = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);


      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              String num1 = txt1.getText().toString();
              String num2 = txt2.getText().toString();

              if(txt1.getText().toString().isEmpty() || txt2.getText().toString().isEmpty())
              {
                  Toast mensaje = Toast.makeText(getApplicationContext(),"INGRESE TODOS LOS VALORES",Toast.LENGTH_LONG);
                  mensaje.show();

              }

              int resul = Integer.parseInt(num1)+ Integer.parseInt(num2);
              txt3.setText("El resultado es :"+ resul);
              txt1.setText("");
              txt2.setText("");
          }
      });


      ////////////////////////////// BUTTON RESTAR



      btn2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

          }
      });













    }
}




