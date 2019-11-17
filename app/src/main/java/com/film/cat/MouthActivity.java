package com.film.cat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.film.cat.model.SimpleItem;

import java.util.ArrayList;

public class MouthActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouth);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("ว่าด้วยเรื่องกลิ่นปากของน้องแมว",
                "\n ปัญหาเรื่องกลิ่นปาก ไม่ใช่เรื่องที่เกิดกับคนเราได้เท่านั้น รู้หรือเปล่าปัญหากลิ่นปากก็เกิดได้กับน้องแมวของเราได้เหมือนกัน ที่สำคัญปัญหานี้เป็นเรื่องใกล้ตัวที่น้องแมวเป็นกันมาก จนหลายคนคิดว่าเรื่องแมวปากเหม็นนี้เป็นเรื่องเล็กและละเลยปัญหากลิ่นปากของน้องแมวที่เป็นหนึ่งในสัญญาณที่บ่งบอกว่าน้องแมวกำลังมีความผิดปกติในช่องปากอยู่ หากปล่อยทิ้งไว้ อาจทำให้น้องแมวฟันหลุด เหงือกอักเสบ และมีปัญหาหินปูนตามมา\n" +
                        "\n อย่าปล่อยให้น้องแมวของเรากลายเป็นแมวปากเหม็น และตามมาด้วยสารพันปัญหา มาดูวิธีจัดการปัญหากลิ่นปากของน้องแมวให้ได้ผลกันดีกว่า\n" +
                        "\n"));
        mDataItem.add(new SimpleItem("กลิ่นปากมาจากไหน",
                "\n กลิ่นปากเกิดจากการสะสมของแบคทีเรียในช่องปากจนทำให้น้องแมวปากเหม็นขึ้นมา นอกจากนี้ยังเกิดจากปัญหาของเหงือกและฟัน เช่น ปัญหาหินปูน ซึ่งเกิดจากแบคทีเรียในช่องปากสร้างคราบที่ผิวฟัน รวมทั้งมีแคลเซียมในน้ำลายมาเกาะที่คราบเหล่านี้จนเป็นหินปูน ซึ่งหินปูนนี้เองที่อยู่อาศัยของเชื้อแบคทีเรีย ที่เป็นสาเหตุของเหงือกอักเสบ ฟันหลุด และโรคหัวใจในระยะยาวได้ด้วย\n" +
                        "\n นอกจากนี้กลิ่นปากยังอาจเกิดได้จากช่องปากอักเสบ หรืออาจเกิดได้จากการป่วยเป็นโรคบางชนิด เช่น โรคเบาหวาน โรคไต ที่ทำให้ร่างกายขจัดของเสียออกจากร่างกายได้น้อยลง เกิดของเสียสะสมอยู่ในกระแสเลือดจนเป็นที่มาของกลิ่นปาก ซึ่งต้องรีบพาน้องแมวไปพบคุณหมอเพื่อทำการรักษาโรคโดยด่วน จัดการปัญหาแมวปากเหม็น\n" +
                        "\n การแปรงฟันให้น้องแมวเป็นประจำ จะช่วยป้องกันการเกิดหินปูนและลดกลิ่นปากได้อย่างมีประสิทธิภาพ แต่ต้องค่อยๆ ฝึกน้องแมวให้หัดแปรงฟันตั้งแต่เด็ก จะช่วยให้น้องแมวยอมรับการแปรงฟันง่ายกว่ามาฝึกตอนที่น้องแมวโตแล้ว โดยเริ่มฝึกได้ตั้งแต่ลูกแมวอายุประมาณ 2 เดือน เป็นต้นไป ที่สำคัญต้องใช้ยาสีฟันที่ทำออกมาสำหรับสัตว์เท่านั้น ไม่ควรใช้ยาสีฟันของคนมาแปรงให้กับน้องแมว เพราะน้องแมวอาจมีปัญหาจากการแพ้ฟลูออไรด์ที่เป็นส่วนประกอบในยาสีฟันของคนได้ เริ่มต้นฝึกน้องแมวแปรงฟันด้วยการใช้นิ้วถูที่ฟัน เมื่อน้องแมวยอมให้ใช้นิ้วถูฟันแล้วจึงเริ่มปรับมาใช้ผ้าก๊อซถูฟัน และเมื่อน้องแมวเริ่มชินก็ให้ใช้แปรงสีฟันสําหรับน้องแมวโดยเฉพาะแปรงฟัน หลังจากที่แปรงฟันให้น้องแมวแล้วอย่าลืมให้รางวัลกับน้องแมวด้วยอาหารเม็ดกรุบกรอบแสนอร่อยทุกครั้งด้วย ตรวจสุขภาพช่องปาก\n" +
                        "\n ควรพาน้องแมวไปพบคุณหมอเพื่อตรวจช่องปากอย่างน้อยปีละ 1 – 2 ครั้ง เพื่อประเมินสุขภาพเหงือกและฟัน หากเกิดปัญหาที่เรานึกไม่ถึง จะได้แก้ไขได้ทันท่วงที\n" +
                        "\n"));
    }

    private class CustomAdapter extends RecyclerView.Adapter<CustomHolder> {
        @NonNull
        @Override
        public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
            return new CustomHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
            holder.tvText1.setText(mDataItem.get(position).getText1());
            holder.tvText2.setText(mDataItem.get(position).getText2());
        }

        @Override
        public int getItemCount() {
            return mDataItem.size();
        }
    }

    private class CustomHolder extends RecyclerView.ViewHolder {
        private final TextView tvText1;
        private final TextView tvText2;

        public CustomHolder(@NonNull View itemView) {
            super(itemView);

            tvText1 = (TextView) itemView.findViewById(android.R.id.text1);
            tvText2 = (TextView) itemView.findViewById(android.R.id.text2);
        }
    }
}
