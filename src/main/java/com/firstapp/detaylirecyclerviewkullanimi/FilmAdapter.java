package com.firstapp.detaylirecyclerviewkullanimi;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FilmAdapter {
    private Context mContext;
    private List<Filmler> filmlerList;

    public FilmAdapter(Context mContext, List<Filmler> filmlerList) {
        this.mContext = mContext;
        this.filmlerList = filmlerList;
    }

    public class CardViewTasarimNesneleriniTutucu extends RecyclerView.ViewHolder {
        
    }
}
