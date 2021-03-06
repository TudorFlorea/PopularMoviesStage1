package com.example.tudor.popularmovies.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tudor.popularmovies.DetailsActivity;
import com.example.tudor.popularmovies.R;
import com.example.tudor.popularmovies.data.Movie;
import com.example.tudor.popularmovies.utils.InterfaceUtils.MovieItemListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by tudor on 04.03.2018.
 */

public class MoviesRecyclerViewAdapter extends RecyclerView.Adapter<MoviesRecyclerViewAdapter.MovieViewHolder> {

    private Context mContext;
    private ArrayList<Movie> mMovies;
    protected MovieItemListener mListener;


    public MoviesRecyclerViewAdapter(Context context, ArrayList<Movie> movies, MovieItemListener itemListener) {
        this.mContext = context;
        this.mMovies = movies;
        this.mListener = itemListener;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.movie_recycler_view_item, parent, false);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.setData(mMovies.get(position));
    }

    @Override
    public int getItemCount() {

        return mMovies != null ? mMovies.size() : 0;
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.movie_poster_iv) ImageView imageView;
        public Movie movie;

        public MovieViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            ButterKnife.bind(this, itemView);

        }

        public void setData(Movie movieItem) {
            this.movie = movieItem;
            Picasso.with(mContext)
                    .load(movieItem.getPosterLink())
                    .placeholder(R.drawable.poster_placeholder)
                    .error(R.drawable.poster_error)
                    .into(imageView);
        }

        @Override
        public void onClick(View view) {
            if (mListener != null) {
                mListener.onItemClick(movie, DetailsActivity.class);
            }
        }
    }

}
