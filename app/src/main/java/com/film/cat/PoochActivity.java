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

public class PoochActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pooch);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("โรคพิษสุนัขบ้า โรคอันตรายที่แมวก็เป็นได้",
                "\n เมื่อเข้าสู่หน้าร้อน หลายๆ คนคงนึกถึงโรคอันตรายที่ระบาดหนักอยู่แทบจะทุกปีอย่างโรคพิษสุนัขบ้า หรือโรคกลัวน้ำ แม้จะได้ชื่อว่าเกี่ยวกับสุนัข แต่เจ้าของน้องแมวก็อย่าเพิ่งวางใจไป เพราะโรคพิษสุนัขบ้านี้สามารถติดต่อมาสู่น้องแมวได้ และที่สำคัญคือสามารถติดต่อมาสู่คน รวมทั้งยังติดต่อไปยังสัตว์เลี้ยงลูกด้วยนมชนิดอื่นๆ ด้วย ไม่ว่าจะเป็นน้องแมว หรือคนที่ติดโรคนี้ เชื้อไวรัสจะก่อให้เกิดอันตรายจนถึงแก่ชีวิตได้ มารู้จักโรคพิษสุนัขบ้าในแมวและป้องกันอย่างถูกวิธีไปพร้อมๆ กัน ให้ครอบครัวอุ่นใจ ห่างไกลจากภัยโรคพิษสุนัขบ้ากันดีกว่า\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("โรคพิษสุนัขบ้าติดต่อได้อย่างไร?",
                "\n เชื้อไวรัส “โรคพิษสุนัขบ้า” สามารถติดต่อผ่านทางน้ำลายสัตว์ป่วย เช่น การกัด ข่วน หรือเลียบริเวณบาดแผล ทำให้เชื้อไวรัสในน้ำลายจะเข้าสู่บาดแผล โรคนี้สามารถติดต่อได้ในสัตว์เลี้ยงลูกด้วยนม ดังนั้นไม่ว่าจะเป็นคน สุนัข หรือแมว ก็สามารถเป็นโรคพิษสุนัขบ้าได้ นอกจากนี้ยังพบว่ามีการติดเชื้อในสัตว์ป่า เช่น ค้างคาว ลิง สุนัขจิ้งจอก ได้ด้วยเช่นกัน\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("สัญญาณอันตรายต้องสังเกต",
                "\n หากติดเชื้อไวรัสโรคพิษสุนัขบ้าในแมว เชื้อไวรัสจะเข้าทำลายระบบประสาท โดยเมื่อแมวที่ป่วยด้วยโรคพิษสุนัขบ้าแสดงอาการออกมาแล้วก็มักจะทำให้สัตว์ที่ป่วยเสียชีวิตภายใน 10 วัน อาการของโรคแบ่งออกได้เป็น 3 ระยะ ในระยะเริ่มต้นจะดูคล้ายอาการป่วยทั่วๆ ไป เช่น ซึม มีไข้ โดยกินระยะเวลาประมาณ 2-3 วัน จากนั้นจะเข้าสู่ระยะตื่นเต้น โดยจะมีอาการกระวนกระวาย หงุดหงิด พฤติกรรมเปลี่ยนไป และสุดท้ายจะเข้าสู่ระยะอัมพาต โดยจะพบว่าโรคพิษสุนัขบ้าในแมวจะทำให้มีการทรงตัวผิดปกติ กลืนลำบาก ร่างกายบางส่วนหรือทั่วทั้งตัวเป็นอัมพาต น้ำลายไหลมาก จะเห็นว่ามีอาการคล้ายกลัวน้ำในระยะนี้\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("ป้องกันก่อนสาย",
                "\n โรคร้ายป้องกันได้ด้วยการทำวัคซีน โดยเริ่มทำวัคซีนเข็มแรกที่อายุประมาณ 3 เดือน เข็มที่ 2 เมื่ออายุ 6 เดือน และทำการกระตุ้นวัคซีนเป็นประจำทุกปี หากสงสัยว่าน้องแมวป่วยด้วยโรคพิษสุนัขบ้า ควรรีบพาไปพบสัตวแพทย์ทันที และแจ้งข้อมูลต่างๆ ด้านสุขภาพ เช่น ประวัติการทำวัคซีน ประวัติการดูแลสุขภาพ ลักษณะการเลี้ยงให้ครบถ้วนเพื่อให้คุณหมอทำการตรวจวินิจฉัยต่อไปได้\n" +
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
