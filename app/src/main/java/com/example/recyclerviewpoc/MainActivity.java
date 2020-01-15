package com.example.recyclerviewpoc;

import android.os.Bundle;

import com.example.recyclerviewpoc.adapter.CheckListAdapter;
import com.example.recyclerviewpoc.checklist.CheckListListable;
import com.example.recyclerviewpoc.types.ImageTypeItem;
import com.example.recyclerviewpoc.types.InputTypeItem;
import com.example.recyclerviewpoc.types.ViewTypeItem;
import com.example.recyclerviewpoc.viewholder.CheckHolders;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    List<CheckListListable> checkListListables = new ArrayList<>();
    CheckListAdapter adapter = new CheckListAdapter();

    List<CheckListListable<CheckHolders>> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        InputTypeItem inputTypeItem = new InputTypeItem("ABCD");
        checkListListables.add(inputTypeItem);
        ViewTypeItem viewTypeItem = new ViewTypeItem();
        checkListListables.add(viewTypeItem);
        ImageTypeItem imageTypeItem = new ImageTypeItem();
        checkListListables.add(imageTypeItem);
        checkListListables.add(viewTypeItem);
        checkListListables.add(viewTypeItem);
        checkListListables.add(viewTypeItem);
        checkListListables.add(viewTypeItem);
        checkListListables.add(inputTypeItem);
        checkListListables.add(inputTypeItem);
        checkListListables.add(inputTypeItem);
        checkListListables.add(imageTypeItem);
        checkListListables.add(imageTypeItem);


        adapter.setItems(checkListListables);

    }
}
