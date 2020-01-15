package com.example.recyclerviewpoc.checklist;

import com.example.recyclerviewpoc.viewholder.CheckHolders;
import com.example.recyclerviewpoc.viewholder.Listable;

public abstract class CheckListListable<T extends CheckHolders> extends Listable<T> {

    public abstract void showMandatoryText(boolean show);

}
