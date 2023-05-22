package com.example.jumate;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ParentRecyclerViewAdapter extends RecyclerView.Adapter<ParentRecyclerViewAdapter.MyViewHolder> {
    private ArrayList<ParentModel> parentModelArrayList;
    public Context cxt;

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView category;
        public RecyclerView childRecyclerView;

        public MyViewHolder(View itemView) {
            super(itemView);

            category = itemView.findViewById(R.id.Movie_category);
            childRecyclerView = itemView.findViewById(R.id.Child_RV);
        }
    }

    public ParentRecyclerViewAdapter(ArrayList<ParentModel> exampleList, Context context) {
        this.parentModelArrayList = exampleList;
        this.cxt = context;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_recyclerview_items, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return parentModelArrayList.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        ParentModel currentItem = parentModelArrayList.get(position);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(cxt, LinearLayoutManager.HORIZONTAL, false);
        holder.childRecyclerView.setLayoutManager(layoutManager);
        holder.childRecyclerView.setHasFixedSize(true);

        holder.category.setText(currentItem.movieCategory());
        ArrayList<ChildModel> arrayList = new ArrayList<>();

        // added the first child row
        if (parentModelArrayList.get(position).movieCategory().equals("Computer Science")) {
            arrayList.add(new ChildModel(R.drawable.blank,"DSA"));
            arrayList.add(new ChildModel(R.drawable.blank,"Java"));
            arrayList.add(new ChildModel( R.drawable.blank,"C++"));
            arrayList.add(new ChildModel( R.drawable.blank,"OS"));
            arrayList.add(new ChildModel( R.drawable.blank,"CN"));
            arrayList.add(new ChildModel( R.drawable.blank,"CC"));
        }

        // added in second child row
        if (parentModelArrayList.get(position).movieCategory().equals("Civil")) {
            arrayList.add(new ChildModel(R.drawable.blank,"Electronics"));
            arrayList.add(new ChildModel(R.drawable.physics,"physics"));
            arrayList.add(new ChildModel( R.drawable.cad,"CAD"));
            arrayList.add(new ChildModel( R.drawable.blank,"Chemistry"));
            arrayList.add(new ChildModel( R.drawable.machinemechanics,"Mechanics"));
            arrayList.add(new ChildModel( R.drawable.design,"physics"));
        }

        // added in third child row
        if (parentModelArrayList.get(position).movieCategory().equals("Mechanical")) {
            arrayList.add(new ChildModel(R.drawable.fluids,"Fluid Machinery"));
            arrayList.add(new ChildModel(R.drawable.heattransfer,"heat transfer"));
            arrayList.add(new ChildModel( R.drawable.graphics,"Machine Drawing"));
            arrayList.add(new ChildModel( R.drawable.mechine,"workshop"));
            arrayList.add(new ChildModel( R.drawable.robotics,"Robotics"));
            arrayList.add(new ChildModel( R.drawable.cad,"CAD"));
        }

        // added in fourth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Electrical")) {
            arrayList.add(new ChildModel(R.drawable.circuit,"Electromechanics."));
            arrayList.add(new ChildModel(R.drawable.blank,"Circuit Theory"));
            arrayList.add(new ChildModel( R.drawable.physicalelectronics,"Physical Electronics"));
            arrayList.add(new ChildModel( R.drawable.computervision,"Computer Vision"));
            arrayList.add(new ChildModel( R.drawable.graphics,"Soft Computing"));
            arrayList.add(new ChildModel( R.drawable.blank,"VLSI Technology"));
        }

        // added in fifth child row
        if (parentModelArrayList.get(position).movieCategory().equals("MBA")) {
            arrayList.add(new ChildModel( R.drawable.blank,"Marketing."));
            arrayList.add(new ChildModel( R.drawable.blank,"HR management."));
            arrayList.add(new ChildModel( R.drawable.blank,"Business planning."));
            arrayList.add(new ChildModel( R.drawable.blank,"Entrepreneurship."));
            arrayList.add(new ChildModel( R.drawable.blank,"Business laws."));
            arrayList.add(new ChildModel( R.drawable.blank,"Communication skills"));
        }

        // added in sixth child row
        if (parentModelArrayList.get(position).movieCategory().equals("Design")) {
            arrayList.add(new ChildModel(R.drawable.blank,"Ergonomics."));
            arrayList.add(new ChildModel( R.drawable.blank,"Form Studies"));
            arrayList.add(new ChildModel( R.drawable.blank,"Graphic Design."));
            arrayList.add(new ChildModel( R.drawable.blank,"Basic of Design."));
            arrayList.add(new ChildModel( R.drawable.blank,"Design Methods"));
            arrayList.add(new ChildModel(R.drawable.blank,"Visual Design"));
        }

        ChildRecyclerViewAdapter childRecyclerViewAdapter = new ChildRecyclerViewAdapter(arrayList,holder.childRecyclerView.getContext());
        holder.childRecyclerView.setAdapter(childRecyclerViewAdapter);
    }


}
