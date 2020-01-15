package com.example.recyclerviewpoc.visit;

import com.example.recyclerviewpoc.viewholder.Listable;
import com.example.recyclerviewpoc.viewholder.VisitHolders;

public abstract class VisitListable<T extends VisitHolders> extends Listable<T> {

    public abstract void showIcon(boolean show);

}
