package com.vinnorman.myprojectsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {

    private Project[] projects;

    public ProjectsAdapter(Project[] projects) {
        this.projects = projects;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        private TextView descriptionTextView;
        private ImageView imageView;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view);
            descriptionTextView = itemView.findViewById(R.id.description_text_view);
            imageView = itemView.findViewById(R.id.image_view);
        }

        private void bind(Project project) {
            textView.setText(project.name);
            descriptionTextView.setText(project.descritpion);
            imageView.setImageResource(project.image);
        }

    }
}

