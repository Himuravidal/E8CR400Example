package com.example.adacher.e8cr400;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.movieFragment);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        MovieAdapter adapter = new MovieAdapter();
        recyclerView.setAdapter(adapter);


        Movie movie1 = new Movie();
        movie1.setName("hola hola");
        movie1.setGenre("dfsdfsfsdfsdf");
        movie1.setScore("9.5");
        movie1.setYear("1986");
        movie1.setId("243");

        new Nodes().movies().push().setValue(movie1);


/*          new Nodes().user("pruesdsdsda@prueba.com").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                User user = dataSnapshot.getChildren().iterator().next().getValue(User.class);
                    Log.d("USER", user.getName());

                } else {
                    Log.d("USER", "No existe el usuario");
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/
    }



}
