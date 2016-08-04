package com.bupt.edison.androidmaterialdesignwidget.controller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bupt.edison.androidmaterialdesignwidget.R;

import java.util.List;

/**
 * Created by edison on 16/8/4.
 */
public class AppInfoRecyclerAdapter extends RecyclerView.Adapter<AppInfoRecyclerAdapter.ViewHolder> {
    List<ApplicationInfo> appList;
    Context context;

    public AppInfoRecyclerAdapter(List<ApplicationInfo> appList, Context context) {
        super();
        this.appList = appList;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return appList.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.appImage.setImageDrawable(appList.get(position).loadIcon(context.getPackageManager()));
        holder.appName.setText(appList.get(position).loadLabel(context.getPackageManager()));
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_recycler_view_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView appImage;
        TextView appName;

        public ViewHolder(View itemView) {
            super(itemView);
            appImage = (ImageView)itemView.findViewById(R.id.image);
            appName = (TextView)itemView.findViewById(R.id.name);
        }
    }
}
