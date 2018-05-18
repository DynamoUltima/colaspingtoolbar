package com.example.joel.colaspingtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bankCard,ideasCard,addCard,linksCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bankCard = (CardView)findViewById(R.id.bankcard);
        ideasCard = (CardView)findViewById(R.id.ideascard);
        addCard = (CardView)findViewById(R.id.addcard);
        linksCard = (CardView)findViewById(R.id.linkscard);

        bankCard.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
        linksCard.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){

            case R.id.bankcard :i = new Intent(this,bank.class);startActivity(i); break;
            case R.id.ideascard :i = new Intent(this,ideas.class);startActivity(i);break;
            case R.id.addcard :i = new Intent(this,add.class);startActivity(i);break;
            case R.id.linkscard :i = new Intent(this,links.class);startActivity(i);break;
            default:break;
        }


    }
}
