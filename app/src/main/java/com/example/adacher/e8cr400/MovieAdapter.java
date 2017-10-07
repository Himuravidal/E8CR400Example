package com.example.adacher.e8cr400;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;

/**
 * Created by adacher on 30-05-17.
 */

public class MovieAdapter extends FirebaseRecyclerAdapter<Movie, MovieAdapter.MovieHolder> {


    public MovieAdapter() {
        super(Movie.class, R.layout.list_item_movies, MovieHolder.class, new Nodes().query());
    }

    @Override
    protected void populateViewHolder(MovieHolder viewHolder, Movie model, int position) {

        viewHolder.name.setText(model.getName());
        viewHolder.genre.setText(model.getGenre());
        viewHolder.score.setText(model.getScore());
        viewHolder.year.setText(model.getYear());

    }

    public static class MovieHolder extends RecyclerView.ViewHolder {

        TextView name, score, genre, year;

        public MovieHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.nameTv);
            year = (TextView) itemView.findViewById(R.id.yearTV);
            genre = (TextView) itemView.findViewById(R.id.genreTV);
            score = (TextView) itemView.findViewById(R.id.scoreTV);
        }

    }




}
