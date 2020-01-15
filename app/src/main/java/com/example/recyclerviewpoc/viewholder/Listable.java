package com.example.recyclerviewpoc.viewholder;

import com.example.recyclerviewpoc.TypeMapper;

public abstract class Listable<VH> {

    public abstract void onBind(VH viewHolder);

    public abstract TypeMapper.Type getType();
}
