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

public class GrassActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grass);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("แมวกินหญ้าผิดปกติหรือไม่?",
                "\n ต้องตอบว่าการที่แมวกินหญ้าไม่ได้เป็นเรื่องอันตรายร้ายแรง หรือผิดปกติแต่อย่างใด เพราะการกินหญ้าของน้องแมวก็มีข้อดี และมีประโยชน์ต่อร่างกายเหมือนกันนะ\n" +
                        "\n •\tลดปัญหาก้อนขนอุดตัน : ตามธรรมชาติแล้วแมวจัดเป็นสัตว์กินเนื้อ แมวจึงไม่มีเอนไซม์ที่จะช่วยย่อยหญ้าที่กินลงไปโดยตรง นั่นก็หมายความว่าที่จริงแล้วแมวไม่ได้กินหญ้าเพราะต้องการสารอาหาร แต่แมวกินหญ้าเพื่อช่วยในการสำรอกเอาก้อนขนที่เกิดจากการเลียขนทำความสะอาดตัวเองของแมวออกมา และเข้าไปสะสมในระบบทางเดินอาหาร เมื่อแมวกินหญ้าเข้าไปก็จะช่วยลดโอกาสของการเกิดปัญหาก้อนขนอุดตันในระบบทางเดินอาหารได้นั่นเอง\n" +
                        "\n •\tเสริมกรดโฟลิก : ในหญ้ายังมีกรดโฟลิกสูง ซึ่งเป็นประโยชน์ต่อร่างกายแมว เพราะโฟลิกจะช่วยในกระบวนการผลิตฮีโมโกลบิน เพื่อใช้ในการลำเลียงออกซิเจนในร่างกาย\n" +
                        "\n •\tช่วยเป็นยาระบาย : อีกหนึ่งทฤษฎีที่จะตอบคำถามเรื่องแมวกินหญ้า ก็เพราะหญ้ามีกากใย ที่จะช่วยรักษาสมดุลของระบบย่อยอาหารและการขับถ่ายให้ดีขึ้น ปัญหาท้องผูกก็จะไม่มากวนใจให้วุ่นวายกันอีกต่อไป\n" +
                        "\n •\tความชอบส่วนตัว : ในบางครั้ง การที่แมวกินหญ้า ก็ไม่ได้มีเหตุผลทางวิทยาศาสตร์อะไรที่ซับซ้อน เพียงแค่แมวรู้สึกฟินเมื่อได้ชมวิว ชิลล์เมื่อได้แทะหญ้า ด้วยความชื่นชอบในรสชาติ ชอบกลิ่นของหญ้า หรืออยากลองอะไรใหม่ๆ เหตุผลนี้ก็เป็นเรื่องพฤติกรรมแมวแบบส่วนตั๊ว ส่วนตัวนั่นเอง\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("ข้อควรระวังหากแมวกินหญ้า",
                "\n อ่านมาถึงตรงนี้แล้วก็คงจะทราบกันอย่างชัดเจนแล้วว่าการที่แมวกินหญ้า ไม่ใช่เรื่องที่ผิดปกติ หรือเป็นอันตรายต่อร่างกายของแมว พฤติกรรมการกินหญ้าของแมวจึงไม่น่าเป็นห่วงเท่าไหร่นัก แต่ถึงอย่างนั้นเจ้าของอย่างเราก็ต้องคอยสังเกตและระวัง ไม่ให้แมวกินหญ้าในปริมาณที่มากเกินไป เช่น กินหญ้าแทนอาหารทุกมื้อ หรือกินหญ้าที่เลี้ยงไว้จนแทบหมดกระถางในวันเดียว รวมทั้งกินหญ้าทุกวันไม่มีหยุด แบบนี้ไม่ใช่เรื่องปกติ ควรพาน้องแมวไปพบคุณหมอ\n" +
                        "\n ยังไม่มีรายงานถึงชนิดของหญ้าในเมืองไทยที่เป็นอันตรายต่อน้องแมว ดังนั้นจึงควรเลือกให้แมวกินหญ้าอ่อนๆ ไม่แข็งจนเกินไป เพราะอาจระคายเคืองกระเพาะอาหารได้ หรือเลือกเป็นต้นข้าวสาลีอ่อน ต้นไผ่เงิน ให้น้องแมวแทะเล่นเพลินๆ แทน ที่สำคัญต้องระวังไม่ให้แมวไปกินหญ้าที่มีการปนเปื้อนของยาฆ่าแมลงที่เป็นอันตรายต่อร่างกายของแมวด้วยนะ\n" +
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
