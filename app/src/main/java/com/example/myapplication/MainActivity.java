package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginig);


    }
    public void onClickSignIn(View v){
        Intent intent2 = new Intent(MainActivity.this, SignUp.class);
        startActivity(intent2);


    }
    public  void onClickVhod(View v){
        EditText log = (EditText) findViewById(R.id.editTextTextEmailAddress);
        EditText pas = (EditText) findViewById(R.id.editTextTextPassword);
        if (log.getText().toString().equals("serk") && pas.getText().toString().equals("123")){
            Intent o = new Intent(MainActivity.this, StartScreen.class);
            startActivity(o);
            finish();

        }else
        {
            Toast.makeText(this,"Неправильно веден пароль или логин", Toast.LENGTH_SHORT).show();
        }

    }
}

      //  btnLogin.setOnClickListener(new View.OnClickListener() {
         //   @Override
          //  public void onClick(View v) {
           //     if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty(password.getText().toString())){
          //          Toast.makeText(MainActivity.this,  "Username / Password Requaidred", Toast.LENGTH_LONG ).show();
         //       }


        //    else{
          //      login();

        //    }
       // });


   // }
   // }
//}
  //  public void login(){
     //   LoginRequest loginRequest = new LoginRequest();
     //   LoginRequest.setUsername(username.getText(),toString());
    //    LoginRequest.setPassword(password.getText(),toString());

   //     Call<LoginResponse> LoginResponceCall = ApiClient.getUserService().userLogin(LoginRequest);
   //     LoginResponceCall.enqueue(new Call.Callback<LoginResponse>(){

   //     }

  //  }
//}