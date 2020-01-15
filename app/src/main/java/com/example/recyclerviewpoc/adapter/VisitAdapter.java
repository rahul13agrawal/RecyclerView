package com.example.recyclerviewpoc.adapter;

import android.view.ViewGroup;

import com.example.recyclerviewpoc.TypeMapper;
import com.example.recyclerviewpoc.viewholder.VisitHolders;
import com.example.recyclerviewpoc.visit.VisitListable;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VisitAdapter extends RecyclerView.Adapter<VisitHolders> {
    private List<VisitListable<VisitHolders>> items;

    @NonNull
    @Override
    public VisitHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = TypeMapper.getViewHolderForType(parent, viewType);
        if (viewHolder instanceof VisitHolders) {
            return (VisitHolders) viewHolder;
        }
        throw new RuntimeException("");
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType().getType();
    }

    @Override
    public void onBindViewHolder(@NonNull VisitHolders holder, int position) {
        VisitListable<VisitHolders> item = items.get(position);
        item.onBind(holder);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(List<VisitListable<VisitHolders>> items) {
        this.items = items;
    }

}
