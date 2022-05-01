package com.openclassrooms.entrevoisins.ui.neighbour;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NeighbourActivity extends AppCompatActivity {

    @BindView(R.id.imageView)
    ImageView avatar;
    @BindView(R.id.textView)
    TextView nom1;
    @BindView(R.id.textView2)
    TextView nom2;
    @BindView(R.id.textView3)
    TextView adress;
    @BindView(R.id.textView4)
    TextView phoneNumber;
    @BindView(R.id.textView5)
    TextView socialNetwork;
    @BindView(R.id.textView7)
    TextView aboutMe;
    @BindView(R.id.floatingActionButton)
    FloatingActionButton favoriteButton;
    @BindView(R.id.imageButton)
    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_neighbour);
        ButterKnife.bind(this);
//        init();
    }
/*    public static void goTo(NeighbourFragment activity) {
        Intent intent = new Intent(activity, NeighbourActivity.class);
        ActivityCompat.startActivity(activity, intent, null);
    }*/ //todo ne marche pas

//    Intent mNeighbour = this.getIntent();

/*    String name = Neighbour.

    private void init() {
        nom1.setText();
        ;
    }*/
}