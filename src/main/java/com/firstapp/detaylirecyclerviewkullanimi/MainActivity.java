package com.firstapp.detaylirecyclerviewkullanimi;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<Filmler> filmlerArrayList;
    private FilmAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        //CArd oluşumu tek sırada 2 tane olacak
        rv.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        Filmler f1 = new Filmler(1, "Django", "django",89.99);
        Filmler f2 = new Filmler(2, "Inception", "inception",99.99);
        Filmler f3 = new Filmler(3, "Interstellar", "interstellar",119.90);
        Filmler f4 = new Filmler(4, "The Hateful Eight", "thehatefuleight",79.99);
        Filmler f5 = new Filmler(5, "The Pianist", "thepianist",89.99);
        Filmler f6 = new Filmler(1, "Bir Zamanlar Anadoluda", "birzamanlaranadoluda",69.99);


        //array list oluşturma film nesnelerini yerleştirmek için

        filmlerArrayList = new ArrayList<>();

        filmlerArrayList.add(f1);
        filmlerArrayList.add(f2);
        filmlerArrayList.add(f3);
        filmlerArrayList.add(f4);
        filmlerArrayList.add(f5);
        filmlerArrayList.add(f6);

        adapter = new FilmAdapter(MainActivity.this, filmlerArrayList);
        rv.setAdapter(adapter);
    }
}