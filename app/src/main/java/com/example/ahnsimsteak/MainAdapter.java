package com.example.ahnsimsteak;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.CustomViewHolder> {

    private ArrayList<MainData> arraylist; // MainData를 리스트배열 arraylist에 넣음

    public MainAdapter(ArrayList<MainData> arraylist) { // 생성자
        this.arraylist = arraylist;
    }

    @NonNull // null을 허용하지 않는다.
    @Override
    public MainAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // ViewHolder와 레이아웃 파일을 연결해주는 역할

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view); // View를 가져온다.

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        // 뷰 홀더가 필요한 위치에 할당 될 때 호출
        // 실제 각 뷰 홀더에 데이터를 연결해주는 함수

        holder.iv_profile.setImageResource(arraylist.get(position).getIv_profile()); // 이미지뷰를 생성 한 것을 가져옴
        holder.tv_name.setText(arraylist.get(position).getTv_name());
        holder.tv_content.setText(arraylist.get(position).getTv_content());
        holder.avg.setText(arraylist.get(position).getAvg());

        holder.itemView.setTag(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), review_add.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (null != arraylist ? arraylist.size() : 0);
    } // arraylist가 null이 아닐 경우 arraylist.size() 반환


    public void remove(int position) {
        try { // 예외사항이 생겨도 강제실행
            arraylist.remove(position);
            notifyItemRemoved(position); // 새로고침
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        protected ImageView iv_profile;
        protected TextView tv_name;
        protected TextView tv_content;
        protected TextView avg;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv_profile = (ImageView) itemView.findViewById(R.id.iv_profile);
            this.tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            this.tv_content = (TextView) itemView.findViewById(R.id.tv_content);
            this.avg = (TextView) itemView.findViewById(R.id.avg);
        }
    }
}
