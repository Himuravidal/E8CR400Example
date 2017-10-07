package com.example.adacher.e8cr400;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

/**
 * Created by adacher on 30-05-17.
 */

public class Nodes {


    private DatabaseReference root = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference movies() {
        return root.child("movies");

    }

    public DatabaseReference movieByKey(String key) {
        return movies().child(key);
    }


    public Query movieScore() {
        return root.child("Movie_Score").orderByValue();
    }




    public Query query() {
        return root.child("movies").orderByValue();
    }


    public Query user(String email) {

        return root.child("users").orderByChild("email").equalTo(email);

    }


    /*public Query query() {

        return root.child("movies").orderByChild("genre_score").equalTo("Drama_7");

    }
*/

}
