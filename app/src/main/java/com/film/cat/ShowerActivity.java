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

public class ShowerActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shower);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("เราจำเป็นต้องอาบน้ำแมวหรือไม่?",
                "\n หลายคนอาจเคยได้ยินความเชื่อที่ว่าแมวเป็นสัตว์กลัวน้ำ แม้ว่าเราจะรู้ว่าการอาบน้ำนั้นเป็นวิธีในการทำความสะอาดแมว ช่วยกำจัดสิ่งสกปรกที่ผิวหนังได้อย่างดีเยี่ยม แต่ด้วยความที่แมวเองก็ทำท่าไม่อยากจะอาบน้ำสักเท่าไหร่ ทำให้เจ้าของที่เลี้ยงแมวสงสัยว่าแมวต้องอาบน้ำไหม แมวอาบน้ำได้หรือเปล่า ตอบก่อนเลยตรงนี้ว่าเจ้าของสามารถอาบน้ำให้แมวเองได้นะ และวันนี้จะมาบอกวิธีการอาบน้ำแมวยังไงให้น้องแมวสะอาด แถมเจ้าของอย่างเราก็ยังปลอดภัยจากรอยข่วนที่แมวอาจจะฝากไว้ได้อีกด้วย\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("วิธีการอาบน้ำแมว",
                "\n เคล็ดไม่ลับอันดับแรกที่จะทำให้การอาบน้ำแมวผ่านไปได้ด้วยดีคือควรเริ่มฝึกแมวอาบน้ำตั้งแต่ยังเล็ก โดยเริ่มในช่วงอายุที่น้องแมวแข็งแรง ทำวัคซีนครบ และถ่ายพยาธิแล้ว ที่อายุประมาณ 2 เดือน หรือ 8 สัปดาห์ เพื่อให้แมวมีความคุ้นชิน และไม่กลัวการอาบน้ำ โดยเริ่มต้นจากการจับเท้าน้องแมวจุ่มในน้ำอุ่น เพื่อลดความรู้สึกกลัว แล้วค่อยๆ เพิ่มระดับจนอาบน้ำได้ ใครยังไม่แน่ใจว่าจะอาบน้ำแมวยังไงให้ตามสเต็ปนี้มาได้เลย\n" +
                        "\n ประเมินสภาพร่างกายน้องแมว หากพบว่าแมวไม่กินอาหาร ไม่ร่าเริง ซึม ขับถ่ายไม่ปกติ ให้งดการอาบน้ำไปก่อน\n" +
                        "\n •\tก่อนอาบน้ำควรแปรงขนที่พันกันเป็นก้อน และขนที่หลุดร่วงออกก่อน\n" +
                        "\n •\tเตรียมอุปกรณ์ให้พร้อม ไม่ว่าจะเป็น แชมพู ผ้าเช็ดตัว ไดร์เป่าผม\n" +
                        "\n •\tเปิดฝักบัว ใช้ระดับน้ำที่ไม่แรง ค่อยๆ ฉีดไปตามตัว\n" +
                        "\n •\tฟอกแชมพูสำหรับอาบน้ำแมว และระวังอย่าให้ฟองเข้าตา หากไม่มั่นใจสามารถใช้ผ้าเปียกเช็ดหน้าเช็ดตาน้องแมวแทนได้\n" +
                        "\n •\tล้างแชมพูออกให้หมด จากนั้นเช็ดตัวด้วยผ้าสะอาด\n" +
                        "\n •\tเป่าขนให้แห้งสนิท เน้นเป็นพิเศษบริเวณข้อพับต่างๆ เพื่อป้องกันการอับชื้น\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("แมวอาบน้ำบ่อยแค่ไหน",
                "\n ความถี่ในการอาบน้ำแมวนั้นจะต่างของสุนัข เพราะแมวเป็นสัตว์รักสะอาดอยู่แล้ว จึงมักจะเลียตัวแต่งตัวอยู่เสมอ โดยความถี่ที่เหมาะสมในการอาบน้ำแมวคืออาบทุกๆ 1-3 เดือน แต่ถ้าน้องแมวตัวไหนกลัวการอาบน้ำมากๆ อาจเลือกใช้วิธีอื่นในการทำความสะอาด เช่น ใช้ทิชชู่เปียกสำหรับสัตว์เลี้ยงเช็ดตัว หรือใช้แชมพูแห้ง ช่วยในการทำความสะอาดแมวก็ได้เช่นกัน\n" +
                        "\n"));

        mDataItem.add(new SimpleItem("ข้อควรระวังในการอาบน้ำแมว",
                "\n •\tความปลอดภัยของเจ้าของ : สิ่งที่เราต้องคำนึงเสมอเมื่อต้องอาบน้ำแมว ก็คือต้องป้องกันตัวผู้อาบน้ำแมว โดยต้องตัดเล็บน้องแมวให้เรียบร้อย ป้องกันการข่วนผู้อาบจนทำให้เกิดบาดแผล\n" +
                        "\n •\tความปลอดภัยของแมว : อันดับแรกอย่าลืมป้องกันตัวแมว ด้วยการสังเกตความพร้อมทางด้านร่างกายของน้องแมวทุกครั้งก่อนอาบน้ำ ระหว่างการอาบน้ำต้องระวังไม่ให้แชมพูเข้าตา หรือเลือกใช้ผ้าเปียก ทิชชู่เปียกสำหรับสัตว์เลี้ยง เช็ดหน้าเช็ดตาแทนได้ นอกจากนี้ควรเริ่มเป่าขนแมวด้วยไดร์แบบเบาๆ และเป็นลมเย็นก่อน เพื่อลดปัญหาแมวกลัวเสียงไดร์ แต่หากแมวกลัวมากๆ อาจจะใช้การเช็ดตัวให้แห้งมากที่สุด และใช้ไดร์แบบเบาเป็นระยะเวลาสั้นๆ หรือนำแมวใส่กรงแล้วเปิดไดร์เป่าแมวจากนอกกรงก็สามารถทำได้เช่นกัน\n" +
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
