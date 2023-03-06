package com.example.Quotify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.Quotify.categories.CategoriesAdapter;
import com.example.Quotify.categories.CategoriesList;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<CategoriesList> categoriesLists = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView categoriesRecyclerView = findViewById(R.id.categoriesRecyclerView);

        categoriesRecyclerView.setHasFixedSize(true);
        categoriesRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this,2));

        // add categories to categoriesLists
        CategoriesList loveCategory = new CategoriesList("Love", R.drawable.love);
        categoriesLists.add(loveCategory); // add love category to categoriesLists

        CategoriesList motivationCategory = new CategoriesList("Motivation", R.drawable.motivation);
        categoriesLists.add(motivationCategory); // add motivation category to categoriesLists

        CategoriesList englishCategory = new CategoriesList("English", R.drawable.english);
        categoriesLists.add(englishCategory); // add english category to categoriesLists

        CategoriesList successCategory = new CategoriesList("Success", R.drawable.success);
        categoriesLists.add(successCategory); // add success category to categoriesLists

        CategoriesList lifeCategory = new CategoriesList("Life", R.drawable.life);
        categoriesLists.add(lifeCategory); // add life category to categoriesLists

        // set adapter to recyclerview
        categoriesRecyclerView.setAdapter(new CategoriesAdapter(categoriesLists, MainActivity.this));
    }
}