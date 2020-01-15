package com.example.recyclerviewpoc.adapter;

import android.view.ViewGroup;

import com.example.recyclerviewpoc.TypeMapper;
import com.example.recyclerviewpoc.checklist.CheckListListable;
import com.example.recyclerviewpoc.viewholder.CheckHolders;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CheckListAdapter extends RecyclerView.Adapter<CheckHolders> {

    private List<CheckListListable> items;

    @NonNull
    @Override
    public CheckHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = TypeMapper.getViewHolderForType(parent, viewType);
        if (viewHolder instanceof CheckHolders) {
            return (CheckHolders) viewHolder;
        }
        throw new RuntimeException("");
    }

    @Override
    public void onBindViewHolder(@NonNull CheckHolders holder, int position) {
        /*CheckListListable<CheckHolders> item = items.get(position);
        item.onBind(holder);*/
        items.get(position).onBind(holder);
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).getType().getType();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(List<CheckListListable> items) {
        this.items =  items;
    }
}
