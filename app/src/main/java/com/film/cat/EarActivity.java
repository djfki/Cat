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

public class EarActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ear);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("การทำความสะอาดหูของน้องแมว",
                "\n ถึงแม้น้องแมวจะมีนิสัยรักสวยรักงาม ปลื้มความสะอาด คอยเลียขนแต่งตัวอยู่เป็นประจำก็ตาม แต่ก็อย่าเผลอละเลยจุดสำคัญที่น้องแมวทำความสะอาดได้ไม่ถึง และเป็นจุดที่หลายๆคนมักมองข้ามอย่างความสะอาดของ “ช่องหู”ด้วยนะ เพราะการทำความสะอาดหูแมวจากภายนอกอย่างเดียว อาจไม่เพียงพอ เราจึงควรเช็คหูแมวอย่างน้อยเดือนละ 1 ครั้ง เพื่อลดโอกาสที่จะเกิดปัญหาเกี่ยวกับช่องหูตามมา\n" +
                        "\n สำหรับน้องแมวที่มีใบหูตั้งเปิด อาจจะไม่มีปัญหาเกี่ยวกับความสกปรกของหูมากนัก เพราะช่องหูสามารถผลิตขี้หูและขับออกมาได้ง่ายกว่าน้องแมวสายพันธุ์ที่มีใบหูพับอย่าง สก็อตติชโฟลด์ ที่มีใบหูปิดพับ ซึ่งอาจจะมีการสะสมของขี้หูและเกิดปัญหาช่องหูภายนอกอักเสบตามมาได้ การทำความสะอาดหูแมวจึงเป็นการช่วยลดปัญหาต่างๆ ที่อาจเกิดกับช่องหูน้องแมวและยังทำให้เจ้าของที่เช็ดหูแมวได้สังเกตสี กลิ่น ลักษณะของขี้หู เป็นประจำ หากเกิดความผิดปกติจะได้รีบพาน้องแมวไปพบคุณหมอ และรักษาได้อย่างทันท่วงที\n" +
                        "\n นอกจากนี้การทำความสะอาดหูแมว ยังเป็นการจัดการและป้องกันปัญหาไรในหูที่ดีอีกวิธีหนึ่ง ปัญหาไรในหูที่ดูเป็นเรื่องเล็ก แต่ก็เป็นอีกหนึ่งสาเหตุสำคัญที่ทำให้เกิดปัญหาหูอักเสบ และเกิดการติดเชื้อแทรกซ้อนในช่องหู เช่น ยีสต์ ตามมาได้ น้องแมวที่มีปัญหาไรในหูจะมีอาการคันหูรุนแรง ขี้หูมีสีดำ และมีกลิ่นเหม็น ใบหูแดงอักเสบ หากมีการติดเชื้อเข้าไปยังหูชั้นกลาง หรือหูชั้นใน ก็อาจทำให้มีปัญหาเกี่ยวกับระบบประสาทได้อีกด้วย ดังนั้นการมีหูที่สะอาดจึงเป็นส่วนสำคัญที่จะช่วยลดโอกาสการเกิดปัญหาร้ายแรงเกี่ยวกับช่องหูที่อาจเกิดกับน้องแมวของเราได้นั่นเอง\n" +
                        "\n มาเริ่มเช็ดหูแมวด้วยตัวคุณเอง ด้วยวิธีง่ายๆ ในการทำความสะอาดหูแมว เพียงแค่เตรียมน้ำยาล้างหูสำหรับสัตว์เลี้ยงโดยเฉพาะ (สามารถสอบถามได้จากสัตวแพทย์) สำลี และเตรียมใจของคุณให้พร้อม จากนั้นมาเริ่มกันได้เลย\n" +
                        "\n  1. จัดน้องแมวให้อยู่ในท่านั่งสบาย\n" +
                        "\n  2. ค่อยๆ เปิดหูน้องแมว แล้วเทน้ำยาสำหรับทำความสะอาดหูน้องแมวเข้าไปในช่องหูเล็กน้อย ให้น้ำยาล้างหูท่วมภายในช่องหู\n" +
                        "\n  3. จับใบหูเอาไว้ แล้วเลื่อนมือไปนวดคลึงที่บริเวณโคนหู เพื่อให้สิ่งสกปรกในช่องหูละลายออกมากับน้ำยาล้างหู\n" +
                        "\n  4. หลังจากนวดประมาณ 20 วินาที ให้ปล่อยมือออก\n" +
                        "\n  5. ปล่อยให้น้องแมวสบัดหัวเพื่อเอาน้ำยาล้างหูออก\n" +
                        "\n  6. ใช้สำลีซับน้ำยาที่อยู่บริเวณช่องหูส่วนนอก และบริเวณใบหูออกไปจนสะอาด ไม่มีคราบน้ำยา\n" +
                        "\n  7. ชมน้องแมวเป็นกำลังใจสักหน่อย จากนั้นมาเริ่มที่หูอีกข้างได้เลย\n" +
                        "\n ไม่ต้องกังวลว่าหากเช็ดน้ำยาออกมาไม่หมดจะเป็นอันตราย เพราะน้องแมวจะสะบัดหู เอาน้ำยาล้างหูที่ค้างอยู่ออกมาได้เอง แต่ไม่ควรเช็ดหูน้องแมวลึกเกินไป เพราะอาจจะระคายหูส่วนใน ใช้สำลีเช็คทำความสะอาดน้ำยาเช็ดหูที่ติดรอบๆ ใบหูและช่องหูด้านนอกก็เพียงพอแล้ว\n" +
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
