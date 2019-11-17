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

public class AvoidActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<SimpleItem> mDataItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avoid);

        data();

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        mRecyclerView.setAdapter(new CustomAdapter());
    }

    private void data() {
        mDataItem = new ArrayList<SimpleItem>();
        mDataItem.add(new SimpleItem("เมนูที่น้องแมวควรหลีกเลี่ยง",
                "เมนูเด็ดของอร่อยหลายเมนูที่เราชอบทานอาจจะเป็นเมนูที่สร้างมื้อแห่งความสุขให้กับเรา แต่รู้หรือเปล่าว่าของอร่อยหลายอย่าง อาจเป็นเมนูให้โทษกับน้องแมวที่เป็นอันตรายถึงตายได้เลยทีเดียวนะ ท่องจำให้ขึ้นใจว่าน้องแมวห้ามกินอะไร เพราะนี่คืออาหารต้องห้ามสำหรับแมว\n" +
                        "\n 1. ลูกเกดและองุ่น - ผลไม้แสนอร่อยที่เป็นของโปรดของหลายๆ คน แต่สำหรับน้องแมวแล้วถ้าเผลอกินองุ่นหรือลูกเกดเข้าไปจะทำให้เกิดภาวะคลื่นไส้ อาเจียน อย่างรุนแรงได้ ถึงอร่อยสำหรับเราแต่น้องแมว>ห้ามกินเลยล่ะ\n" +
                        "\n 2. นมวัวและผลิตภัณฑ์จากนมวัว – อีกหนึ่งอาหารต้องห้ามสำหรับแมวก็คือนมวัวนี่แหละ เพราะน้องแมวมีเอนไซม์ย่อยน้ำตาลในน้ำนมวัวน้อยมาก จึงส่งผลให้เกิดอาการท้องเสีย อาเจียนได้ ซึ่งนอกจากนมวัวแล้วบรรดาผลิตภัณฑ์จากนมวัว ไม่ว่าจะเป็นเนย วิปครีม หรือเนยแข็ง แล้วก็จัดอยู่ในอาหารที่แมวห้ามกินเหมือนกันนะ\n" +
                        "\n 3. กระดูกไก่ –ในลูกสัตว์ที่ฟันยังขึ้นไม่แข็งแรงเต็มที่ไม่ควรให้อาหารจำพวกกระดูกเลย เพราะนอกจากจะย่อยไม่ได้จนทำให้อุดตันระบบทางเดินอาหารแล้ว ในกระดูกจำพวกสัตว์ปีก เช่น ไก่ เมื่อหักแล้วจะมีมุมแหลมคมอาจทิ่มกระเพาะลูกสุนัขหรือลูกแมวทะลุได้\n" +
                        "\n 4. ช็อกโกแลต – ถ้าถามว่าแมวไม่ควรกินอะไร ก็ต้องยกให้ช็อกโกแลตติดโผท็อป 5 อาหารต้องห้ามสำหรับแมวด้วย เพราะในช็อกโกแลต มีสารที่มีชื่อว่า theobromine ซึ่งมีฤทธิ์ให้น้องแมวเกิดภาวะกระวนกระวาย อาเจียน หายใจถี่ ท้องเสีย ไปจนถึงเสียชีวิตได้หากได้รับในปริมาณเพียงไม่กี่มิลลิกรัมเท่านั้น ยิ่งในดาร์คช็อกโกแลตที่มี theobromine เข้มข้นต้องบอกเลยว่าแมวห้ามกินเด็ดขาด\n" +
                        "\n 5. ปลาดิบ – แม้ว่าปลาจะเป็นเนื้อสัตว์ที่ดูเหมาะกับน้องแมวแต่กลับเป็นอาหารที่แมวไม่ควรกิน เพราะการที่น้องแมวกินปลาดิบเป็นระยะเวลานานจะทำให้เกิดภาวะขาดวิตามิน B1 ซึ่งจะทำให้ น้องแมว เบื่ออาหาร ช็อกหมดสติ โคม่า หรือเสียชีวิตได้\n" +
                        "\n 6. ไข่ดิบ – ปัญหาจากการกินไข่ดิบในน้องแมวมีหลักๆ อยู่ 2 เรื่องด้วยกัน เรื่องแรกคือน้องแมวอาจเกิดอาการอาหารเป็นพิษจากเชื้่อแบคทีเรียที่มากับไข่ดิบได้ และเรื่องที่สองก็คือไข่ดิบอาจทำให้น้องแมวมีปัญหาเกี่ยวกับผิวหนัง เพราะสาร avidin ที่อยู่ในไข่ขาว ทำให้ร่างกายน้องแมวดูดซึมวิตามิน บี ที่มีส่วนในการดูแลผิวหนังและขนไม่ได้นั่นเอง ดังนั้นเมนูนี้ห้าม ห้าม ห้าม\n" +
                        "\n 7. อาหารเหลวสำหรับทารก – สำหรับคุณพ่อคุณแม่แมวมือใหม่ที่กำลังมองหาอาหารเหลวๆ มาผลัดเปลี่ยนให้น้องแมวได้ชิมแก้เบื่อขอให้คิดใหม่ เพราะอาหารเหลวสำหรับทารกอาจมีส่วนประกอบของหัวหอมอยู่ ซึ่งส่งผลให้ลูกแมวเกิดภาวะอ่อนเพลีย หัวใจเต้นเร็ว และทำให้เป็นภาวะโลหิตจางได้ ดังนั้นเมนูนี้ก็จัดเป็นเมนูที่แมวไม่ควรกินอีกเช่นกัน\n" +
                        "\n แถมท้ายอีกหนึ่งอย่างสำหรับคำถามที่ว่าน้องแมวห้ามกินอะไร อันนี้สำคัญมากๆ อยากให้จำจนขึ้นใจว่าน้องแมวห้ามกินเด็ดขาดนั่นก็คือ ยาพาราเซตามอล แม้จะเป็นยาสามัญประจำบ้านที่ไม่อันตรายสำหรับคนเรา แต่อันตรายมากๆ ในแมว เพราะพาราเซตามอลเพียง 1 เม็ด จะทำให้เกิดความผิดปกติในระบบเลือด ส่งผลให้แมวหอบ หน้าบวม ไปจนถึงเสียชีวิตได้\n" +
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
