package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHiiWorld;
    private boolean isHelloWorldShowing;


    private TextView txtProfession;

    private ImageView imageTiger;
    private ImageView imageLion;
    private boolean isLionImageShowing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         txtHelloWorld =findViewById(R.id.txtHelloWorld);
         txtHiiWorld=findViewById(R.id.txtHiiWorld);

         txtProfession=findViewById(R.id.txtProfession);



         txtHelloWorld.setX(2000f);
         txtHiiWorld.setX(-2000f);
         txtProfession.setY(3000f);

         txtHelloWorld.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                //txtHelloWorld.animate().alpha(0.0f).setDuration(3000);
                //txtHiiWorld.animate().alpha(1.0f).setDuration(3000);
                 txtHiiWorld.animate().rotationBy(600).setDuration(1000);
//                 txtHiiWorld.animate().scaleX(100f).setDuration(1000);
//                 txtHelloWorld.animate().scaleY(100f).setDuration(1000);


                 if(isHelloWorldShowing){
                     Toast.makeText(MainActivity.this, "Hello world text is tapped", Toast.LENGTH_SHORT).show();
                     txtHelloWorld.animate().alpha(0.0f).setDuration(3000); //for text fadding
                     txtHiiWorld.animate().alpha(1.0f).setDuration(3000);
                            isHelloWorldShowing=false;
                 }
                 else{
                     Toast.makeText(MainActivity.this, "Hii world text is tapped", Toast.LENGTH_SHORT).show();
                     txtHiiWorld.animate().alpha(0.0f).setDuration(3000);
                     txtHelloWorld.animate().alpha(1.0f).setDuration(3000);
                           isHelloWorldShowing=true;
                  }


             }
         });

        txtProfession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               //   txtProfession.animate().translationX(3000f).setDuration(3000);
              //  txtProfession.animate().translationY(3000f).setDuration(3000);
              // txtProfession.animate().translationZ(3000f).setDuration(3000);
              // txtProfession.animate().translationXBy(3000f).setDuration(3000);
          //  txtProfession.animate().translationYBy(700f).setDuration(3000);
            //txtProfession.animate().rotation(360f).setDuration(3000);
        //    txtProfession.animate().scaleX(100f).setDuration(3000);

                //txtProfession.animate().rotationBy(90f).translationX(90f).alpha(0.8f).setDuration(3000);

                txtProfession.animate().scaleX(0.5f).scaleY(0.5f).setDuration(5000);

            }
        });

              imageTiger =findViewById(R.id.imageTiger);
              imageLion = findViewById(R.id.imageLion);

              imageLion.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {


                      if(isLionImageShowing){
                          Toast.makeText(MainActivity.this, "Lion image is tapped", Toast.LENGTH_SHORT).show();
                          imageLion.animate().alpha(0.0f).setDuration(3000);
                          imageTiger.animate().alpha(1.0f).setDuration(3000);
                              isLionImageShowing=false;
                      }
                      else{
                          Toast.makeText(MainActivity.this, "Tiger image is tapped", Toast.LENGTH_SHORT).show();
                            imageTiger.animate().alpha(0.0f).setDuration(3000);
                            imageLion.animate().alpha(1.0f).setDuration(3000);
                            isLionImageShowing=true;
                      }
                  }
              });


    }

    public void animateButtonIsClicked(View view) {
        Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        txtHelloWorld.animate().translationXBy(-2000f).setDuration(3000);
        txtHiiWorld.animate().translationXBy(2000f).setDuration(3000);
        txtProfession.animate().translationYBy(-3000f).setDuration(3000);
    }
}