package com.example.flixter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MoveRecyclerViewAdapter (
    private val books: List<Movie>,
    private val mListener: OnListFragmentInteractionListener?
) : RecyclerView.Adapter<MoveRecyclerViewAdapter.MovieViewHolder>() {

    inner class MovieViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: Movie? = null
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MoveRecyclerViewAdapter.MovieViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MoveRecyclerViewAdapter.MovieViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
