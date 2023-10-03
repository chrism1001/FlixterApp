package com.example.flixter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MovieRecyclerViewAdapter (
    private val movies: List<Movie>,
    private val mListener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<MovieRecyclerViewAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: Movie? = null
        val mMovieTitle: TextView = mView.findViewById<View>(R.id.movie_title) as TextView
        val mMovieDescription: TextView = mView.findViewById<View>(R.id.movie_description) as TextView
        val mMoviePoster: ImageView = mView.findViewById<View>(R.id.movie_poster) as ImageView

        override fun toString(): String {
            return mMovieTitle.toString();
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieRecyclerViewAdapter.MovieViewHolder, position: Int) {
        val movie = movies[position]

        holder.mItem = movie
        holder.mMovieTitle.text = movie.title
        holder.mMovieDescription.text = movie.description
        Log.d("description", movie.description.toString())

        Glide.with(holder.mView)
            .load("https://image.tmdb.org/t/p/w500/" + movie.poster_path)
            .centerInside()
            .into(holder.mMoviePoster)
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}
