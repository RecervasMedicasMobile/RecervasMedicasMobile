package com.example.reservasmedicasmobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class TurnoAdapter extends RecyclerView.Adapter<TurnoAdapter.TurnoViewHolder> {

    private ArrayList<TurnoDTO> turnosList;

    public TurnoAdapter(ArrayList<TurnoDTO> turnosList) {
        this.turnosList = turnosList;
    }

    @NonNull
    @Override
    public TurnoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_turnos, parent, false);
        return new TurnoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TurnoViewHolder holder, int position) {
        TurnoDTO turno = turnosList.get(position);
        holder.fechaTextView.setText(turno.getFecha());
        holder.medicoTextView.setText(turno.getMedico());
    }

    @Override
    public int getItemCount() {
        return turnosList.size();
    }

    public static class TurnoViewHolder extends RecyclerView.ViewHolder {
        TextView fechaTextView, medicoTextView;

        public TurnoViewHolder(@NonNull View itemView) {
            super(itemView);
            fechaTextView = itemView.findViewById(R.id.text_view_fecha);
            medicoTextView = itemView.findViewById(R.id.text_view_medico);
        }
    }
}
